package Udemydersleri;

import java.util.Scanner;

public class dersDeneme{
    
public static void main(String[] args) {

    String userName,password,yanit,newPassword;
    Scanner sc = new Scanner(System.in);

    System.out.println("Lütfen kullanıcı adı ve şifre giriniz...");
    
    userName = sc.nextLine();
    password = sc.nextLine();

    if(userName.equals("fatih")&&password.equals("polat")){
        System.out.println("Giriş yaptınız...");

    }
    else{
        System.out.println("Yeni bir parola eklemek için /y/ değiştirmek için /n/ yazınız...");
        yanit = sc.nextLine();
        
        if(yanit.equals("n")){
            System.out.println("Giriş yapmadınız.");}
    
            else if(yanit.equals("y")){
                System.out.println("Yeni parolanızı belirleyiniz...");
                newPassword = sc.nextLine();
                
                if(newPassword.equals("polat")){
                    System.out.println("Parolanız eski parolanızla aynı. Tekrar deneyiniz...");
                    }
                    else{
                        System.out.println("Başarıyla giriş yaptınız...");
                        }
            }
                
            else{
                System.out.println("/y/ yada /n/ dışında bir harf girdiniz tekrar deneyiniz");
                }

        } 
        

    
    

    
 }
}