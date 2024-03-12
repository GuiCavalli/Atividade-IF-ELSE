import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String usuario;
        String senha;
        
        System.out.println("Digite seu usuario: ");
        usuario = scanner.nextLine();
        
         System.out.println("Digite sua senha: ");
        senha = scanner.nextLine();
        

        if (usuario.equals("usuario") && senha.equals("senha123") ) {
            System.out.println("o usuario e senha estao corretos");
        } else {
            System.out.println("o usuario e senha estao incorretos");
        }
    }
}
