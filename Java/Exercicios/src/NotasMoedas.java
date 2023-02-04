import java.util.Scanner;

public class NotasMoedas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();

        double total, cem, cinquenta, vinte, dez, cinco, dois, umReal,
                cinquentaCentavos, vinteCincoCentavos, dezCentavos, cincoCentavos, umCentavo;

        cem = valor / 100;
        total = valor % 100;

        cinquenta = total / 50;
        total = total % 50;

        vinte = total / 20;
        total = total % 20;

        dez = total / 10;
        total = total % 10;

        cinco = total / 5;
        total = total % 5;

        dois = total / 2;
        total = total % 2;

        umReal = total;
        total = total % 1;

        cinquentaCentavos = total / 0.50;
        total = total % 0.50;

        vinteCincoCentavos = total / 0.25;
        total = total % 0.25;

        dezCentavos = total / 0.10;
        total = total % 0.10;

        cincoCentavos = total / 0.05;
        total = total % 0.05;

        umCentavo = total / 0.01;
        total = total % 0.01;

        System.out.println("NOTAS:");
        System.out.println((int) cem + " nota(s) de R$ 100.00");
        System.out.println((int) cinquenta + " nota(s) de R$ 50.00");
        System.out.println((int) vinte + " nota(s) de R$ 20.00");
        System.out.println((int) dez + " nota(s) de R$ 10.00");
        System.out.println((int) cinco + " nota(s) de R$ 5.00");
        System.out.println((int) dois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println((int) umReal + " moeda(s) de R$ 1.00");
        System.out.println((int) cinquentaCentavos + " moeda(s) de R$ 0.50");
        System.out.println((int) vinteCincoCentavos + " moeda(s) de R$ 0.25");
        System.out.println((int) dezCentavos + " moeda(s) de R$ 0.10");
        System.out.println((int) cincoCentavos + " moeda(s) de R$ 0.05");
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", umCentavo);

        scanner.close();

    }
}