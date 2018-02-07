import java.util.Scanner;

public class ExerciaDiaSeis4 {

	public static void main(String[] args) {
		//Escreva um programa Java para ler os valores de quatro números N1, N2,
		//N3 e N4. Calcule e imprima o valor da média aritmética dos mesmos.
		
		Scanner in = new Scanner(System.in);
		double um = in.nextDouble();
		double dois = in.nextDouble();
		double tres = in.nextDouble();
		double quatro = in.nextDouble();
		System.out.println((um+dois+tres+quatro)/4);
	}
}
