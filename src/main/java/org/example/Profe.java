package org.example;

public class Profe extends Persona{
    private String asignatura;

    Profe(){
        // llamar al constructor de la clase madre
        super();
        // inicializar los atributos de la clase hija
        this.asignatura = "";
    }

    public Profe(String nombre, String apellidos, String asignatura) {
        super(nombre, apellidos);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Profe{" +
                "nombre='" + getNombre() + "', " +
                "apellidos='" + getApellidos() + "', " +
                "asignatura='" + asignatura + "'" +
                '}';
    }
}
