import java.util.Scanner;
public class ex19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();
        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;
        System.out.println("Sua idade em " + anoAtual + " é: " + idade + " anos.");

        scanner.close();
	}

}
