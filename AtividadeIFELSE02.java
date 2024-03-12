import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        
        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();
        

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " e par.");
        } else {
            System.out.println("O numero " + numero + " e impar.");
        }
    }
}
