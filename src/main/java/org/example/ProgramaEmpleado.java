package org.example;

public class ProgramaEmpleado {
    public static void main(String[] args) {
        Empleado e = new Empleado();
        e.setNombre("Marta");
        e.setDni("0987765655A");
        e.setTlf("986712323");
        e.setSueldo(16000F);
        e.setRango("Junior Tester");
        System.out.println(e);
        Empleado e2 = new Empleado(
                "Blanca",
                "08998765A",
                "958123456",
                16000F,
                "Junior Tester");
        System.out.println(e2);
        Currito currito = new Currito();
        currito.setDepartamento("Testing");
        System.out.println(currito.getDepartamento());
        System.out.println(currito);
        Jefe jefe = new Jefe();
        jefe.setGenteACargo(12);
        System.out.println(jefe.getGenteACargo());
        System.out.println(jefe);
    }
}
