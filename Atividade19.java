import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {

            char tipoAcao;
            double precoCompra, precoVenda, lucroPorAcao, lucroTotal;
            int quantidadeLucroSuperior1000 = 0, quantidadeLucroInferior200 = 0;
            
            while (true) {
            System.out.print("Digite o tipo da ação: ");
            tipoAcao = entrada.next().charAt(0);

            System.out.print("Digite o preço de compra: ");
            precoCompra = entrada.nextDouble();

            System.out.print("Digite o preço de venda: ");
            precoVenda = entrada.nextDouble();
            
            lucroPorAcao = precoVenda - precoCompra;

            if ((tipoAcao == 'F') || (tipoAcao == 'f')){
                break;

            }if (lucroPorAcao > 1000) {
                quantidadeLucroSuperior1000++;
            } 
             else if (lucroPorAcao < 200) {
                quantidadeLucroInferior200++;
            }
            }
            lucroTotal = lucroPorAcao;
            
            System.out.println("O lucro de cada ação comercializada é de R$" + lucroPorAcao);
            System.out.println("A quantidade de ações com lucro superior a R$ 1.000,00 é " + quantidadeLucroSuperior1000);
            System.out.println("A quantidade de ações com lucro inferior a R$ 200,00 é " + quantidadeLucroInferior200);
            System.out.println("O lucro total da empresa é de R$" + lucroTotal);
        
    }
  }
}
