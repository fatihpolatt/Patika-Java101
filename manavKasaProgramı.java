import java.util.Scanner;
public class manavKasaProgramı {
    public static void main(String[] agrs) {
        
        double armut,elma,domates,muz,patlican,toplam,
        atl,etl,dtl,mtl,ptl;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Armut Kaç Kilo ? : ");
            armut = scan.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
            elma = scan.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
            domates = scan.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
            muz = scan.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
            patlican = scan.nextDouble();

        atl = armut*2.14;
        etl = elma*3.67;
        dtl = domates*1.11;
        mtl = muz*0.95;
        ptl = patlican*5.00;

        toplam = atl+etl+dtl+mtl+ptl;

        System.out.println("---------------------------");
        System.out.print("Toplam Tutar : "+toplam+"TL");
    }
}
