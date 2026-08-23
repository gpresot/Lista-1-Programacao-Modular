import java.util.Scanner;

public class Quest4 {

    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        int X[], Y[], Z[];
        int n = 0, m = 0, a =0;

        System.out.println("Digite os valores de n e m: ");
        n = scanf.nextInt();
        m = scanf.nextInt();
        X = new int[n];
        Y = new int[m];
        Z = new int[n+m];

        for (int i = 0; i < n; i++){
            X[i] = scanf.nextInt();
        }
        for (int j = 0; j < m; j++){
            Y[j] = scanf.nextInt();
        }

        for(int i = 0; i < n; i++){

            Z[i] = X[i];
        }
        a = n;
        for(int j = 0; j < m; j++){
            int i;
            for( i = 0; i < n; i++){

                if(Z[i] == Y[j]){
                    break;
                }
        }
        if(i == n){
            Z[a] = Y[j];
            a++;
            }
        
        }
        for (int i = 0; i < a; i++){
            System.out.printf("%d",Z[i]);
        }

    }
}
