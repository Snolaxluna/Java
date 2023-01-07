import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dis = sc.nextInt();
        int x = 60;
        int distancia = (x * dis) / 30;

        System.out.printf("%d minutos\n", distancia);

        

        sc.close();
    }
}