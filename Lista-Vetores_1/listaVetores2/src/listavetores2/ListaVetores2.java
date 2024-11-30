/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listavetores2;

import java.util.Scanner;

/**
 *
 * @author wpass
 */
public class ListaVetores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int vetor[] = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 100 - i;
        }

        // Exibindo os valores armazenados no vetor
        System.out.println("Números de 100 a 1 armazenados no vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
