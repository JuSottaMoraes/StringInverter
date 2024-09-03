/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringinverter;

import java.util.Scanner;

public class StringInverter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = "Exemplo de string";
            System.out.print("Digite uma string para inverter: ");
            str = scanner.nextLine();
            
            String invertedStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                invertedStr += str.charAt(i); // Adiciona o caractere na nova string
            }
            
            // Exibindo o resultado
            System.out.println("String invertida: " + invertedStr);
        }
    }
}

