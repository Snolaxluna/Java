import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int produto = sc.nextInt();
        int quantidade = sc.nextInt();
        Double valor = null;

        if (produto == 1) {
            valor = 4.0;
        }
        if (produto == 2) {
            valor = 4.50;
        }
        if (produto == 3) {
            valor = 5.0;
        }
        if (produto == 4) {
            valor = 2.0;
        }
        if (produto == 5) {
            valor = 1.50;
        }

        Double total = valor * quantidade;

        System.out.printf("Total: R$ %.2f\n", total);
    }
}
