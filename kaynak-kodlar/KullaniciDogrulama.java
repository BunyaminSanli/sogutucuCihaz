
package nesneodev;
import java.sql.*;

public class KullaniciDogrulama {
    
    private static KullaniciDogrulama kullaniciDogrulama = new KullaniciDogrulama();
    public static KullaniciDogrulama getKullaniciDogrulama()
    {
        return kullaniciDogrulama;
    }
    
     String password=null;
     String username=null;
     String id=null;
            
    public boolean kullanici(String kullanciAdi, String sifre)
    {
        String kullanciAdi1 = kullanciAdi;
        String sifre1 = sifre;
        boolean sonuc = false;
        try
        {   /***** Bağlantı kurulumu *****/
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","2720");
            
            String sql= "SELECT \"id\", \"password\", \"username\" FROM \"user\"";

            /***** Sorgu çalıştırma *****/
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            /***** Bağlantı sonlandırma *****/
            conn.close();
           
            String dpassword[];
            dpassword = new String[100];
            String dusername[];
            dusername = new String[100];
            String did[];
            did = new String[100];
            
            int i = 0;
            while(rs.next())
            {
                /***** Kayda ait alan değerlerini değişkene ata *****/
                id = rs.getString("id");
                username = rs.getString("username");
                password  = rs.getString("password");
                did[i] = id;
                dusername[i] = username;
                dpassword[i] = password;
                i++;
            }
            /***** Kaynakları serbest bırak *****/
            rs.close();
            stmt.close();
            int a = i;
            
            for(i=0; i<=a; i++)
            {
                if(kullanciAdi1.equals(dusername[i]) && sifre1.equals(dpassword[i]))
                {
                    sonuc = true;
                    id = did[i];
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     return sonuc;
    }
}
