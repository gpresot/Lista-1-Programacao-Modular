import java.util.Scanner;

public class Quest9{
    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);
        int vetNum[] = new int[6];
        int qtdImp = 0;
        int somaPar = 0;
        
        for (int i = 0; i < 6; i++){

            vetNum[i] = scanf.nextInt();
            
            if ( vetNum[i] % 2 == 0){

                somaPar += vetNum[i];

            }

            else{

                qtdImp++;

            }

        }

        System.out.printf("-------------\n");
        System.out.printf(" RELATORIO \n");
        System.out.printf("-------------\n");
        System.out.printf("Os numeros pares sao:\n");

        for (int i = 0; i < 6; i++){

            if (vetNum[i] % 2 == 0){

                System.out.printf("numero %d na posicao %d\n", vetNum[i] , i + 1);
            }
        }

        System.out.printf("Soma dos pares = %d\n\n", somaPar);
        System.out.printf("Os numeros impares sao:\n");

        for (int i = 0; i < 6; i++){

            if (vetNum[i] % 2 != 0){

                System.out.printf("numero %d na posicao %d\n", vetNum[i] , i + 1);
            }
        }
        
        System.out.printf("Quantidade de impares = %d",qtdImp);




    }
}