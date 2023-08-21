import javax.swing.*;
import java.util.Scanner;

public class Modulo_2_2 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" digite nome de USUARIO :");
        String nomeUsuario = scanner.next();
        System.out.println("digite a senha :");
        String senha = scanner.next();

        if (nomeUsuario.equals("adm") && senha.equals("123")){
            System.out.println("Login realizado com sucesso");
    }else
            System.out.println("USUARIO e SENHA INCORRETOS");

        scanner.close();

    }

}
