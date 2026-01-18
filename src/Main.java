import java.util.Scanner; // permite ler o que o usuário digita

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // cria o scanner

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // lê o nome

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // lê a idade

        if (idade >= 18) {
            System.out.println("Olá, " + nome + "! Você é maior de idade.");
        } else {
            System.out.println("Olá, " + nome + "! Você é menor de idade.");
        }

        scanner.close(); // fecha o scanner
    }
}