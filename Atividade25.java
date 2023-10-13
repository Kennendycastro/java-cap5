import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double totalInvestido = 0, totalJuros = 0, valorInvestido, rendimentoMensal = 0;
            int codigoCliente, tipoInvestimento;
        
            while (true) {
                System.out.print("Digite o código do cliente (ou <= 0 para sair): ");
                codigoCliente = entrada.nextInt();

                if (codigoCliente <= 0) {
                    break;
                }

                System.out.print("Digite o tipo de investimento (1=Poupança, 2=Poupança Plus, 3=Fundos de Renda Fixa): ");
                tipoInvestimento = entrada.nextInt();

                System.out.print("Digite o valor investido: R$ ");
                valorInvestido = entrada.nextDouble();

                switch (tipoInvestimento) {
                    case 1:
                        rendimentoMensal = valorInvestido * 0.015; 
                        break;
                    case 2:
                        rendimentoMensal = valorInvestido * 0.02; 
                        break;
                    case 3:
                        rendimentoMensal = valorInvestido * 0.04; 
                        break;
                    default:
                        System.out.println("Tipo de investimento inválido.");
                        continue;
                }

                totalInvestido += valorInvestido;
                totalJuros += rendimentoMensal;

                System.out.println("Rendimento mensal: R$ " + rendimentoMensal);
            }

            System.out.println("Total investido: R$ " + totalInvestido);
            System.out.println("Total de juros pagos: R$ " + totalJuros);
        }
     
    }
}