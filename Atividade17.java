import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int audiencia = 0, numeroCanal = 0;
            double porcentagem = 0;
            
                System.out.print("Número do canal (ou 0 para encerrar): ");
                numeroCanal = entrada.nextInt();
             while (true) {
                if (numeroCanal == 0) {
                }
                System.out.print("Número de pessoas assistindo: ");
                audiencia = entrada.nextInt();

                switch (numeroCanal) {
                    case 4:
                        
                        porcentagem = audiencia /100;
                        break;
                    case 5:
                       
                        porcentagem = audiencia /100;
                        break;
                    case 7:
                        
                        porcentagem = audiencia /100;
                        break;
                    case 12:
                        
                        porcentagem = audiencia / 100;
                        break;
                    default:
                        System.out.println("Canal inválido. Por favor, insira 4, 5, 7 ou 12.");
                        break;
                }
                     
                    
                    System.out.println("Canal " + numeroCanal + ": " + porcentagem + "% de audiência");
                 
                    
            }   
               }
              
        }
    }
    


