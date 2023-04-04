import java.util.Scanner;

public class NumeroQuatro {
	
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		double taxaJuros, montanteFinal, capitalAplicado;
		int meses;
		
		System.out.println("Digite o capital a ser aplicado:");
		capitalAplicado = input.nextDouble ();
		
		System.out.println("Digite a quantidade de meses desejado:");
		meses = input.nextInt ();
		
		System.out.println("Digite a taxa de juros:");
		taxaJuros = input.nextDouble ();
		
		for (int i =0; i<meses; i++) {
			
			montanteFinal = capitalAplicado * (taxaJuros/100);
			capitalAplicado = capitalAplicado + montanteFinal;
			
		}
		
		
		System.out.printf("O valor recibido no fina será: R$ %.2f. ", capitalAplicado );
		input.close();
		
	}
}
