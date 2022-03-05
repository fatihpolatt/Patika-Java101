import java.util.Scanner;

public class NotOrtalamasHesaplama {
    public static void main(String[] args) {

        int mat,kimya,fizik,turkce,tarih,muzik,toplam; //Değerleri intager türünden yazdım
        Double ort; //ortalama küsüratlı çıkacağından double türünde tanımladım
        
        Scanner scan = new Scanner(System.in); //Klavye tanımladım değer girebilmek için

        System.out.println("Matematik notunu girin :");//Kullanıcıdan matematik notunu istedim
            mat = scan.nextInt();
        System.out.println("Kimya notunu girin :");//Kullanıcıdan Kimya notunu istedim
            kimya = scan.nextInt();
        System.out.println("Fizik notunu girin :");//Kullanıcıdan Fizik notunu istedim
            fizik = scan.nextInt();
        System.out.println("Türkçe notunu girin :");//Kullanıcıdan Türkçe notunu istedim
            turkce = scan.nextInt();
        System.out.println("Tarih notunu girin :");//Kullanıcıdan Tarih notunu istedim
            tarih = scan.nextInt();
        System.out.println("Müzik notunu girin :");//Kullanıcıdan Müzik notunu istedim
            muzik = scan.nextInt();

        toplam = mat + kimya + fizik + turkce + tarih + muzik;//Değerleri topladım
        ort = toplam / 6.0;//ortalamasını aldım

         boolean kosul1 = ort >= 60;//ortalama 60 büyükmü 
         boolean kosul2 = ort == 60;//ortalama 60 eşitmi
         boolean sonuc = kosul1 || kosul2;//kullanıcının ortalaması 60 veya 60 eşitmi

         String str = sonuc ? "Geçti" : "Kaldı";//geçti ise geçti yazdırıyoruz kaldı ise kaldı yazdırıyoruz
         
         System.out.println("Ortalamanız : " + ort);//ortalamanı yazdırıyoruz
         System.out.println("Durum : " + str);//Geçti kaldı ekrana yazdırıyoruz
    }
}