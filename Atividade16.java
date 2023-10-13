//Faça um programa que receba várias idades,
// calcule e mostre a média das idades digitadas.
// Finalize digitando idade igual a zero.

import java.util.Scanner;

public class Atividade16 {
   public static void main(String[] args) {
             try (Scanner entrada = new Scanner(System.in)) {
                double media = 0;
                 int idade, contador = 0, somaIdades = 0;
                
                 System.out.println("Digite as idades. Digite 0 para encerrar.");

                 for ( idade = 0  ; ; idade++) {
                    System.out.print("Me informe as idades: ");
                    idade = entrada.nextInt();

                    if (idade == 0) {
                        break; 
                    }
                    somaIdades += idade;
                    contador++;
                }

                if (contador > 0) {
                    media = somaIdades /  contador;
                    System.out.println("Média das idades: " + media);
                } else {
                    System.out.println("Nenhuma idade foi inserida.");
                }
            }

            
       }
    }


