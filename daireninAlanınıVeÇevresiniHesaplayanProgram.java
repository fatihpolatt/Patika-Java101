import java.util.Scanner;
public class daireninAlanınıVeÇevresiniHesaplayanProgram {
    public static void main(String[] args) {
    
    int r,aci;
    double dilimalan,alan,cevre,pi = 3.14;

    Scanner scan = new Scanner(System.in);
    System.out.println("-------------------------------------");
    System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = scan.nextInt();
    System.out.print("Açıyı Giriniz :  ");
        aci = scan.nextInt();

    alan = pi * r * r;
    cevre = 2 * pi * r;
    dilimalan = (pi*(r*r)*aci)/360;
    
    System.out.println("-------------------------------------");
    System.out.println("Dairenin alanı :            "+alan);
    System.out.println("Dairenin çevresi :          "+cevre);
    System.out.print("Direnin a Ölçülü Alanı :    "+dilimalan);
    }
}
