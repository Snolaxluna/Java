import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double pi = 3.14159;

        double areatri = (A * C)/2;
        double areacirc = pi * Math.pow(C, 2);
        double areatrap = (A + B) * C / 2;
        double areaquad = Math.pow(B, 2);
        double arearetan = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areatri);
        System.out.printf("CIRCULO: %.3f\n", areacirc);
        System.out.printf("TRAPEZIO: %.3f\n", areatrap);
        System.out.printf("QUADRADO: %.3f\n", areaquad);
        System.out.printf("RETANGULO: %.3f\n", arearetan);
        sc.close();
    }
}