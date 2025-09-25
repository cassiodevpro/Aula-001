import java.util.Scanner;

public class ScannerExample {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Qual é o seu nome: ");
          String nome = sc.nextLine();

          System.out.println("Qual a sua profissão: ");
          String profissao = sc.nextLine();

          System.out.print("Digite o primeiro numero: ");
          int a = sc.nextInt();       
          System.out.println("Olá, o numero é :" + a);

          System.out.println("Seu nome é, " + nome + " e sua profissao é, " + profissao);

          sc.close();
     }
}
