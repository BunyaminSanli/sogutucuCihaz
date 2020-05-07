
package nesneodev;
import java.util.Scanner;
import java.sql.*;

public class MerkeziIslem {

    public static void main(String[] args) {
        
        KullaniciDogrulama kullaniciDogrulama = KullaniciDogrulama.getKullaniciDogrulama();
        AgArayuzu agArayuzu = AgArayuzu.getAgArayuzu();
        
        String kullanciAdi;
        String sifre;
        
        do{
        System.out.println("Kullanıcı adınızı giriniz ");
        Scanner scan = new Scanner(System.in);
        kullanciAdi = scan.next();
        
        System.out.println();
        
        System.out.println("Sifrenizi giriniz ");
        Scanner scan1 = new Scanner(System.in);
        sifre = scan1.next();
        
        if(kullaniciDogrulama.kullanici(kullanciAdi, sifre) == false)
        {
            System.out.println("Girdiğiniz bilgiler hatalıdır lütfen tekrar giriş yapınız \n");
        }
        else
        {
            System.out.println(kullaniciDogrulama.id + " id numarası ile giriş yaptınız");
            agArayuzu.Arayuz();
        }
        
        }
        while(kullaniciDogrulama.kullanici(kullanciAdi, sifre) == false);
       
    }
    
}
