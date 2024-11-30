/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listavetores12;

import java.util.Scanner;

/**
 *
 * @author wpass
 */
public class ListaVetores12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        System.out.println("Digite 20 números:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números reversos:");
        for (int i = 19; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}