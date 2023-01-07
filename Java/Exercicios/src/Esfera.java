import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio = sc.nextDouble();

        double volu = (4.0/3) * pi * Math.pow(raio,3);

        System.out.printf("VOLUME = %.3f\n", volu);
        sc.close();

    }
}