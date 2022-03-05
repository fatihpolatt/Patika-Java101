import java.util.Scanner;
import java.lang.Math;

public class dikÜçgendeAlanHesaplayanProgram {
    public static void main(String[] args) {
        int a,b,c,u,cevre;
        double alan,hesaplama;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("1. Kenarı gir :  ");
            a = scan.nextInt();
        System.out.println("2. Kenarı gir :  ");
            b = scan.nextInt();
        System.out.println("3. Kenarı gir :  ");
            c = scan.nextInt();
        u = (a+b+c)/2;
        cevre = 2*u;
        hesaplama =u*(u-a)*(u-b)*(u-c);
        alan = Math.sqrt(hesaplama);

        System.out.println("Çevre :    "+ cevre+"\nAlan :    "+alan);
    }
}
