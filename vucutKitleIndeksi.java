import java.util.Scanner;
public class vucutKitleIndeksi {
    public static void main(String[] agrs) {
        double boy,kilo,indeks;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scan.nextDouble();

        indeks = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz :    "+indeks);
    }
}