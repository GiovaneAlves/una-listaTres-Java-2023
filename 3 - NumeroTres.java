import java.util.Scanner;

public class NumeroTres {
	
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		double temperaturaFahre, temperaturaCelsius;
		
		System.out.println("Ola!! Informe a temperatura:");
		temperaturaFahre = input.nextDouble();
		
		temperaturaCelsius = (temperaturaFahre - 32) / 1.8;
		System.out.printf("A temperatura é %.3f ºC",temperaturaCelsius);
		
		input.close ();
	}
}
