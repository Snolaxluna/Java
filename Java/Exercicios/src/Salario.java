import java.util.Scanner;

public class Salario{

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int num = leitor.nextInt();
        int hora = leitor.nextInt();
        double dindin = leitor.nextDouble();

        double sala = hora * dindin;

        System.out.printf("NUMBER = %d\n", num);
        System.out.printf("SALARY = U$ %.2f\n", sala);
        leitor.close();
    }
}