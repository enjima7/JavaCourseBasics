/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author enriq
 */
public class Persona extends Object {
    public String nombre;
    public String apellido;
    
    public void desplegarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
    
}
