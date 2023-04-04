import java.util.Scanner;

public class NumeroDois {

	public static void main (String[]args) {
		Scanner input = new Scanner (System.in); 
		double valorOriginal, valorAcrescido;
		
		System.out.println("Olá!! Digite o valor do produto: ");
		valorOriginal = input.nextDouble ();
		
		for (;valorOriginal<=0;) {
			System.out.println("Digite um valor válido:");
			valorOriginal = input.nextDouble ();
		}
		valorAcrescido= valorOriginal+(valorOriginal*0.10);
		System.out.printf("O novo valor do produto é R$ %.2f", valorAcrescido);
		
		input.close();
	}
}
