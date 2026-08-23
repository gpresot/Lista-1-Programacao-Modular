import java.util.Scanner;
public class Quest1 {

    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        int x = 0, fat = 1;
        
        x = scanf.nextInt();

        for (int i = x; i > 0; i--){
            fat = fat * i;
        }
        System.out.println("O valor do fatorial de: " + x + " eh: " + fat);
    }
    
}
