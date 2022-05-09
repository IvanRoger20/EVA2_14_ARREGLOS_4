/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_arreglos_4;

import java.util.Scanner;

/**
 *
 * @author IvanTron
 */
public class EVA2_14_ARREGLOS_4 {
    public static final int TAMA = 50;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloEdad = new int[TAMA];
        System.out.println("Tamaño de arregloEdad: " + arregloEdad.length);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 32; i++) {
            System.out.println("Cual es tu edad?");
            arregloEdad[i] = input.nextInt();
        }
        
        for (int i = 0; i < 32; i++) {
            System.out.print("[" + arregloEdad[i] + "]");
        }
    }
    
}
