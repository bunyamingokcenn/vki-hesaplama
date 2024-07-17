import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double height, kg, vki;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = input.nextDouble();
        vki = kg / (height * height);

        System.out.print("Vücut kitle indeksiniz: " + vki);


    }
}