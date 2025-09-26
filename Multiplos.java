import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();

		System.out.println("Digite 3 numeros: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int multiplos = a * b * c;

		System.out.println(nome + " A mutilicação dos seus numero e: " + multiplos + " Deseja continua Sim ou Não? ");

		boolean resposta = sc.nextBoolean();

		if (resposta == true) {

			Scanner scn = new Scanner(System.in);

			System.out.println("Digite o seu nome: ");
			String nome1 = scn.nextLine();

			System.out.println("Digite 3 numeros: ");

			int d = scn.nextInt();
			int e = scn.nextInt();
			int f = scn.nextInt();

			int multiplos2 = d * e * f;

			System.out.println(
					nome1 + " A mutilicação dos seus numero e: " + multiplos2 + " Deseja continua Sim ou Não? ");

			scn.close();

		} else {

			System.out.println("fim do programa ate logo");

		}
		sc.close();
	}
}
