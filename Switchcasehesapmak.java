import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a,b,toplam,cikartma,carpma,bolme,islem;
		
		System.out.println("Sayilari giriniz?");
		
		System.out.println("Ilk Sayi");
			a = scan.nextInt();
		System.out.println("Ikinci Sayi");
			b = scan.nextInt();
			
		System.out.println("-----------------------");
		
		System.out.println("Lutfen yapacaginiz islemi seciniz Toplama 1 Çikartma 2"
				+ "Carpma 3 + Bolme 4"); 
			islem = scan.nextInt();
		
			
			switch(islem) {
			case 1 :
				toplam = a+b;
				System.out.println("İki sayinin toplami :"+toplam);
				break;
			case 2 :
				cikartma = a-b;
				System.out.println("Iki sayinin cikartimi :"+cikartma);
				break;
			case 3 :
				carpma = a*b;
				System.out.println("Iki sayinin carpimi :"+carpma);
				break;
			case 4 :
				bolme = a/b;
				System.out.println("Iki sayinin bolumu :"+bolme);
				break;
				
				default:
				System.out.println("1,2,3,4 Farkli bir deger girdiginiz icin hata aldiniz...");
			}
			
		
	}

}
