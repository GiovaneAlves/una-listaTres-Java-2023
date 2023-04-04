import java.util.Scanner;

public class NumeroDez {
	
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		double mediaAritmetica, mediaHarmonica, mediaGeometrica,
			   primeiroValor, segundoValor, terceiroValor;
		
		System.out.println("Ola!! Digite o primeiro valor: ");
		primeiroValor = input.nextDouble ();
		
		System.out.println("Digite o segundo valor: ");
		segundoValor = input.nextDouble ();
		
		System.out.println("Digite o terceiro valor: ");
		terceiroValor = input.nextDouble ();
		
		mediaAritmetica = (primeiroValor + segundoValor + terceiroValor) / 3;
		
		mediaHarmonica = 3 / ( 1/primeiroValor + 1/segundoValor + 1/terceiroValor);
		
		mediaGeometrica = Math.cbrt(primeiroValor*segundoValor*terceiroValor);
		
		System.out.printf("A média dos respectivos números: %.2f, %.2f, %.2f."
							+ "	\n\nMédia Aritmetica: %.3f \n"
							+ "Média Harmonica: %.3f \n"
							+ "Média Geometrica: %.3f", 
							primeiroValor, segundoValor, terceiroValor,
							mediaAritmetica, mediaHarmonica, mediaGeometrica);
		
		input.close ();
		
	}
}
