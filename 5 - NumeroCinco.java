import java.util.Scanner;

public class NumeroCinco {

	public static void main (String []args) {
		Scanner input = new Scanner (System.in);
		int horasTrabalhadas, filhos, bonificaçaoFilho= 90;
		double valorHora, salarioFamilia, salarioBruto;
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês:");
		horasTrabalhadas = input.nextInt();
		
		System.out.println("Digite qual o valor da sua hora:");
		valorHora = input.nextDouble();
		
		System.out.println("Quantos filhos menores de 14 anos possui?");
		filhos = input.nextInt();
		
		//considerando o inns como 9% do sálario 
		salarioBruto = (horasTrabalhadas*valorHora)*0.91;
	
		
		if (filhos>0) {
			salarioFamilia = salarioBruto + (filhos*bonificaçaoFilho);
			}
		else 
			salarioFamilia= salarioBruto;
		
		System.out.printf("Seu sálario final é R$ %.2f",salarioFamilia);
		
		input.close();
		
}
}
