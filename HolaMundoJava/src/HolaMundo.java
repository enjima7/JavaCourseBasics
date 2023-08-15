
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Mi clase en java
/**
 *
 * @author enriq
 */
public class HolaMundo {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 1 y 10: ");
        int calif = scan.nextInt();
        
        switch (calif) {
            case 10, 9 -> System.out.println("A");
            case 8 ->  System.out.println("B");
            case 7 -> System.out.println("C");
            case 6 -> System.out.println("D");
            default -> System.out.println("F");
        }
    }
}
