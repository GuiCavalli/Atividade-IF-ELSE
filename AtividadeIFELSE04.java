import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Digite o primeiro numero: ");
        num1 = scanner.nextInt();
        
         System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextInt();
        

        if (num1 > num2 ) {
            System.out.println("O primeiro numero e maior!!!   " + num1);
        } else if (num2 > num1) {
            System.out.println("O segundo numero e maior!!!   " + num2);
        } else { 
            System.out.println("Os numeros sao iguais!!!");
        }
    }
}
