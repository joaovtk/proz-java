import java.util.Scanner;
public class exe01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite seu nota: ");
        float nota = scan.nextFloat();
        System.out.println("Digite sua idade ");
        int idade = scan.nextInt();

        System.out.println(nome);
        System.out.println(nota);
        System.out.println(idade);
    }
}