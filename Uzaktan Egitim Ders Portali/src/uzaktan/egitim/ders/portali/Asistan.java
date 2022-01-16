
package uzaktan.egitim.ders.portali;

public class Asistan extends Personel {
    public String ders;
    
  public void setBilgi(String cadi, String cmail,String csifre,String ccinsiyet, int cyas,String cders) {
    super.setBilgi(cadi,cmail,csifre,ccinsiyet,cyas); 
    ders = cders;
  } 
  
  public void yazdirBilgi() {
    super.yazdirBilgi();
    System.out.println("Asistan Öğretmen Ders: " + ders );
  }  
  
}
