package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        persona1.setNombre("Juan Carlos");
        
      //  System.out.println("Persona1 nombre: "+ persona1.getNombre());
        System.out.println(persona1);
    }
}
