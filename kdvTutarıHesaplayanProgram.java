import java.util.Scanner;
public class kdvTutarıHesaplayanProgram {

    public static void main(String[] args) {
    double tutar,kdvmik,kdvlifiyat,eger;        // Degerleri double türünden küsüratlı çıkabilir
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Ücret Tutarını giriniz : ");
    tutar = scan.nextDouble();
    
    eger = (tutar > 1000) ? 0.08 : 0.18;        // 1000'den yüksek değerler için %8 aldık
    
    kdvmik = tutar * eger;
    kdvlifiyat = tutar + kdvmik;

    System.out.println("Kdvsiz fiyat            :" + tutar);
    System.out.println("Kdv miktarı             :" + kdvmik);
    System.out.println("Kdv eklenmiş fiyat      : " + kdvlifiyat);

    }
}