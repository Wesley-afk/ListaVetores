/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listavetores11;

import java.util.Scanner;

/**
 *
 * @author wpass
 */
public class ListaVetores11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] M = new int[10];
        int X;

        System.out.println("Digite 10 números inteiros");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor que vai ser multiplicado ");
        X = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            M[i] = A[i] * X;
        }

        System.out.println("Multiplicação:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Multiplicando " + A[i] + " x " + X + " = " + M[i]);
        }
    }
}
