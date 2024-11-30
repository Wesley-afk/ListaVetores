/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listavetores4;

/**
 *
 * @author wpass
 */
public class ListaVetores4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[10]; 
        int index = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) { 
                vetor[index] = i * i; 
                index++;
            }
        }

        System.out.println("Quadrados dos números ímpares de 1 a 20:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
