
package nesneodev;
import java.util.Random;

public class SicaklikAlgilayici {
    
    private static SicaklikAlgilayici sicaklikAlgilayici= new SicaklikAlgilayici();
    public static SicaklikAlgilayici getSicaklikAlgilayici()
    {
        return sicaklikAlgilayici;
    }
    
    Random r = new Random(); //random sınıfı
    private int sicaklik = r.nextInt(100); 
    
    public void setSicaklik(int tckn)
    {
        this.sicaklik = sicaklik;
    }
    public int getSicaklik()
    {
       return this.sicaklik;
    }
}
