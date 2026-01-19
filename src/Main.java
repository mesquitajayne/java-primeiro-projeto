import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); 

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); 

        if (idade >= 18) {
            System.out.println("Olá, " + nome + "! Você é maior de idade.");
        } else {
            System.out.println("Olá, " + nome + "! Você é menor de idade.");
        }

        scanner.close();
    }
}