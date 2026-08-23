import java.util.Scanner;

public class Quest10{
    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);
        Double vendas[][] = new Double[12][4];
        double valorTotm[] = new double[12];
        double valorTots[] = new double[4];
        Double valorTota = 0.00;
        String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho",
                   "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        
        for (int i = 0; i < 12; i++){


            for (int j = 0; j < 4; j++){

                
                vendas[i][j] = scanf.nextDouble();

                valorTotm[i] += vendas[i][j];

                valorTots[j] += vendas[i][j];


            }
            valorTota += valorTotm[i];
        }

        for (int i = 0; i < 12; i++){

            System.out.printf("O total vendido no mes %s foi de R$%.2f\n", meses[ i ] , valorTotm[ i ] );

            
            
        }
        for (int j = 0; j < 4; j++){

                System.out.printf("O total vendido na semana %d foi de R$%.2f\n", j + 1 , valorTots[j]);
                
            }

        System.out.printf("O total vendido no ano foi R$%.2f", valorTota );

        
       


    }
}
