import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double salario = 0, mesesTrabalhados = 0, valorF = 0;
            int opc;

            while (true) {
                System.out.println("1. Novo salário");
                System.out.println("2. Férias");
                System.out.println("3. Décimo terceiro");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                opc = entrada.nextInt();

                if (opc == 4) {
                    System.out.println("Você saiu");
                    break;
                }

                switch (opc) {
                    case 1:
                        System.out.print("Digite o seu salário: R$ ");
                        salario = entrada.nextDouble();

                        if (salario <= 210) {
                            System.out.print("Seu salário vai receber um aumento de 15%! O novo salário é: R$ " + salario * 1.15);
                        } else if (salario >= 210 && salario <= 600) {
                            System.out.println("Seu salário vai receber um aumento de 10%! O novo salário é: R$ " + salario * 1.10);
                        } else {
                            System.out.print("Seu salário vai receber um aumento de 5%! O novo salário é: R$ " + salario * 1.05);
                        }
                        break;

                    case 2:
                        System.out.print("Digite o seu salário: R$ ");
                        salario = entrada.nextDouble();
                        valorF = salario + (salario / 3);
                        System.out.print("O valor das férias é: R$ " + valorF);
                        break;

                    case 3:
                        System.out.print("Digite o seu salário: R$ ");
                        salario = entrada.nextDouble();
                        System.out.println("Digite o total de meses de trabalho na empresa (O máximo é 12):");
                        mesesTrabalhados = entrada.nextDouble();
                        System.out.print("O valor do seu décimo terceiro é: R$ " + (salario * mesesTrabalhados) / 12);
                        break;

                    default:
                        System.out.println("Opção inválida...");
                }
            }
        }
    }
}

   