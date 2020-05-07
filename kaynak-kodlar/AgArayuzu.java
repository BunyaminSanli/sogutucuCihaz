
package nesneodev;

import java.util.Scanner;

public class AgArayuzu {
    private static AgArayuzu agArayuzu = new AgArayuzu();
    public static AgArayuzu getAgArayuzu()
    {
        return agArayuzu;
    }
    SicaklikAlgilayici sicaklikAlgilayici = SicaklikAlgilayici.getSicaklikAlgilayici();
    Eyleyici eyleyici = Eyleyici.getEyleyici();
    private int girdi = 0;
    public void Arayuz()
    {
        while (girdi != 4)
        {
            System.out.println("yapmak istediğiniz işlemi seçiniz...");
            System.out.println("1 -> Sıcaklık Görüntüle");
            System.out.println("2 -> Soğutucuyu Aç");
            System.out.println("3 -> Soğutucuyu Kapat");
            System.out.println("4 -> çıkış \n");
        
            Scanner scan = new Scanner(System.in);
            girdi = scan.nextInt();
            //hem case2 hem case3 de kod tekrarı olmaması için parametreyi switch dışında yolluyorum.
            eyleyici.SogutucuIslemleri(girdi);
            switch (girdi)
                {
                    case 1:
                        System.out.println("Sıcaklık: " + sicaklikAlgilayici.getSicaklik());
                        break;
                        
                    case 2:
                        System.out.println(eyleyici.getSonuc());
                        break;
                        
                    case 3:
                        System.out.println(eyleyici.getSonuc());
                        break;
                }
        }
    }
}
