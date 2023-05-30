import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade = 0;
        int soma = 0;
        double media = 0;
        System.out.println("Digite o numero : ");
        while (input.hasNextInt()) {
            int numero = input.nextInt();
            soma += numero;
            quantidade++;

            System.out.print("Digite o numero :  ");
        }
        if (quantidade>0) {
            media = (double) soma / quantidade;
            System.out.println(" A media dos numeros é " + media);
        }else {
            System.out.println("Não foi digitado numeros");
        }
    }
}