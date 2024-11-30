/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listavetores8;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class ListaVetores8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int acimaDaMedia = 0;
        int[] notas = new int[20];
        
        System.out.println("Digite as notas dos 20 alunos:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
            soma += notas[i];
        }
        
        int media = soma / 20;

        for (int i = 0; i < 20; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("Média da turma: " + media);
        System.out.println("Número de alunos com nota acima da média: " + acimaDaMedia);
    }
}