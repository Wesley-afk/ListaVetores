/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listavetores3;

/**
 *
 * @author wpass
 */
public class ListaVetores3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vetor = new int[50]; 
        int inte = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { 
                vetor[inte] = i;
                inte++;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
 
    
 