/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcaseexercicios;

/**
 *
 * @author user
 */
import java.util.Scanner ;
public class SwitchCaseExercicios {

    public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
       System.out.println("Digite um número que seja 1, 2 ou 3 e mostrarei a fruta correspondente.");
       int numerofruta = scanner.nextInt();
       
       switch (numerofruta) {
          
          case 1 -> System.out.println("A fruta correspondente é a maça");
          case 2 -> System.out.println("A fruta correspondente é a banana");
          case 3 -> System.out.println("A fruta correspondente é a laranja");
          default -> System.out.println("Não há fruta correspondente.");
         
      } catch ( Exeption e) {
          System.out.println(" valor inválido");
      }
       scanner.close();
       
       
      }         
  }
}
