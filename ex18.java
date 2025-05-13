import java.util.Scanner;
public class ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Digite a temperatura em Celsius: ");
	        double celsius = scanner.nextDouble();
	        double fahrenheit = celsius * 1.8 + 32;
	        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

	        scanner.close();

	}

}
