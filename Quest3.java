import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);

        int vet[], vet_2[];
        int N = 0;

        System.out.print("Digite quantos alunos tem respectivamente em calculo e prog modular: ");
        N = scanf.nextInt();

        vet = new int[N];
        vet_2 = new int[N];

        for (int i = 0; i < N; i++){

            vet[i] = scanf.nextInt();

        }
        for (int i = 0; i < N; i++){
            
            vet_2[i] = scanf.nextInt();

        }

        for (int j = 0; j < N; j++){

            for (int i = 0; i < N; i++){

                    if(vet[j] == vet_2[i]){
                        System.out.println(vet[j]);
                    }
                }

            }
    }

}

