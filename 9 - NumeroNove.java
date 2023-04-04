import java.util.Scanner;

public class NumeroNove {
	
	public static void main (String []args) {
		Scanner input = new Scanner (System.in);
		int horas, minutos, auxiliar, segundos, numeroInserido;
		
		System.out.println("Digite a quantidade de segundos: ");
		numeroInserido = input.nextInt ();
		
		segundos = numeroInserido % 60;
		auxiliar = numeroInserido / 60;
		minutos = auxiliar % 60;
		horas = auxiliar / 60;
		
		System.out.printf("Esse número tem %d horas, %d minutos e %d segundos.",horas,minutos,segundos);
		
		input.close();
	}
}
