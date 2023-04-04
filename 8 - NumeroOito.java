import java.util.Scanner;

public class NumeroOito {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int veiculos, rodas, testeVeiculos = 0, testeRodas = 0;
		int carros = 0, motos = 1;
		
		System.out.println ("Quantos veiculos tem no estacionamento: ");
		veiculos = input.nextInt();
		
		System.out.println ("Quantas rodas tem no estacionamento: ");
		rodas = input.nextInt();
		
		while (testeRodas != rodas || testeVeiculos != veiculos){
		    carros++;
		    testeRodas = (carros * 4) + (motos * 2);
		    testeVeiculos = carros + motos;
		    
		    if (carros > veiculos){
		        carros = 1;
		        motos++;
		    }
		    if (motos == rodas){
		        System.out.print("Digite o numero correto de veiculos e de rodas");
		        break;
		    }
		}
		if (testeRodas == rodas && testeVeiculos == veiculos){
		    System.out.printf("No estacionamento tem %d carros e %d motos", carros, motos);
		}
		input.close();
	}
}