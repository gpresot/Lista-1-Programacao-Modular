public import java.util.Scanner;
public class Quest5{
    public static void main(String[] args){

    Scanner scanf = new Scanner(System.in);    
    Habitante[] pessoa = new Habitante[100]; 
    int i = 0;
    
    System.out.println("Digite a idade (-1 para parar): ");
    int idade = scanf.nextInt();
    scanf.nextLine();




    
    while(idade != -1){

        pessoa[i] = new Habitante();  
        pessoa[i].idade = idade;

        System.out.println("Digite o seu sexo: masculino/feminino: ");
        pessoa[i].sexo = scanf.nextLine();

        System.out.println("Digite a cor dos olhos: ");
        pessoa[i].corOlhos = scanf.nextLine();

        System.out.println("Digite a cor dos cabelos: ");
        pessoa[i].corCabelo = scanf.nextLine();

        i++;

        System.out.print("Digite a idade (-1 para parar): ");
        idade = scanf.nextInt();
        scanf.nextLine();
    }

    int maiorIdade = pessoa[0].idade;
    int menorIdade = pessoa[0].idade;
    int criterio = 0;

    for (int j = 0; j < i; j++){

        if(pessoa[j].idade > maiorIdade){
            maiorIdade = pessoa[j].idade;
        }
        if(pessoa[j].idade < menorIdade){
            menorIdade = pessoa[j].idade;
        }

        if (pessoa[j].sexo.equalsIgnoreCase("feminino") 
        && pessoa[j].idade >= 18 
        && pessoa[j].idade <= 35 
        && pessoa[j].corOlhos.equalsIgnoreCase("verdes") 
        && pessoa[j].corCabelo.equalsIgnoreCase("louros")) {
    criterio++;
        }
    }

        System.out.println("\n--- Resultados ---");
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Mulheres (18 a 35 anos, olhos verdes, cabelo louro): " + criterio);
    
    
 
    
}
}

class Habitante{

    String sexo;
    String corOlhos;
    String corCabelo;
    int idade;

    
}
 {
    
}
