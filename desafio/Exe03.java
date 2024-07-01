import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você é cliente vip ?");
        float preco = 50.10f;
        boolean vip = scan.nextBoolean();
        if(vip){
            preco = ((preco * 10) / preco) - preco;
        }
        System.out.println("O valor total deu "+preco);
    }
}
