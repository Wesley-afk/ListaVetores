/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listavetores1;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class ListaVetores1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int vetor[] = new int[50];

        
        for (int i = 0; i < 50; i++) {
            vetor[i] = i + 1;
        }
        
        for (int i = 0; i < 50; i++) {
            System.out.println(vetor[i]);
        }
    }
    
}
