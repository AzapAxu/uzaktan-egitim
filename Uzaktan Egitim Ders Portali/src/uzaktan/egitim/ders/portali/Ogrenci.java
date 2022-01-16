
package uzaktan.egitim.ders.portali;

public class Ogrenci extends Personel {
  public String sinif;
  public int okulno;

  public void setBilgi(String cadi, String cmail,String csifre,String ccinsiyet, int cyas,String csinif, int cokulno) {
    super.setBilgi(cadi,cmail,csifre,ccinsiyet,cyas);  
 
    sinif = csinif;
    okulno = cokulno;
  } 

  public void yazdirBilgi() {
    super.yazdirBilgi();
    System.out.println("Öğrenci Sınıf: " + sinif + " Okul No.: " + okulno);
  }  
  
}
