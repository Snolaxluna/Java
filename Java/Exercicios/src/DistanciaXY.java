import java.util.Scanner;

public class DistanciaXY {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2), 0.5);

        System.out.printf("%.4f\n", distancia);


        
        sc.close();
    }
}