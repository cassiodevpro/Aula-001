import java.util.Scanner;

public class SomaScanner {

            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Digite o primeiro numero: ");
            int a = sc.nextInt();
            System.out.print("Digite o Segundo numero: ");
            int b = sc.nextInt();
            
            int soma = a + b;
            
            
            System.out.println("Olá, a soma de " + a + " + " + b + " é igual a: " + soma );
            
            sc.close();
            
       }
}
