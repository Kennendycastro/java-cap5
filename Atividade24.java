 import java.util.Scanner;

 public class Atividade24 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            
            while (true) {
                System.out.print("Digite um valor inteiro positivo (ou 0 para encerrar): ");
                int valor = entrada.nextInt();
                
                if (valor < 0) {
                    System.out.println("Valor negativo. Tente novamente.");
                } else if (valor == 0) {
                    break;
                } else {
                    if (valor > maior) {
                        maior = valor;
                    }
                    if (valor < menor) {
                        menor = valor;
                    }
                }
            }
            
            if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
                System.out.println("Maior valor: " + maior);
                System.out.println("Menor valor: " + menor);
            } else {
                System.out.println("Nenhum valor positivo foi digitado.");
            
            }
        }
    }
}

