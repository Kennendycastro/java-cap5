import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeMulheresSalarioBaixo = 0, idadeMaisNova = 0, idadeMaisVelha = 0;
        double somaSalarios = 0, menorSalario = 0, idadeMenorSalario = 0, salario,  mediaSalarios;
        char sexo, sexoMenorSalario = ' ';

        while (true) {
            System.out.print("Idade (digite idade negativa para encerrar): ");
            int idade = entrada.nextInt();

            if (idade < 0) {
                break;         

            }System.out.print("Sexo (M/F): ");
            sexo = entrada.next().charAt(0);

            System.out.print("Salário: ");
            salario = entrada.nextDouble();
            
            somaSalarios += salario;

            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
            }
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
            }
               
            if (sexo == 'F' && salario <= 200.00) {
                quantidadeMulheresSalarioBaixo += quantidadeMulheresSalarioBaixo / 2;
            }

            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }
        
        }
         mediaSalarios = somaSalarios / (idadeMaisVelha - idadeMaisNova + 1);

         System.out.println("Média dos salários: " + mediaSalarios);
        System.out.println("Maior idade: " + idadeMaisVelha);
        System.out.println("Menor idade: " + idadeMaisNova);
        System.out.println("Mulheres com salário até R$ 200,00: " + quantidadeMulheresSalarioBaixo);
        System.out.println("Pessoa com menor salário: Idade " + idadeMenorSalario + sexoMenorSalario);

        entrada.close();
    }
}


