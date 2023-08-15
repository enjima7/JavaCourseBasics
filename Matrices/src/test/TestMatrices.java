package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades [0][0] = 5;
        edades [0][1] = 7;
        edades [1][0] = 8;
        edades [1][1] = 4;
        
        System.out.println("edades 0-0= " + edades[0][0]);
        
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("Edades  "+ ren+"-"+col+": "+edades[ren][col]);
            }
        }
        
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa","Zarzamora"}};
        for (int ren = 0; ren < frutas.length; ren++) {
            for (int col = 0; col < frutas[ren].length; col++) {
                System.out.println("Fruta: "+frutas[ren][col]);
            }
        }
        
        Persona personas[][] = new Persona[2][3];
        imprimir(frutas);
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz: "+matriz[ren][col]);
            }
        }
    }
}