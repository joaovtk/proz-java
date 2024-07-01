import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = scan.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int b = scan.nextInt();
        
        System.out.println("Digite o terceiro numero: ");
        int c = scan.nextInt();

        int total = (a + b + c) / 3;
        
        System.out.println("A media entre os numeros digitados são "+ total);

        scan.close();
    }
}
