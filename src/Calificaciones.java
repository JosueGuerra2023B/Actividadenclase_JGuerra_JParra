public class Calificaciones {
    String materia;
    Double nota;
    Double nminima;
    Double nmaxima;
    double caflificacion;
    boolean aprobado;

    public Calificaciones() {
    }

    public Calificaciones(String materia, Double nota, Double nminima, Double nmaxima, double caflificacion, boolean aprobado) {
        this.materia = materia;
        this.nota = nota;
        this.nminima = nminima;
        this.nmaxima = nmaxima;
        this.caflificacion = caflificacion;
        this.aprobado = aprobado;
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
}
