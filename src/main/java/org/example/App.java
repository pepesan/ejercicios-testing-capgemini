package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Persona p = new Persona();
        System.out.println(p.getNombre());
        System.out.println(p.getApellidos());
        p = new Persona("Ana", "Domenech");
        System.out.println(p.getNombre());
        System.out.println(p.getApellidos());
        Profe profe = new Profe();
        System.out.println(profe.getNombre());
        System.out.println(profe.getApellidos());
        profe.setAsignatura("Testing");
        System.out.println(profe.getAsignatura());
        profe = new Profe("David", "Vaquero", "Testing");
        System.out.println(profe.getNombre());
        System.out.println(profe.getApellidos());
        System.out.println(profe.getAsignatura());
        System.out.println(profe.toString());
    }
}
