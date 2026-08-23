import java.util.Scanner;

public class Quest8{

    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        Objeto[] peca = new Objeto[10];
        Double totalVenda = 0.00;
        Double salario = 545.00;
        Double comissao = 0.00;

       

        for (int i = 0; i < 10; i++){

            peca[i] = new Objeto();

            peca[i].valor[i] = scanf.nextDouble();
            peca[i].qtd[i] = scanf.nextInt();

            totalVenda += peca[i].valor[i] * peca[i].qtd[i];
        }

        int maisVendido = peca[0].qtd[0];
        int posmaisVendido = 0;
        Double maisVendidoval = 0.00;

        for (int j = 0; j < 10; j++){

            if (peca[j].qtd[j] > maisVendido){

                maisVendidoval = peca[j].valor[j];
                posmaisVendido = j;
                maisVendido = peca[j].qtd[j];
            }

            System.out.printf("\nA quantidade de pecas do objeto %d vendido foi de: %d", j + 1, peca[j].qtd[j]);
            System.out.printf("\nO valor unitario do objeto %d vendido foi de: %.2f", j + 1, peca[j].valor[j]);
            System.out.printf("\nO valor total do objeto %d vendido foi de: %.2f", j + 1, (peca[j].valor[j] * peca[j].qtd[j]));

        }

        System.out.printf("\nO valor geral das vendas foi de: R$%.2f", totalVenda);
        comissao = (totalVenda * 5) / 100;
        
        System.out.printf("\nO valor da comissao eh de R$%.2f", comissao);
        System.out.printf("\nO valor do salario somado eh de R$%.2f", comissao + salario);

        System.out.printf("\nO valor do objeto mais vendido e sua posicao eh: R$%.2f e %d", maisVendidoval, posmaisVendido);

    }
}

class Objeto{
    Double valor[] = new Double[10];
    int qtd[] = new int[10];
}