import java.util.Scanner;

public class Basico{

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();

        int X = A + B;
        System.out.println("X = " + X);

        leitor.close();
    }
}