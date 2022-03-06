import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args){
    int km;
    double perKm = 2.20, total,Acilis = 10;

    Scanner scan = new Scanner(System.in);
    System.out.print("Mesafeyi km cinsinden giriniz:  ");
    km = scan.nextInt();

    total = Acilis += (km * perKm);
    total = (total < 20) ? 20 : total;

    System.out.print("Toplam Tutar :    " + total);
    }
}