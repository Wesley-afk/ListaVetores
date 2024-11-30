/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listavetores10;

import java.util.Scanner;

/**
 *
 * @author wpass
 */
public class ListaVetores10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] Q = new int[20];
        int maior, menor;

        System.out.println("Digite 20 números positivos:");
     
        Q[0] = scanner.nextInt();
        maior = menor = Q[0];

        
        for (int i = 1; i < 20; i++) {
            Q[i] = scanner.nextInt();
            if (Q[i] > maior) maior = Q[i]; 
            if (Q[i] < menor) menor = Q[i]; 
        }

        System.out.println("O maior valor do vetor é " + maior);
        System.out.println("O menor valor do vetor é " + menor);

        scanner.close();
    }
}