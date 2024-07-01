import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        if(idade >= 18 && idade < 70){
            System.out.println("Você pode votar");
        }else {
            System.out.println("Você não pode votar");
        }

        scan.close();

    }
}