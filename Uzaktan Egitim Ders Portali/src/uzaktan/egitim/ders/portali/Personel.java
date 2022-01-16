
package uzaktan.egitim.ders.portali;

class Personel {
    String ad;
    String mail;
    String sifre;
    String cinsiyet;
    int yas;
    
    public void setBilgi(String cadi, String cmail, String csifre,String ccinsiyet,int cyas) {
    ad = cadi;
    mail = cmail;
    sifre = csifre;
    cinsiyet = ccinsiyet;
    yas = cyas;
  } 

    
    public void yazdirBilgi() {
    System.out.println("Okulumuz Personeli " + "Adı: " + ad + " E-posta adresi:" + mail + " Sifresi:"+ sifre + " Cinsiyeti: " + cinsiyet + "Yasi"+yas);
  }  
    
}

