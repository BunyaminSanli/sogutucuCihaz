
package nesneodev;

public class Eyleyici {
    
    private static Eyleyici eyleyici = new Eyleyici();
    public static Eyleyici getEyleyici()
    {
        return eyleyici;
    }
    
    private String sonuc;
    public void SogutucuIslemleri(int islem)
    {
        switch (islem)
        {
            case 2:
                sonuc = "Soğutucu açıldı...";
                break;
                
            case 3:
                sonuc = "Soğutucu kapandı...";
                break;
        }
    }
    
    public void setSonuc(String sonuc)
    {
        this.sonuc = sonuc;
    }
    public String getSonuc()
    {
       return this.sonuc;
    }
    
}
