public class Datos {
    String nombre;
    String apellido;
    int edad;
    String cedula;
    boolean sexo;
    String materia;
    Double nota;
    Double nminima;
    Double nmaxima;
    double caflificacion;
    boolean aprobado;

    public Datos(String nombre, String apellido, int edad, String cedula, boolean masculino, String materia, double nota) {
    }

    public Datos(String nombre, String apellido, int edad, String cedula, boolean sexo, String materia, Double nota, Double nminima, Double nmaxima, double caflificacion, boolean aprobado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        this.materia = materia;
        this.nota = nota;
        this.nminima = nminima;
        this.nmaxima = nmaxima;
        this.caflificacion = caflificacion;
        this.aprobado = aprobado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Double getNminima() {
        return nminima;
    }

    public void setNminima(Double nminima) {
        this.nminima = nminima;
    }

    public Double getNmaxima() {
        return nmaxima;
    }

    public void setNmaxima(Double nmaxima) {
        this.nmaxima = nmaxima;
    }

    public double getCaflificacion() {
        return caflificacion;
    }

    public void setCaflificacion(double caflificacion) {
        this.caflificacion = caflificacion;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public void mostrarDetallesBasicos() {
        System.out.println("Nombre: " + this.nombre + " " + "Apellido: " + this.apellido);
        System.out.println("Edad: " + this.edad);
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Materia: " + this.materia);
    }
    public void mostrarNotas() {
        System.out.println("Nombre: " + this.nombre );
        System.out.println("Nota: " + this.nota);
        System.out.println("Aprobado: " + this.aprobado);

    }
}

