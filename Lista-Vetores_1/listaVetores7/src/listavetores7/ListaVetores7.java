/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listavetores7;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class ListaVetores7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10]; 

        System.out.println("Digite os nomes das 10 pessoas:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite mais um nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;
        for (String nome : nomes) { // utilizando a for-each
            if (nome.equalsIgnoreCase(nomeBusca)) { 
                encontrado = true;
                break;
            }
        }
      
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }
}

      
