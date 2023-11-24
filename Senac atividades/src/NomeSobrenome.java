import java.util.Scanner;

public class NomeSobrenome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Agora, digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        String saudacao = "Eai professor " + nome + " " + sobrenome + "!";
        System.out.println(saudacao);
        scanner.close();
    }
}
