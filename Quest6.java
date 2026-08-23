import java.util.Scanner;

public class Quest6{
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        Aluno[] alu = new Aluno[10];
        String gab[] = new String[8]; 
        int cont = 0;

        for (int i = 0; i < 8; i++){
            System.out.printf("Digite o que o aluno marcou da questao de num %d: ",i+1);
            gab[i] = scanf.nextLine();
        }

        for (int i = 0; i < 10; i++){

            alu[i] = new Aluno();
            System.out.printf("Digite o numero do alu: ");
            alu[i].numero = scanf.nextInt();
            scanf.nextLine();

            for (int j = 0; j < 8; j++){

                System.out.printf("Digite o gabarito da questao de num %d: ",j+1);
                alu[i].resposta[j] = scanf.nextLine();
                if (alu[i].resposta[j].equals(gab[j])){

                    alu[i].nota++;
                }
            }
            System.out.printf("O aluno n: %d ficou com nota %d\n", alu[i].numero, alu[i].nota);
            if(alu[i].nota >= 6){
                cont++;
            }
        }
        System.out.printf("A porcentagem de aprovacao foi de %d%",(cont * 100)/10);


    }
}

class Aluno{
    int numero;
    String resposta[] = new String[8];
    int nota = 0;
}