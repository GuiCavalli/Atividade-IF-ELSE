import java.util.Scanner;

public class AtividadeIfElse{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
   int idade = 0;
   
    
    System.out.println("Digite sua idade: ");
    idade = scanner.nextInt();
    
    if (idade >= 18){
    System.out.println("Voce e maior de idade ");
    }else{
    System.out.println("Voce e menor de idade ");
    }
  
  scanner.close();
    
    }
}
