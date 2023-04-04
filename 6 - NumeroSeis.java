import java.util.Scanner;

public class NumeroSeis {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    double n1, n2;
	    
		System.out.println("Digite o primeiro numero do logaritimo: ");
		n1 = input.nextDouble();
		
		System.out.println("Digite o numero base do logaritimo: ");
		n2 = input.nextDouble();
		
		System.out.print(Math.log(n1)/Math.log(n2));
		
		input.close();
	}
}