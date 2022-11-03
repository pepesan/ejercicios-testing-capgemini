package org.example;

public class Currito extends Empleado{
    private String departamento;

    public Currito() {
        super();
        this.departamento = "";
    }

    public Currito(String nombre, String dni, String tlf, Float sueldo, String rango, String departamento) {
        super(nombre, dni, tlf, sueldo, rango);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Currito{" +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", tlf='" + getTlf() + '\'' +
                ", sueldo=" + getSueldo() +
                ", rango='" + getRango() + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
