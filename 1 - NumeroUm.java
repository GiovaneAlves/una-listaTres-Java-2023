import java.util.Scanner;

public class NumeroUm {

	public static void main (String[]args) {
		Scanner input = new Scanner (System.in); 
		double primeiroNumero, segundoNumero, media;
		
		System.out.println("Digite o primeiro número:");
		primeiroNumero = input.nextDouble ();
		
		System.out.println("Agora digite o segundo número: ");
		segundoNumero = input.nextDouble ();
		
		media = (primeiroNumero + segundoNumero)/2;
		System.out.printf("A média desses dois números é  %.2f",media);
		
		input.close ();
	}
	
}
