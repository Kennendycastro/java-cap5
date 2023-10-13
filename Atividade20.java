
    
    import java.util.Scanner;
           
        public class Atividade20 {
  
        public static void main(String[] args) {
            try (Scanner entrada = new Scanner(System.in)) {
                int opcao;
                double valor1 = 0, valor2 = 0, valor3 = 0, res;
                double peso1, peso2, peso3;
                while (true) {
   
                 System.out.print("Digite a opção desejada: ");
                 opcao = entrada.nextInt();
   
                  switch (opcao) {
                  case 1:
                 System.out.print("Me informe o primeiro valor");
                 valor1 = entrada.nextInt();
                 System.out.print("Me informe o segundo valor");
                 valor2 = entrada.nextInt();
                 res = (valor1 + valor2) / 2;
                 System.out.print( "O resultado da sua opção é:" + res);
                 break;

                 case 2:
                 System.out.print("Me informe o primeiro valor");
                 valor1 = entrada.nextInt();
                 System.out.print("Digite o peso da primeira nota: ");
                 peso1 = entrada.nextDouble();
                 System.out.print("Me informe o segundo valor");
                 valor2 = entrada.nextInt();
                 System.out.print("Digite o peso da segunda nota: ");
                 peso2 = entrada.nextDouble();
                 System.out.print("Me informe o segundo valor");
                 valor3 = entrada.nextInt();
                 System.out.print("Digite o peso da terceira nota: ");
                 peso3 = entrada.nextDouble();
                              res = (valor1 * peso1 + valor2 * peso2 + valor3 * peso3) / (peso1 + peso2 + peso3);
                              System.out.print( "O resultado da sua opção é:" + res);                

                            break;
                        case 3:
                            System.out.println("Programa encerrado.");
                           
                            System.exit(0);
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }
            }
        }
    }
