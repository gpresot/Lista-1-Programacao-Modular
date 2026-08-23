import java.util.Scanner;

public class Quest7 {
    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);
        Mes[] mes = new Mes[12];
        String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho",
                   "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int mesM = 0;
        int mesMen = 0;

        for (int i = 0; i < 12; i++){

            mes[i] = new Mes();
            mes[i].temperatura = scanf.nextDouble();

        }

        Double maiorTemp = mes[0].temperatura;
        Double menorTemp = mes[0].temperatura;

        for (int j = 0; j < 12; j++){

            if (mes[j].temperatura > maiorTemp){

                maiorTemp = mes[j].temperatura;
                mesM = j;
            }
            if (mes[j].temperatura < menorTemp){

                menorTemp = mes[j].temperatura;
                mesMen = j;
            }

        }

        System.out.printf("O mes com maior temperatura foi em %s com %.1fºC celsius e o mes com menor temperatura foi em %s com %.1fºC celsius. ", meses[ mesM ], maiorTemp, meses[ mesMen ], menorTemp);


    }
}

class Mes{
    Double temperatura;
    
}