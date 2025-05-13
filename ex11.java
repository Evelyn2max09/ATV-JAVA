import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite sua turma: ");
        String turma = scanner.nextLine();
        System.out.println("\n=== Informações Pessoais ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Turma: " + turma);

        scanner.close();
	}

}
