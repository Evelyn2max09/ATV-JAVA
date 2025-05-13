import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();
	        int dobro = numero * 2;
	        System.out.println("O dobro de " + numero + " é: " + dobro);

	        scanner.close();
	}

}
