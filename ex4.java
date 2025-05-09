import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um número:");
		int num = entrada.nextInt();
		if (num % 2==0) {
			System.out.println("O número " + num +  "é par");
		}else {
			System.out.println("o número " + num +  "é ímpar");
		}
		
	}

}
