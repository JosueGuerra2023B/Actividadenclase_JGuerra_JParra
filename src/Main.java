import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Datos[] datos = new Datos[3];

        int opcion;
        do {
            System.out.println(" ");
            System.out.println(" SISTEMA DE CALIFICACIONES");
            System.out.println("---------------------------");
            System.out.println("1. Ingresar al sistema");
            System.out.println("2. Salir del sistema");
            opcion = scanner.nextInt();
            System.out.println("---------------------------");
            switch (opcion) {
                case 1:
                    datos = ingresardatos(scanner, datos);
                    break;
                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida, Inserte de nuevo: ");
            }

        } while (opcion != 2);
    }

    public static Datos[] ingresardatos(Scanner scanner, Datos[] datos) {
        int opcion1;
        do {
            System.out.println("-------------------------------");
            System.out.println("1. Insertar datos y notas");
            System.out.println("2. Mostrar datos y notas");
            System.out.println("3. Modificar datos y notas");
            System.out.println("4. Mostrar estadisticas");
            System.out.println("5. Eliminar datos y notas");
            opcion1 = scanner.nextInt();
            System.out.println("--------------------------------");
            switch (opcion1) {
                case 1:
                    datos = registrarDatos(datos);
                    break;
                case 2:
                    mostrar(datos);
                    break;
                case 3:
                    modificar(scanner, datos);
                    break;
                case 4:
                    calcularEstadisticas(datos);
                    break;
                case 5:
                    eliminar(scanner, datos);
                    break;
                default:
                    System.out.println("Opcion no valida, Inserte de nuevo: ");
            }
        } while (opcion1 != 4);

        return datos;
    }

    public static Datos[] registrarDatos(Datos[] datos) {
        Datos[] datoss = new Datos[datos.length + 1];

        System.arraycopy(datos, 0, datoss, 0, datos.length);

        System.out.println("-------------------------------------");
        System.out.println("Ingresando datos...");

        // Datos quemados
        String[] nombres = {"Juan", "María", "Carlos"};
        String[] apellidos = {"Pérez", "Gómez", "López"};
        String[] cedulas = {"1111111", "2222222", "3333333"};
        int[] edades = {20, 22, 21};
        boolean[] masculinos = {true, false, true};
        String[] materias = {"Matemáticas", "Historia", "Ciencias"};
        double[] notas = {85.5, 78.3, 92.0};

        for (int i = 0; i < nombres.length; i++) {
            datoss[i] = new Datos(nombres[i], apellidos[i], edades[i], cedulas[i], masculinos[i], materias[i], notas[i]);
        }

        System.out.println("Datos ingresados correctamente");

        return datoss;
    }

    public static void mostrar(Datos[] datos) {
        if (datos.length == 0) {
            System.out.println("Datos no encontrados");
        } else {
            System.out.println("Listado de estudiantes");
            for (Datos dato : datos) {
                if (dato != null) {
                    dato.mostrarDetallesBasicos();
                    System.out.println("-------------------------------");
                }
            }
        }
    }

    public static void modificar(Scanner scanner, Datos[] datos) {
        if (datos.length == 0) {
            System.out.println("Datos no encontrados");
        } else {
            System.out.println("Listado de estudiantes");
            int opcion;
            for (opcion = 0; opcion < datos.length; ++opcion) {
                if (datos[opcion] != null) {
                    System.out.println(opcion + 1 + "." + datos[opcion].nombre);
                }
            }
            System.out.println("Ingrese el número del estudiante (Ingrese 0 para salir: ");
            opcion = scanner.nextInt();
            System.out.println("--------------------------------------------------------");
            System.out.println(" ");
            if (opcion == 0) {
                int indice = datos.length - 1;
                System.out.println("Ingrese la nueva nota: ");
                double nota = scanner.nextDouble();
                datos[indice] = datos[indice - 1];
                datos[indice].mostrarNotas();
            } else {
                System.out.println("Número de estudiante no válido");
            }
        }
    }

    public static void eliminar(Scanner scanner, Datos[] datos) {
        if (datos.length == 0) {
            System.out.println("Datos no encontrados");
        } else {
            System.out.println("Listado de estudiantes");
            int opcion;
            for (opcion = 0; opcion < datos.length; ++opcion) {
                if (datos[opcion] != null) {
                    datos[opcion].mostrarDetallesBasicos();
                    System.out.println(opcion + 1 + "." + datos[opcion].nombre);
                }
            }
            System.out.println("Ingrese el número de estudiante que desea eliminar: ");
            opcion = scanner.nextInt();
            System.out.println("-----------------------------------------------------------");
            System.out.println(" ");
            if (opcion == 0) {
                int indice = datos.length - 1;
                System.out.println("¿Está seguro de eliminar al estudiante " + datos[indice].nombre + "? (S/N)");
                datos[indice] = null;
                System.out.println("Datos eliminados correctamente");
            }
        }
    }

    public static void calcularEstadisticas(Datos[] datos) {
        if (datos.length == 0) {
            System.out.println("No hay datos para calcular estadísticas.");
        } else {
            double notaMinima = Double.MAX_VALUE;
            double notaMaxima = Double.MIN_VALUE;
            double sumaNotas = 0;

            for (Datos dato : datos) {
                if (dato != null) {
                    double nota = dato.getNota();
                    sumaNotas += nota;
                    if (nota < notaMinima) {
                        notaMinima = nota;
                    }
                    if (nota > notaMaxima) {
                        notaMaxima = nota;
                    }
                }
            }

            double promedio = sumaNotas / datos.length;
            System.out.println("Estadísticas:");
            System.out.println("Nota mínima: " + notaMinima);
            System.out.println("Nota máxima: " + notaMaxima);
            System.out.println("Promedio: " + promedio);
            System.out.println("Calificación total: " + sumaNotas);
        }
    }
}
