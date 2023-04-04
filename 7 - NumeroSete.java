import java.util.Scanner;

public class NumeroSete {
	
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		double salarioFixo, salarioTotal, porcentagem, vendas;
		
		System.out.println("Digite o seu sálario fixo:");
		salarioFixo = input.nextDouble ();
		
		System.out.println("Digite a quantidade vendida no mês:");
		vendas = input.nextDouble ();
		
		System.out.println("Digite a porcetagem desejada:");
		porcentagem = input.nextDouble ();
		porcentagem = porcentagem /100;
		
		salarioTotal = salarioFixo + (vendas*porcentagem);
		System.out.printf("Seu sálario final esse mês é R$ %.2f  ",salarioTotal);
		
		input.close ();
	}
}
