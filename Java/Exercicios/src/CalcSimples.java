import java.util.Scanner;

public class CalcSimples{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int peca1 = sc.nextInt();
        int quanti1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        int peca2 = sc.nextInt();
        int quanti2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double total = (quanti1 * valor1) + (quanti2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);



        sc.close();
    }
}