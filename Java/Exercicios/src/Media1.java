import java.util.Scanner;

public class Media1{

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double media = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
        leitor.close();
    }
}