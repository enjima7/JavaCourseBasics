package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        //modificar
        //Persona modificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@mail.com", "1122334455");
       // personaDao.actualizar(modificar);
       
       //agregar
      //  Persona nuevaPersona = new Persona("Carlos", "Esparza", "cesparza@mail.com", "1122334455");
      //  personaDao.insertar(nuevaPersona);
      
      //eliminar
      Persona eliminar = new Persona(4);
      personaDao.eliminar(eliminar);
      
        List<Persona> personas = personaDao.seleccionar();
        
        personas.forEach(persona -> {
            System.out.println(persona);
        });
    }
    
}
