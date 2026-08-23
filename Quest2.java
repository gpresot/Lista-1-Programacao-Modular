import java.util.Scanner;
public class Quest2 {

    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);

        int x = 0, y = 0, z = 0;
        int vet[]; 
        vet = new int[3];

        for (int i = 0; i < 3; i++){

            vet[i] = scanf.nextInt();
        }

        int maior  = vet[0], menor = vet[0];

        for (int i = 1; i < vet.length; i++){

            if (vet[i] > maior){

                maior = vet[i];
            }
            else if (vet[i] < menor){

                menor = vet[i];
            }
        }

        System.out.println("MAior: " + maior + "Menor: " + menor);

        for (int i = 0; i < 3; i++){

            if (vet[0] >= vet[1] && vet[0] <= vet[2]){

                System.out.println("O numero" + x + "esta no intervalo de " + y + "a " + z);
            }
            else{

                System.out.println("O numero " + x + " n esta no intervalo de " + y + "a " + z);
            }

            if (vet[0] % y == 0){

                System.out.println("O numero eh divisivel por y");
            }
            if (vet[0] % z == 0){

                System.out.println("O numero eh divisivel por z");
            }
        }

    }
}

