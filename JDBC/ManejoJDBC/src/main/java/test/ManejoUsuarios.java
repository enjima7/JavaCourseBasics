package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class ManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        //Agregar
       // usuarioDao.insertar(new Usuario("kikin", "kikon"));
       // usuarioDao.insertar(new Usuario("keken", "kikin"));
       usuarioDao.insertar(new Usuario("kakin", "kekon"));
        
        List<Usuario> usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println("usuario: " + usuario);
        });
        
        usuarioDao.actualizar(new Usuario("koko", "kokun", 1));
        usuarioDao.eliminar(new Usuario(2));
        
        System.out.println("Nuevos");
        List<Usuario> usuarios2 = usuarioDao.seleccionar();
        usuarios2.forEach(usuario -> {
            System.out.println("usuario: " + usuario);
        });
    }
}
