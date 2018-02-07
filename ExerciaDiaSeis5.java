import java.util.Scanner;

public class ExerciaDiaSeis5 {

	public static void main(String[] args) {
		/*(estrutura condicional) Escreva um programa Java para ler os valores de
quatro números N1, N2, N3 e N4. Calcule e imprima o valor da média
aritmética dos mesmos. Imprimir também uma mensagem de "aprovado"
ou "reprovado" no caso da média ser maior ou igual a seis, ou menor,
respectivamente.*/
		Scanner in = new Scanner(System.in);
		double um = in.nextDouble();
		double dois = in.nextDouble();
		double tres = in.nextDouble();
		double quatro = in.nextDouble();
		double media = (um+dois+tres+quatro)/4;
		if(media >= 6.00) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
	}
}
