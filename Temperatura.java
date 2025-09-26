
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temperatura;

        System.out.print("Qual a temperatura: ");
        temperatura = sc.nextInt();

        if (temperatura >= 30) {
            System.out.println("Esta muito quente ");
        } else if (temperatura >= 20) {
            System.out.println("Temperatura agradavel ");
        } else if (temperatura < 20) {
            System.out.println("Esta frio");
        } else {
            System.out.println("invalido");
        }

        sc.close();
    }
}
