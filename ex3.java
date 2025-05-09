import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		System.out.println("Olá,"+ nome + "!");
		entrada.close();
	}

}
