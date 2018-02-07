import java.util.Scanner;

public class ExerciaDiaSeis3 {

	public static void main(String[] args) {
		//crie um programa que leia dois numeros e imprima a area e o perímetro
		Scanner in = new Scanner(System.in);
		double um = in.nextDouble();
		double dois = in.nextDouble();
		System.out.println("area: " +  um*dois);
		System.out.println("perímetro: " + 2*(um+dois));
	}
}


