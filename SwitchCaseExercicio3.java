/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcaseexercicio3;

/**
 *
 * @author user
 */
import java.util.Scanner ;
public class SwitchCaseExercicio3 {

    public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
       System.out.println("Digite um número de 1 a 7 e mostrarei o dia correspondente.");
       int semanadia= scanner.nextInt();
       
       switch (semanadia) {
          
          case 1 -> System.out.println("Domingo");
          case 2 -> System.out.println("Segunda");
          case 3 -> System.out.println("Terça");
          case 4 -> System.out.println("Quarta");
          case 5 -> System.out.println("Quinta");
          case 6 -> System.out.println("Sexta");
          case 7 -> System.out.println("Sábado");
          default -> System.out.println("Dia não compatível");
         
      } catch(Exeption e) {

          System.out.println("valor inválido");
      }
       
       scanner.close();
       
      }         
  }
}
