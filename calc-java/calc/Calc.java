package calc;
import java.util.Scanner;

public class Calc {
    static double[] guessValue(int count){
        Scanner scan = new Scanner(System.in);
        double numbers[] = new double[count];
        for(int i = 0;i < count;i++){
            System.out.println("Esperando digitar um Numero: ");
            numbers[i] = scan.nextDouble();
        }
        return numbers;
    }

    static double[] guessLoop(){
        Scanner scan = new Scanner(System.in);
        double numbers[] = new double[20];
        int i = 0;
        double number = 0;
        while(number != -1 || numbers[19] != 0){
            number = scan.nextDouble();
            if(number != -1){
                numbers[i] = number;
            }
            i++;
        }

        return numbers;
    }

    public static void MainMenu(){
        System.out.println("============================ CalC ===================================");
        System.out.println("Calculadora simples feita em java via terminal");
        OpMenu();
    }

    static void OpMenu(){

        double op = 0;
        while (op != -1) {
            System.out.println("Opçoes Padroes: ");
            System.out.println("1 - Somar dois numeros\n2 - Subtrair dois numeros\n3 - Dividir dois numeros\4 - Multiplicar dois numeros\n ");
            System.out.println("Opçoes extras: ");
            System.out.println("5 - Somar N Numeros\n6 - Subtrair N Numeros\n7 - Dividir N Numeros\n8 - Multiplicar N Numeros\n ");
            System.out.println("Paramentro de saida -1\n");
            System.out.println("Escolha sua opção");
            op = guessValue(1)[0];

            double res = 0;
            double[] values;

            switch ((int) op) {
                /* normal operations */
                case 1:
                    System.out.println("Operação Soma Normal escolhida\nDigite os valores para fazer a soma: ");
                    values = guessValue(2);
                    res = Sum.normal(values[0], values[1]);
                    break;
                case 2:
                    System.out.println("Operação Subtração Normal escolhida\nDigite os valores para fazer a Subtração: ");
                    values = guessValue(2);
                    res = Less.normal(values[0], values[1]);
                    break;
                case 3: 
                    System.out.println("Operação Multiplicação Normal escolhida\nDigite os valores para fazer a Multplicação: ");
                    values = guessValue(2);
                    res = Mult.normal(values[0], values[1]);
                    break;
                case 4:
                    System.out.println("Operação Divisão Normal escolhida\nDigite os valores para fazer a Divisão: ");
                    values = guessValue(2);
                    res = Div.normal(values[0], values[1]);
                    break;
                /* Break Point */
                case -1:
                    System.out.println("Finalizando a calculadora");
                    break;

                /* Multiply or infinity operations */
                case 5:
                    System.out.println("Operação Soma Multiplos escolhida\nDigite os valores para fazer a soma para sair do loop digite -1 ou digite 20 numeros: ");
                    values = guessLoop();
                    res = Sum.multiply(values);
                    break;
                case 6:
                    System.out.println("Operação Subtração Multiplos escolhida\nDigite os valores para fazer a subtração para sair do loop digite -1 ou digite 20 numeros: ");
                    values = guessLoop();
                    res = Less.multiply(values);
                    break;
                case 7: 
                    System.out.println("Operação Multplicação de Multiplos escolhida\nDigite os valores para fazer a multiplicação para sair do loop digite -1 ou digite 20 numeros: ");
                    values = guessLoop();
                    res = Mult.multiply(values);
                    break;
                case 8:
                    System.out.println("Operação Divisão de Multiplos escolhida\nDigite os valores para fazer a divisão para sair do loop digite -1 ou digite 20 numeros: ");
                    values = guessLoop();
                    res = Div.multiply(values);
                    break;
                default:
                    System.out.println("Opção Inexistente");
                    break;
            
            }

            if(op != -1){
                System.out.println("O resultado deu: " + res + "\n\n\n");
            }
        
        }
    }
}