package org.example;

public class Jefe extends Empleado{
    private Integer genteACargo;

    public Jefe() {
        super();
        this.genteACargo = 0;
    }

    public Jefe(String nombre, String dni, String tlf, Float sueldo, String rango, Integer genteACargo) {
        super(nombre, dni, tlf, sueldo, rango);
        this.genteACargo = genteACargo;
    }

    public Integer getGenteACargo() {
        return genteACargo;
    }

    public void setGenteACargo(Integer genteACargo) {
        this.genteACargo = genteACargo;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", tlf='" + getTlf() + '\'' +
                ", sueldo=" + getSueldo() +
                ", rango='" + getRango() + '\'' +
                ", genteACargo=" + genteACargo +
                '}';
    }
}
