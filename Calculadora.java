import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        double num1 = teclado.nextDouble();
        
         System.out.println("Digite o segundo numero: ");
        double num2 = teclado.nextDouble();
        
        if (num1 > num2) {
             System.out.println(num1 + " é maior que " + num2);
        } else if(num1 < num2) {
            System.out.println(num2 + " é maior que " + num1);
        } else {
            System.out.println(" Os números sao iguais! ");
        }
        teclado.close();
    }
    
}