import java.util.Scanner;

public class dikÜçgendeHipotenüsBulanProgram {
    public static void main(String[] args) {
        int a,b;
        double c;
    Scanner scan = new Scanner(System.in);
        System.out.println("1. Kenarını gir : ");
        a = scan.nextInt();
        System.out.println("2. Kenarını gir : ");
        b = scan.nextInt();

        c = Math.sqrt((a*a)+(b*b));

    System.out.println("Hipotenüs: "+ c);
        
    }
}
