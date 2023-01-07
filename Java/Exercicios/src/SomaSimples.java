import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
        leitor.close();
    }
}