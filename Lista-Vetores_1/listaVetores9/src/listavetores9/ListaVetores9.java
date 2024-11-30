/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listavetores9;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class ListaVetores9 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] Q = new int[20];
        int maior = 0;
        int posicaoMaior = -1;

        
        System.out.println("Digite 20 números positivos:");
        for (int i = 0; i < 20; i++) {
            int num;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                num = scanner.nextInt();
                if (num <= 0) {
                    System.out.println("Por favor, insira um número positivo.");
                }
            } while (num <= 0); 

            Q[i] = num;

            if (i == 0) {
                maior = num;
                posicaoMaior = i; 
            } else {
                if (num > maior) {
                    maior = num;
                    posicaoMaior = i;
                }
            }
        }

        System.out.println("O maior valor do vetor é " + maior);
        System.out.println("Posição ocupada: " + (posicaoMaior + 1));
    }
}