import java.util.Scanner;

public class GastoGasolina{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int km = sc.nextInt();
        double media = (double)(tempo * km) / 12;

        System.out.printf("%.3f\n", media);

        sc.close();
    }
}