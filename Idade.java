import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento ");
        int a = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        int b = sc.nextInt();

        int idade = b - a;

        System.out.println("Olá, a sua idade é " + idade);

        sc.close();

    }
}
