import java.util.Scanner;
public class ex20 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Digite uma mensagem: ");
	        String mensagem = scanner.nextLine();
	        System.out.println("\nRepetindo a mensagem 3 vezes:");
	        for (int i = 1; i <= 3; i++) {
	            System.out.println(i + ": " + mensagem);
	        }

	        scanner.close();

	}

}
