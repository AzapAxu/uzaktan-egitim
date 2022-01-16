
package uzaktan.egitim.ders.portali;

/**
 *
 * @author Ömer Alptuğ
 */
public class TestUzaktanEgitimDersPortali {
    public static void main(String[] args) {
        Ogretmen ogretmen01 = new Ogretmen();
     Ogrenci ogrenci01 = new Ogrenci();
     ogretmen01.setBilgi("Nedim Sakin", "nedimsakin","12345","erkek", 35, "Matematik"); /* ogretmen sınıfı fonksiyonu çağrılır */
     ogrenci01.setBilgi("Ömer Alptuğ Yenipınar", "omertoyenipinar", "12345", "erkek",21,"2. Sınıf",170420022);  /* ogrenci sınıfı fonksiyonu çağrılır */
     ogretmen01.yazdirBilgi();
     ogrenci01.yazdirBilgi();
    }
}
