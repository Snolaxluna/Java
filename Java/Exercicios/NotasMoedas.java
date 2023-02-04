import java.util.Scanner;

public class NotasMoedas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        double cem = num / 100;
        double cinquenta = (num % 100) / 50;
        double vinte = ((num %100) % 50) / 20;
        double dez = (((num % 100) % 50) % 20) / 10;
        double cinco = ((((num % 100) % 50) % 20) % 10) / 5;
        double dois = (((((num % 100) % 50) % 20) % 10) % 5) / 2;
        
        double um = ((((((num % 100) % 50) % 20) % 10) % 5) % 2) / 1;
        double zeroCinquenta = (((((((num % 100) % 50) % 20) % 10) % 5) % 2) % 1) / 0.50;
        double zeroVintecinco= ((((((((num % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) / 0.25;
        double zeroDez = (((((((((num % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) / 0.10;
        double zeroCinco = ((((((((((num % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10) / 0.05;
        double zeroUm = (((((((((((num % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10) % 0.05) / 0.01;

        System.out.printf("%d notas (s) de R$ 100.00", cem);
        
        

        sc.close();
    }
}