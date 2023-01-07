import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        double porcem = 15.0 / 100.0;

        double bonus = salario + (porcem * vendas);

        System.out.printf("TOTAL = R$ %.2f\n", bonus);
        sc.close();


    }
}