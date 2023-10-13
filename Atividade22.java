import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
       try (Scanner entrada = new Scanner(System.in)) {
        int idade, totalPessoas = 0;
        double altura, somaAlturas = 0,  mediaAlturas = 0;

        while (true) {
            System.out.print("Digite a idade (ou idade menor ou igual a 0 para encerrar): ");
            idade = entrada.nextInt();

            if (idade <= 0) {
                break;
            }

            System.out.print("Digite a altura (em metros): ");
            altura = entrada.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                totalPessoas++;
            }
        }
    }

        if (totalPessoas > 0) {
            mediaAlturas = somaAlturas / totalPessoas;
            System.out.println("A média das alturas das pessoas com mais de 50 anos é: " + mediaAlturas + " metros.");
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi registrada.");
        }
    }
}