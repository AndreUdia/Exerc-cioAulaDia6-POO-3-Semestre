import java.util.Scanner;

public class ExerciaDiaSeis3 {

	public static void main(String[] args) {
		//crie um programa que leia dois numeros e imprima a area e o per�metro
		Scanner in = new Scanner(System.in);
		double um = in.nextDouble();
		double dois = in.nextDouble();
		System.out.println("area: " +  um*dois);
		System.out.println("per�metro: " + 2*(um+dois));
	}
}


