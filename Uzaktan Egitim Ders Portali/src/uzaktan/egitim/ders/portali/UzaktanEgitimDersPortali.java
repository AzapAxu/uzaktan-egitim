 
package uzaktan.egitim.ders.portali;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class UzaktanEgitimDersPortali {
    static int ogretmensayisi = 5;
    static int ogrencisayisi = 5;
    static int asistansayisi = 2;
    static String[] ogretmenkullanici = new String[400];
    static String[] ogretmensifre = new String[400];
    static String[] ogrencikullanici = new String[400];
    static String[] ogrencisifre = new String[400];
    static String[] asistankullanici = new String[400];
    static String[] asistansifre = new String[400];
    static String adminkullanici = "admin";
    static String adminsifre = "admin";
    static ArrayList <String> ogretmen = new ArrayList<String>();
    static ArrayList <String> ogrenci = new ArrayList<String>();
    static ArrayList <String> asistan = new ArrayList<String>();
    static int arayuz;
    static String kullanici;
    static String sifre;
    static String[] nypharfnot = new String[400];
    static String[] pythonharfnot = new String[400];
    static String[] ayrikharfnot = new String[400];
    static String[] hciharfnot = new String[400];
    static String[] mantikharfnot = new String[400];
    static int[] nypvizenot = new int[400];
    static int[] nypfinalnot = new int[400];
    static double[] nyportalama = new double[400];
    static int[] pythonvizenot = new int[400];
    static int[] pythonfinalnot = new int[400];
    static double[] pythonortalama = new double[400];
    static int[] ayrikvizenot = new int[400];
    static int[] ayrikfinalnot = new int[400];
    static double[] ayrikortalama = new double[400];
    static int[] hcivizenot = new int[400];
    static int[] hcifinalnot = new int[400];
    static double[] hciortalama = new double[400];
    static int[] mantikvizenot = new int[400];
    static int[] mantikfinalnot = new int[400];
    static double[] mantikortalama = new double[400];
    static String [] dersler = new String[40];
    
      
      public static void notVer() throws IOException {
          Scanner notver = new  Scanner(System.in);
          if("eyup".equals(kullanici)) {
            System.out.println("          Nesne Yonelimli Programlama");
            for (int i = 0;i<ogrencisayisi;i+=1) {
          System.out.println("Öğrenci: " +ogrenci.get(i*6));
          System.out.println("Numara: " +ogrenci.get(i*6+5));
          System.out.print("Vize Notu: ");
          nypvizenot[i] = notver.nextInt();
          System.out.print("Final Notu: ");
          nypfinalnot[i] = notver.nextInt();
          nyportalama[i] = (nypfinalnot[i]+nypvizenot[i])/2;
          System.out.println("Ortalama: "+nyportalama[i]);
              if (nyportalama[i]>=90 && nyportalama[i]<=100) {
                  nypharfnot[i] = "AA";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
              }
              else if (nyportalama[i]>=85 && nyportalama[i]<=89) {
                  nypharfnot[i] = "BA";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
              }
              else if (nyportalama[i]>=80 && nyportalama[i]<=84) {
                  nypharfnot[i] = "BB";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
              }
              else if (nyportalama[i]>=75 && nyportalama[i]<=79) {
                  nypharfnot[i] = "CB";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
              }
              else if (nyportalama[i]>=65 && nyportalama[i]<=74) {
                  nypharfnot[i] = "CC";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
              }
              else if (nyportalama[i]>=58 && nyportalama[i]<=64) {
                  nypharfnot[i] = "DC";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  System.out.println("Şartlı Geçer");
              }
              else if (nyportalama[i]>=50 && nyportalama[i]<=57) {
                  nypharfnot[i] = "DD";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  System.out.println("Şartlı Geçer");
              }
              else if (nyportalama[i]>=40 && nyportalama[i]<=49) {
                  nypharfnot[i] = "FD";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  System.out.println("Başarısız.");
              }
              else {
                  nypharfnot[i] = "FF";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  System.out.println("Başarısız.");
              }
        }
            ogretmenArayuz();
          }
          else if("kazim".equals(kullanici)) {
            System.out.println("          Bilgisayar Programlama II");
            for (int i = 0;i<ogrencisayisi;i+=1) {
          System.out.println("Öğrenci: " +ogrenci.get(i*6));
          System.out.println("Numara: " +ogrenci.get(i*6+5));
          System.out.print("Vize Notu: ");
          pythonvizenot[i] = notver.nextInt();
          System.out.print("Final Notu: ");
          pythonfinalnot[i] = notver.nextInt();
          pythonortalama[i] = (pythonfinalnot[i]+pythonvizenot[i])/2;
          System.out.println("Ortalama: "+pythonortalama[i]);
          if (pythonortalama[i]>=90 && pythonortalama[i]<=100) {
                  pythonharfnot[i] = "AA";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  
              }
              else if (pythonortalama[i]>=85 && pythonortalama[i]<=89) {
                  pythonharfnot[i] = "BA";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  
              }
              else if (pythonortalama[i]>=80 && pythonortalama[i]<=84) {
                  pythonharfnot[i] = "BB";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  
              }
              else if (pythonortalama[i]>=75 && pythonortalama[i]<=79) {
                  pythonharfnot[i] = "CB";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  
              }
              else if (pythonortalama[i]>=65 && pythonortalama[i]<=74) {
                  pythonharfnot[i] = "CC";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  
              }
              else if (pythonortalama[i]>=58 && pythonortalama[i]<=64) {
                  pythonharfnot[i] = "DC";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                  
              }
              else if (pythonortalama[i]>=50 && pythonortalama[i]<=57) {
                  pythonharfnot[i] = "DD";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                  
              }
              else if (pythonortalama[i]>=40 && pythonortalama[i]<=49) {
                  pythonharfnot[i] = "FD";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  System.out.println("Başarısız.");
                  
              }
              else {
                  pythonharfnot[i] = "FF";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  System.out.println("Başarısız.");
                  
              }
        }
            ogretmenArayuz();
          }
          else if("suat".equals(kullanici)) {
            System.out.println("          Ayrik Matematik");
            for (int i = 0;i<ogrencisayisi;i+=1) {
          System.out.println("Öğrenci: " +ogrenci.get(i*6));
          System.out.println("Numara: " +ogrenci.get(i*6+5));
          System.out.print("Vize Notu: ");
          ayrikvizenot[i] = notver.nextInt();
          System.out.print("Final Notu: ");
          ayrikfinalnot[i] = notver.nextInt();
          ayrikortalama[i] = (ayrikfinalnot[i]+ayrikvizenot[i])/2;
          System.out.println("Ortalama: "+ayrikortalama[i]);
          if (ayrikortalama[i]>=90 && ayrikortalama[i]<=100) {
                  ayrikharfnot[i] = "AA";
                  System.out.println("Harf Notu: "+ayrikharfnot[i]);
                 
              }
              else if (ayrikortalama[i]>=85 && ayrikortalama[i]<=89) {
                  ayrikharfnot[i] = "BA";
                  System.out.println("Harf Notu: "+ayrikharfnot[i]);
                  
              }
              else if (ayrikortalama[i]>=80 && ayrikortalama[i]<=84) {
                  ayrikharfnot[i] = "BB";
                  System.out.println("Harf Notu: "+ayrikharfnot[i]);
                  
              }
              else if (ayrikortalama[i]>=75 && ayrikortalama[i]<=79) {
                  ayrikharfnot[i] = "CB";
                  System.out.println("Harf Notu: "+ayrikharfnot[i]);
                  
              }
              else if (ayrikortalama[i]>=65 && ayrikortalama[i]<=74) {
                  ayrikharfnot[i] = "CC";
                  System.out.println("Harf Notu: "+ayrikharfnot[i]);
                  
              }
              else if (ayrikortalama[i]>=58 && ayrikortalama[i]<=64) {
                  ayrikharfnot[i] = "DC";
                  System.out.println("Harf Notu: "+ayrikharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                 
              }
              else if (ayrikortalama[i]>=50 && ayrikortalama[i]<=57) {
                  ayrikharfnot[i] = "DD";
                  System.out.println("Harf Notu: "+ayrikharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                  
              }
              else if (ayrikortalama[i]>=40 && ayrikortalama[i]<=49) {
                  ayrikharfnot[i] = "FD";
                  System.out.println("Harf Notu: "+ayrikharfnot[i]);
                  System.out.println("Başarısız.");
                  
              }
              else {
                  ayrikharfnot[i] = "FF";
                  System.out.println("Harf Notu: "+ayrikharfnot[i]);
                  System.out.println("Başarısız.");
                  
              }
        }
            ogretmenArayuz();
          }
          else if("anil".equals(kullanici)) {
            System.out.println("          Insan-Bilgisayar Etkilesimi ve Gorsellik");
            for (int i = 0;i<ogrencisayisi;i+=1) {
          System.out.println("Öğrenci: " +ogrenci.get(i*6));
          System.out.println("Numara: " +ogrenci.get(i*6+5));
          System.out.print("Vize Notu: ");
          hcivizenot[i] = notver.nextInt();
          System.out.print("Final Notu: ");
          hcifinalnot[i] = notver.nextInt();
          hciortalama[i] = (hcifinalnot[i]+hcivizenot[i])/2;
          System.out.println("Ortalama: "+hciortalama[i]);
          if (hciortalama[i]>=90 && hciortalama[i]<=100) {
                  hciharfnot[i] = "AA";
                  System.out.println("Harf Notu: "+hciharfnot[i]);
                  
              }
              else if (hciortalama[i]>=85 && hciortalama[i]<=89) {
                  hciharfnot[i] = "BA";
                  System.out.println("Harf Notu: "+hciharfnot[i]);
                  
              }
              else if (hciortalama[i]>=80 && hciortalama[i]<=84) {
                  hciharfnot[i] = "BB";
                  System.out.println("Harf Notu: "+hciharfnot[i]);
                  
              }
              else if (hciortalama[i]>=75 && hciortalama[i]<=79) {
                  hciharfnot[i] = "CB";
                  System.out.println("Harf Notu: "+hciharfnot[i]);
                  
              }
              else if (hciortalama[i]>=65 && hciortalama[i]<=74) {
                  hciharfnot[i] = "CC";
                  System.out.println("Harf Notu: "+hciharfnot[i]);
                  
              }
              else if (hciortalama[i]>=58 && hciortalama[i]<=64) {
                  hciharfnot[i] = "DC";
                  System.out.println("Harf Notu: "+hciharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                  
              }
              else if (hciortalama[i]>=50 && hciortalama[i]<=57) {
                  hciharfnot[i] = "DD";
                  System.out.println("Harf Notu: "+hciharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                  
              }
              else if (hciortalama[i]>=40 && hciortalama[i]<=49) {
                  hciharfnot[i] = "FD";
                  System.out.println("Harf Notu: "+hciharfnot[i]);
                  System.out.println("Başarısız.");
                  
              }
              else {
                  hciharfnot[i] = "FF";
                  System.out.println("Harf Notu: "+hciharfnot[i]);
                  System.out.println("Başarısız.");
                  
              }
        }
            ogretmenArayuz();
          }
          else if("ayse".equals(kullanici)) {
            System.out.println("          Mantik Devreleri");
            for (int i = 0;i<ogrencisayisi;i+=1) {
          System.out.println("Öğrenci: " +ogrenci.get(i*6));
          System.out.println("Numara: " +ogrenci.get(i*6+5));
          System.out.print("Vize Notu: ");
          mantikvizenot[i] = notver.nextInt();
          System.out.print("Final Notu: ");
          mantikfinalnot[i] = notver.nextInt();
          mantikortalama[i] = (mantikfinalnot[i]+mantikvizenot[i])/2;
          System.out.println("Ortalama: "+mantikortalama[i]);
          if (mantikortalama[i]>=90 && mantikortalama[i]<=100) {
                  mantikharfnot[i] = "AA";
                  System.out.println("Harf Notu: "+mantikharfnot[i]);
                  
              }
              else if (mantikortalama[i]>=85 && mantikortalama[i]<=89) {
                  mantikharfnot[i] = "BA";
                  System.out.println("Harf Notu: "+mantikharfnot[i]);
                  
              }
              else if (mantikortalama[i]>=80 && mantikortalama[i]<=84) {
                  mantikharfnot[i] = "BB";
                  System.out.println("Harf Notu: "+mantikharfnot[i]);
                  
              }
              else if (mantikortalama[i]>=75 && mantikortalama[i]<=79) {
                  mantikharfnot[i] = "CB";
                  System.out.println("Harf Notu: "+mantikharfnot[i]);
                  
              }
              else if (mantikortalama[i]>=65 && mantikortalama[i]<=74) {
                  mantikharfnot[i] = "CC";
                  System.out.println("Harf Notu: "+mantikharfnot[i]);
                  
              }
              else if (mantikortalama[i]>=58 && mantikortalama[i]<=64) {
                  mantikharfnot[i] = "DC";
                  System.out.println("Harf Notu: "+mantikharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                  
              }
              else if (mantikortalama[i]>=50 && mantikortalama[i]<=57) {
                  mantikharfnot[i] = "DD";
                  System.out.println("Harf Notu: "+mantikharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                  
              }
              else if (mantikortalama[i]>=40 && mantikortalama[i]<=49) {
                  mantikharfnot[i] = "FD";
                  System.out.println("Harf Notu: "+mantikharfnot[i]);
                  System.out.println("Başarısız.");
                 
              }
              else {
                  mantikharfnot[i] = "FF";
                  System.out.println("Harf Notu: "+mantikharfnot[i]);
                  System.out.println("Başarısız.");
                  
              }
        }
            ogretmenArayuz();
          }
         else if("abdulsamet".equals(kullanici)) {
            System.out.println("          Nesne Yonelimli Programlama");
            for (int i = 0;i<ogrencisayisi;i+=1) {
          System.out.println("Öğrenci: " +ogrenci.get(i*6));
          System.out.println("Numara: " +ogrenci.get(i*6+5));
          System.out.print("Vize Notu: ");
          nypvizenot[i] = notver.nextInt();
          System.out.print("Final Notu: ");
          nypfinalnot[i] = notver.nextInt();
          nyportalama[i] = (nypfinalnot[i]+nypvizenot[i])/2;
          System.out.println("Ortalama: "+nyportalama[i]);
          if (nyportalama[i]>=90 && nyportalama[i]<=100) {
                  nypharfnot[i] = "AA";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  
              }
              else if (nyportalama[i]>=85 && nyportalama[i]<=89) {
                  nypharfnot[i] = "BA";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  
              }
              else if (nyportalama[i]>=80 && nyportalama[i]<=84) {
                  nypharfnot[i] = "BB";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  
              }
              else if (nyportalama[i]>=75 && nyportalama[i]<=79) {
                  nypharfnot[i] = "CB";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  
              }
              else if (nyportalama[i]>=65 && nyportalama[i]<=74) {
                  nypharfnot[i] = "CC";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  
              }
              else if (nyportalama[i]>=58 && nyportalama[i]<=64) {
                  nypharfnot[i] = "DC";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                  
              }
              else if (nyportalama[i]>=50 && nyportalama[i]<=57) {
                  nypharfnot[i] = "DD";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                  
              }
              else if (nyportalama[i]>=40 && nyportalama[i]<=49) {
                  nypharfnot[i] = "FD";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  System.out.println("Başarısız.");
                  
              }
              else {
                  nypharfnot[i] = "FF";
                  System.out.println("Harf Notu: "+nypharfnot[i]);
                  System.out.println("Başarısız.");
                  
              }
        }
            asistanArayuz();
          }
         else if("abdullah".equals(kullanici)) {
            System.out.println("          Bilgisayar Programlama II");
            for (int i = 0;i<ogrencisayisi;i+=1) {
          System.out.println("Öğrenci: " +ogrenci.get(i*6));
          System.out.println("Numara: " +ogrenci.get(i*6+5));
          System.out.print("Vize Notu: ");
          pythonvizenot[i] = notver.nextInt();
          System.out.print("Final Notu: ");
          pythonfinalnot[i] = notver.nextInt();
          pythonortalama[i] = (pythonfinalnot[i]+pythonvizenot[i])/2;
          System.out.println("Ortalama: "+pythonortalama[i]);
          if (pythonortalama[i]>=90 && pythonortalama[i]<=100) {
                  pythonharfnot[i] = "AA";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  
              }
              else if (pythonortalama[i]>=85 && pythonortalama[i]<=89) {
                  pythonharfnot[i] = "BA";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  
              }
              else if (pythonortalama[i]>=80 && pythonortalama[i]<=84) {
                  pythonharfnot[i] = "BB";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                 
              }
              else if (pythonortalama[i]>=75 && pythonortalama[i]<=79) {
                  pythonharfnot[i] = "CB";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                 
              }
              else if (pythonortalama[i]>=65 && pythonortalama[i]<=74) {
                  pythonharfnot[i] = "CC";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                 
              }
              else if (pythonortalama[i]>=58 && pythonortalama[i]<=64) {
                  pythonharfnot[i] = "DC";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                  
              }
              else if (pythonortalama[i]>=50 && pythonortalama[i]<=57) {
                  pythonharfnot[i] = "DD";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  System.out.println("Şartlı Geçer.");
                  
              }
              else if (pythonortalama[i]>=40 && pythonortalama[i]<=49) {
                  pythonharfnot[i] = "FD";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  System.out.println("Başarısız.");
                  
              }
              else {
                  pythonharfnot[i] = "FF";
                  System.out.println("Harf Notu: "+pythonharfnot[i]);
                  System.out.println("Başarısız.");
                  
              }
        }
            asistanArayuz();
          }
      }
      
      public static void cikisYap() throws IOException {
              arayuz();
              if (arayuz == 1) {
                  adminArayuz();
              }
              else if (arayuz == 2) {
                  ogretmenArayuz();
              }
              else if (arayuz == 3) {
                  ogrenciArayuz();
              }
              else if (arayuz == 4) {
                  asistanArayuz();
              }
              else {
                  System.out.println("E-Mail Veya Şifreniz Hatalı.Lütfen Tekrar Deneyiniz...");
              }
      }
      
      public static void ogretmenNotGoruntule() throws IOException {
          if("eyup".equals(kullanici)) {
              for (int i=0;i<ogrencisayisi;i++) {
                  System.out.println(ogrenci.get(i*6)+": ");
                  System.out.println("vize: "+nypvizenot[i]+" final: "+nypfinalnot[i]+" ortalama: "+nyportalama[i]);
                  System.out.println("harf notu: "+nypharfnot[i]);
                  if ("DC".equals(nypharfnot[i]) || "DD".equals(nypharfnot[i])) {
                      System.out.println("Şartlı Geçer.");
                  }
                  else if ("FD".equals(nypharfnot[i]) || "FF".equals(nypharfnot[i])) {
                      System.out.println("Başarısız.");
                  }
                  else{
                      System.out.println("Geçer.");
                  }
              }
              ogretmenArayuz();
          }
          else if("kazim".equals(kullanici)) {
              for (int i=0;i<ogrencisayisi;i++) {
                  System.out.println(ogrenci.get(i*6)+": ");
                  System.out.println("vize: "+pythonvizenot[i]+" final: "+pythonfinalnot[i]+" ortalama: "+pythonortalama[i]);
                  System.out.println("harf notu: "+pythonharfnot[i]);
                  if ("DC".equals(pythonharfnot[i]) || "DD".equals(pythonharfnot[i])) {
                      System.out.println("Şartlı Geçer.");
                  }
                  else if ("FD".equals(pythonharfnot[i]) || "FF".equals(pythonharfnot[i])) {
                      System.out.println("Başarısız.");
                  }
                  else{
                      System.out.println("Geçer.");
                  }
              }
              ogretmenArayuz();
          }
          else if("suat".equals(kullanici)) {
              for (int i=0;i<ogrencisayisi;i++) {
                  System.out.println(ogrenci.get(i*6)+": ");
                  System.out.println("vize: "+ayrikvizenot[i]+" final: "+ayrikfinalnot[i]+" ortalama: "+ayrikortalama[i]);
                  System.out.println("harf notu: "+ayrikharfnot[i]);
                  if ("DC".equals(ayrikharfnot[i]) || "DD".equals(ayrikharfnot[i])) {
                      System.out.println("Şartlı Geçer.");
                  }
                  else if ("FD".equals(ayrikharfnot[i]) || "FF".equals(ayrikharfnot[i])) {
                      System.out.println("Başarısız.");
                  }
                  else{
                      System.out.println("Geçer.");
                  }
              }
              ogretmenArayuz();
          }
          else if("anil".equals(kullanici)) {
              for (int i=0;i<ogrencisayisi;i++) {
                  System.out.println(ogrenci.get(i*6)+": ");
                  System.out.println("vize: "+hcivizenot[i]+" final: "+hcifinalnot[i]+" ortalama: "+hciortalama[i]);
                  System.out.println("harf notu: "+hciharfnot[i]);
                  if ("DC".equals(hciharfnot[i]) || "DD".equals(hciharfnot[i])) {
                      System.out.println("Şartlı Geçer.");
                  }
                  else if ("FD".equals(hciharfnot[i]) || "FF".equals(hciharfnot[i])) {
                      System.out.println("Başarısız.");
                  }
                  else{
                      System.out.println("Geçer.");
                  }
              }
              ogretmenArayuz();
          }
          else if("ayse".equals(kullanici)) {
              for (int i=0;i<ogrencisayisi;i++) {
                  System.out.println(ogrenci.get(i*6)+": ");
                  System.out.println("vize: "+mantikvizenot[i]+" final: "+mantikfinalnot[i]+" ortalama: "+mantikortalama[i]);
                  System.out.println("harf notu: "+mantikharfnot[i]);
                  if ("DC".equals(mantikharfnot[i]) || "DD".equals(mantikharfnot[i])) {
                      System.out.println("Şartlı Geçer.");
                  }
                  else if ("FD".equals(mantikharfnot[i]) || "FF".equals(mantikharfnot[i])) {
                      System.out.println("Başarısız.");
                  }
                  else{
                      System.out.println("Geçer.");
                  }
              }
              ogretmenArayuz();
          }
          else if("abdulsamet".equals(kullanici)) {
              for (int i=0;i<ogrencisayisi;i++) {
                  System.out.println(ogrenci.get(i*6)+": ");
                  System.out.println("vize: "+nypvizenot[i]+" final: "+nypfinalnot[i]+" ortalama: "+nyportalama[i]);
                  System.out.println("harf notu: "+nypharfnot[i]);
                  if ("DC".equals(nypharfnot[i]) || "DD".equals(nypharfnot[i])) {
                      System.out.println("Şartlı Geçer.");
                  }
                  else if ("FD".equals(nypharfnot[i]) || "FF".equals(nypharfnot[i])) {
                      System.out.println("Başarısız.");
                  }
                  else{
                      System.out.println("Geçer.");
                  }
              }
              asistanArayuz();
          }
          else if("abdullah".equals(kullanici)) {
              for (int i=0;i<(ogrencisayisi);i++) {
                  System.out.println(ogrenci.get(i*6)+": ");
                  System.out.println("vize: "+pythonvizenot[i]+" final: "+pythonfinalnot[i]+" ortalama: "+pythonortalama[i]);
                  System.out.println("harf notu: "+ pythonharfnot[i]);
                  if ("DC".equals(pythonharfnot[i]) || "DD".equals(pythonharfnot[i])) {
                      System.out.println("Şartlı Geçer.");
                  }
                  else if ("FD".equals(pythonharfnot[i]) || "FF".equals(pythonharfnot[i])) {
                      System.out.println("Başarısız.");
                  }
                  else{
                      System.out.println("Geçer.");
                  }
              }
              asistanArayuz();
          }
      }
      
      public static void ogrenciNotGoruntule() {
          for (int i = 0;i<(ogrencisayisi-1);i++) {
              if (kullanici.equals(ogrenci.get(6*i+1))){
                  System.out.println("Nesne Yönelimli Programlama vize: "+nypvizenot[i]+"Nesne Yönelimli Programlama final: "+nypfinalnot[i]+"Nesne Yönelimli Programlama ortalame: "+nyportalama[i]);
                  System.out.println("Nesne Yönelimli Programlama Harf Notu: "+nypharfnot[i]);
                  if ("DC".equals(nypharfnot[i]) || "DD".equals(nypharfnot[i])){
                      System.out.println("Şartlı Geçtiniz.");
                  }
                  else if("FD".equals(nypharfnot[i]) || "FF".equals(nypharfnot[i])) {
                      System.out.println("Başarısız oldunuz.");
                  }
                  else {
                      System.out.println("Geçtiniz.");
                  }
                  System.out.println("Bilgisayar Programlama II vize: "+pythonvizenot[i]+"Bilgisayar Programlama II final: "+pythonfinalnot[i]+"Bilgisayar Programlama II ortalame: "+pythonortalama[i]);
                  System.out.println("Bilgisayar Programlama II Harf Notu: "+pythonharfnot[i]);
                  if ("DC".equals(pythonharfnot[i]) || "DD".equals(pythonharfnot[i])){
                      System.out.println("Şartlı Geçtiniz.");
                  }
                  else if("FD".equals(pythonharfnot[i]) || "FF".equals(pythonharfnot[i])) {
                      System.out.println("Başarısız oldunuz.");
                  }
                  else {
                      System.out.println("Geçtiniz.");
                  }
                  System.out.println("Ayrık Matematik vize: "+ayrikvizenot[i]+"Ayrık Matematik final: "+ayrikfinalnot[i]+"Ayrık Matematik ortalame: "+ayrikortalama[i]);
                  System.out.println("Ayrık Matematik Harf Notu: "+ayrikharfnot[i]);
                  if ("DC".equals(ayrikharfnot[i]) || "DD".equals(ayrikharfnot[i])){
                      System.out.println("Şartlı Geçtiniz.");
                  }
                  else if("FD".equals(ayrikharfnot[i]) || "FF".equals(ayrikharfnot[i])) {
                      System.out.println("Başarısız oldunuz.");
                  }
                  else {
                      System.out.println("Geçtiniz.");
                  }
                  System.out.println("İnsan-Bilgisayar Etkileşimi vize: "+hcivizenot[i]+"İnsan-Bilgisayar Etkileşimi final: "+hcifinalnot[i]+"İnsan-Bilgisayar Etkileşimi ortalame: "+hciortalama[i]);
                  System.out.println("İnsan-Bilgisayar Etkileşimi Harf Notu: "+hciharfnot[i]);
                  if ("DC".equals(hciharfnot[i]) || "DD".equals(hciharfnot[i])){
                      System.out.println("Şartlı Geçtiniz.");
                  }
                  else if("FD".equals(hciharfnot[i]) || "FF".equals(hciharfnot[i])) {
                      System.out.println("Başarısız oldunuz.");
                  }
                  else {
                      System.out.println("Geçtiniz.");
                  }
                  System.out.println("Mantık Devreleri vize: "+mantikvizenot[i]+"Mantık Devreleri final: "+mantikfinalnot[i]+"Mantık Devreleri ortalame: "+mantikortalama[i]);
                  System.out.println("Mantık Devreleri Harf Notu: "+mantikharfnot[i]);
                  if ("DC".equals(mantikharfnot[i]) || "DD".equals(mantikharfnot[i])){
                      System.out.println("Şartlı Geçtiniz.");
                  }
                  else if("FD".equals(mantikharfnot[i]) || "FF".equals(mantikharfnot[i])) {
                      System.out.println("Başarısız oldunuz.");
                  }
                  else {
                      System.out.println("Geçtiniz.");  
                  }
                  }
              }
          ogrenciArayuz();
          }
      
      public static void dersler() {
          Scanner ders = new Scanner(System.in);
          System.out.println("Ders Listesi Aşağıdaki Gibidir.Lütfen İşlem Yapmak İstediğiniz Dersin Numarasını Giriniz: ");
          System.out.println("Nesne Yönelimli Programlama              1");
          System.out.println("Bilgisayar Programlama II                2");
          System.out.println("Ayrık Matematik                          3");
          System.out.println("İnsan-Bilgisayar Etkileşimi ve Görsellik 4");
          System.out.println("Mantık Devreleri                         5");
                if (ders.nextInt() == 1){
                    Scanner derslerGeri = new Scanner(System.in);
                    System.out.println("         "+ogretmen.get(5));
                    System.out.println("Öğretmen Adı: "+ogretmen.get(0));
                    System.out.println("Öğretmeninle İletişime Geç: "+ogretmen.get(1));
                    System.out.println("Dersin Kredisi: 6");
                    System.out.println("Dersi Başlat");
                    System.out.println("Ana Sayfaya Geri Dönmek İçin 1'i Tuşlayınız.");
                    if (derslerGeri.nextInt() == 1) {
                        System.out.println("Ana Sayfaya Yönlendiriliyorsunuz...");
                        ogrenciArayuz();
                    }
                    else {
                        System.out.println("Geçersiz Bir Karakter Girdiniz.Giriş Ekranına Yönlendiriliyorsunuz...");
                    }
                }
                else if(ders.nextInt() == 2){
                    Scanner derslerGeri = new Scanner(System.in);
                    System.out.println("          "+ogretmen.get(11));
                    System.out.println("Öğretmen Adı: "+ogretmen.get(6));
                    System.out.println("Öğretmeninle İletişime Geç: "+ogretmen.get(7));
                    System.out.println("Dersin Kredisi: 7");
                    System.out.println("Dersi Başlat");
                    System.out.println("Ana Sayfaya Geri Dönmek İçin 1'i Tuşlayınız.");
                    if (derslerGeri.nextInt() == 1) {
                        System.out.println("Ana Sayfaya Yönlendiriliyorsunuz...");
                        ogrenciArayuz();
                    }
                    else {
                        System.out.println("Geçersiz Bir Karakter Girdiniz.Giriş Ekranına Yönlendiriliyorsunuz...");
                    }
                }
                else if(ders.nextInt() == 3){
                    Scanner derslerGeri = new Scanner(System.in);
                    System.out.println("          "+ogretmen.get(17));
                    System.out.println("Öğretmen Adı: "+ogretmen.get(12));
                    System.out.println("Öğretmeninle İletişime Geç: "+ogretmen.get(13));
                    System.out.println("Dersin Kredisi: 3");
                    System.out.println("Dersi Başlat");
                    System.out.println("Ana Sayfaya Geri Dönmek İçin 1'i Tuşlayınız.");
                    if (derslerGeri.nextInt() == 1) {
                        System.out.println("Ana Sayfaya Yönlendiriliyorsunuz...");
                        ogrenciArayuz();
                    }
                    else {
                        System.out.println("Geçersiz Bir Karakter Girdiniz.Giriş Ekranına Yönlendiriliyorsunuz...");
                    }
                }
                else if(ders.nextInt() == 4){
                    Scanner derslerGeri = new Scanner(System.in);
                    System.out.println("          "+ogretmen.get(23));
                    System.out.println("Öğretmen Adı: "+ogretmen.get(18));
                    System.out.println("Öğretmeninle İletişime Geç: "+ogretmen.get(19));
                    System.out.println("Dersin Kredisi: 4");
                    System.out.println("Dersi Başlat");
                    System.out.println("Ana Sayfaya Geri Dönmek İçin 1'i Tuşlayınız.");
                    if (derslerGeri.nextInt() == 1) {
                        System.out.println("Ana Sayfaya Yönlendiriliyorsunuz...");
                        ogrenciArayuz();
                    }
                    else {
                        System.out.println("Geçersiz Bir Karakter Girdiniz.Giriş Ekranına Yönlendiriliyorsunuz...");
                    }
                }
                else if(ders.nextInt() == 5){
                    Scanner derslerGeri = new Scanner(System.in);
                    System.out.println("          "+ogretmen.get(29));
                    System.out.println("Öğretmen Adı: "+ogretmen.get(24));
                    System.out.println("Öğretmeninle İletişime Geç: "+ogretmen.get(25));
                    System.out.println("Dersin Kredisi: 5");
                    System.out.println("Dersi Başlat");
                    System.out.println("Ana Sayfaya Geri Dönmek İçin 1'i Tuşlayınız.");
                    if (derslerGeri.nextInt() == 1) {
                        System.out.println("Ana Sayfaya Yönlendiriliyorsunuz...");
                        ogrenciArayuz();
                    }
                    else {
                        System.out.println("Geçersiz Bir Karakter Girdiniz.Giriş Ekranına Yönlendiriliyorsunuz...");
                    }
                }
                else {
                    System.out.println("Lütfen Geçerli Bir Numara Giriniz.Ana Sayfaya Yeniden Yönlendiriliyorsunuz...");
                    ogrenciArayuz();
                }
      }
      
      public static void transkript() {
          double a = 0;
          double b = 0;
          double c = 0;
          double d = 0;
          double e = 0;
          for (int i=0;i<4;i++) {
          if (kullanici.equals(ogrenci.get(i*6+1))) {
              if ("AA".equals(nypharfnot[i])) {
                  a = 6*4;
              }
              else if ("BA".equals(nypharfnot[i])) {
                  a = 6*3.5;
              }
              else if ("BB".equals(nypharfnot[i])) {
                  a = 6*3;
              }
              else if ("CB".equals(nypharfnot[i])) {
                  a = 6*2.5;
              }
              else if ("CC".equals(nypharfnot[i])) {
                  a = 6*2;
              }
              else if ("DC".equals(nypharfnot[i])) {
                  a = 6*1.5;
              }
              else if ("DD".equals(nypharfnot[i])) {
                  a = 6*1;
              }
              else if ("FD".equals(nypharfnot[i])) {
                  a = 6*0.5;
              }
              else if ("FF".equals(nypharfnot[i])) {
                  a = 6*0;
              }
              if ("AA".equals(pythonharfnot[i])) {
                  b = 7*4;
              }
              else if ("BA".equals(pythonharfnot[i])) {
                  b = 7*3.5;
              }
              else if ("BB".equals(pythonharfnot[i])) {
                  b = 7*3;
              }
              else if ("CB".equals(pythonharfnot[i])) {
                  b = 7*2.5;
              }
              else if ("CC".equals(pythonharfnot[i])) {
                  b = 7*2;
              }
              else if ("DC".equals(pythonharfnot[i])) {
                  b = 7*1.5;
              }
              else if ("DD".equals(pythonharfnot[i])) {
                  b = 7*1;
              }
              else if ("FD".equals(pythonharfnot[i])) {
                  b = 7*0.5;
              }
              else if ("FF".equals(pythonharfnot[i])) {
                  b = 7*0;
              }
              if ("AA".equals(ayrikharfnot[i])) {
                  c = 3*4;
              }
              else if ("BA".equals(ayrikharfnot[i])) {
                  c = 3*3.5;
              }
              else if ("BB".equals(ayrikharfnot[i])) {
                  c = 3*3;
              }
              else if ("CB".equals(ayrikharfnot[i])) {
                  c = 3*2.5;
              }
              else if ("CC".equals(ayrikharfnot[i])) {
                  c = 3*2;
              }
              else if ("DC".equals(ayrikharfnot[i])) {
                  c = 3*1.5;
              }
              else if ("DD".equals(ayrikharfnot[i])) {
                  c = 3*1;
              }
              else if ("FD".equals(ayrikharfnot[i])) {
                  c = 3*0.5;
              }
              else if ("FF".equals(ayrikharfnot[i])) {
                  c = 3*0;
              }
              if ("AA".equals(hciharfnot[i])) {
                  d = 4*4;
              }
              else if ("BA".equals(hciharfnot[i])) {
                  d = 4*3.5;
              }
              else if ("BB".equals(hciharfnot[i])) {
                  d = 4*3;
              }
              else if ("CB".equals(hciharfnot[i])) {
                  d = 4*2.5;
              }
              else if ("CC".equals(hciharfnot[i])) {
                  d = 4*2;
              }
              else if ("DC".equals(hciharfnot[i])) {
                  d = 4*1.5;
              }
              else if ("DD".equals(hciharfnot[i])) {
                  d = 4*1;
              }
              else if ("FD".equals(hciharfnot[i])) {
                  d = 4*0.5;
              }
              else if ("FF".equals(hciharfnot[i])) {
                  d = 4*0;
              }
              if ("AA".equals(mantikharfnot[i])) {
                  e = 5*4;
              }
              else if ("BA".equals(mantikharfnot[i])) {
                  e = 5*3.5;
              }
              else if ("BB".equals(mantikharfnot[i])) {
                  e = 5*3;
              }
              else if ("CB".equals(mantikharfnot[i])) {
                  e = 5*2.5;
              }
              else if ("CC".equals(mantikharfnot[i])) {
                  e = 5*2;
              }
              else if ("DC".equals(mantikharfnot[i])) {
                  e = 5*1.5;
              }
              else if ("DD".equals(mantikharfnot[i])) {
                  e = 5*1;
              }
              else if ("FD".equals(mantikharfnot[i])) {
                  e = 5*0.5;
              }
              else if ("FF".equals(mantikharfnot[i])) {
                  e = 5*0;
              }
              double transkript = ((a+b+c+d+e)/25);
              System.out.println("GANONUZ: "+transkript);
          }
        }
      }
      
      public static void adminArayuz() throws IOException {
          System.out.println("                     Ana Sayfa");
          System.out.println("Lütfen Gerçekleştirmek İstediğiniz İşlem Numarasını Giriniz:");
          System.out.println("(1:Öğretmen İşlemleri 2:Öğrenci İşlemleri 3:Asistan İşlemleri 4:Sistemden Çıkış Yapma)");
          Scanner adminSecim = new Scanner(System.in);
          int a = adminSecim.nextInt();
          if (a == 1){
              System.out.println("Lütfen Gerçekleştirmek İstediğiniz İşlem Numarasını Giriniz:");
              System.out.println("(1:Öğretmen Ekle 2:Öğretmen Listesi Görüntüle 3:Öğretmen Sil 4:Sistemden Çıkış Yapma)");
              int c = adminSecim.nextInt();
              if (c == 1) {
                  ogretmenEkle();
                  adminArayuz();
              }
              else if (c==2) {
                  ogretmenListesi();
                  adminArayuz();
              }
              else if (c==3) {
                  ogretmenSil();
                  adminArayuz();
              }
              else if (c==4) {
                  System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
                  cikisYap();
              }
              else{
                  System.out.println("Hatalı Bir Numara Girdiniz.Sistemden Çıkış Yapılıyor...");
              }
          }
          
          else if (a == 2) {
              System.out.println("Lütfen Gerçekleştirmek İstediğiniz İşlem Numarasını Giriniz:");
              System.out.println("(1:Öğrenci Ekle 2:Öğrenci Listesi Görüntüle 3:Öğrenci Sil 4:Sistemden Çıkış Yapma)");
              int d = adminSecim.nextInt();
              if (d == 1) {
                  ogrenciEkle();
                  adminArayuz();
              }
              else if (d==2) {
                  ogrenciListesi();
                  adminArayuz();
              }
              else if (d==3) {
                  ogrenciSil();
                  adminArayuz();
              }
              else if (d==4) {
                      System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
                      cikisYap();
              }
              else{
                  System.out.println("Hatalı Bir Numara Girdiniz.Sistemden Çıkış Yapılıyor...");
              }
          }
          
          else if (a == 3) {
              System.out.println("Lütfen Gerçekleştirmek İstediğiniz İşlem Numarasını Giriniz:");
              System.out.println("(1:Asistan Ekle 2:Asistan Listesi Görüntüle 3:Asistan Sil 4:Sistemden Çıkış Yapma)");
              int e = adminSecim.nextInt();
              if (e == 1) {
                  asistanEkle();
                  adminArayuz();
              }
              else if (e==2) {
                  asistanListesi();
                  adminArayuz();
              }
              else if (e==3) {
                  asistanSil();
                  adminArayuz();
              }
              else if (e==4) {
                      System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
                      cikisYap();
              }
              else{
                  System.out.println("Hatalı Bir Numara Girdiniz.Sistemden Çıkış Yapılıyor...");
              }
          }
          else if (a == 4) {
              System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
              cikisYap();
          }
          else {
              System.out.println("Lütfen Geçerli Bir Sayı Giriniz.Bir Hakkınız Kaldı.");
              System.out.println("(1:Öğretmen İşlemleri 2:Öğrenci İşlemleri 3:Asistan İşlemleri 4:Sistemden Çıkış Yapma)");
              int b = adminSecim.nextInt();
              if (b == 1){
                  System.out.println("Lütfen Gerçekleştirmek İstediğiniz İşlem Numarasını Giriniz:");
              System.out.println("(1:Öğretmen Ekle 2:Öğretmen Listesi Görüntüle 3:Öğretmen Sil 4:Sistemden Çıkış Yapma)");
              int f = adminSecim.nextInt();
              if (f == 1) {
                  ogretmenEkle();
                  adminArayuz();
              }
              else if (f==2) {
                  ogretmenListesi();
                  adminArayuz();
              }
              else if (f==3) {
                  ogretmenSil();
                  adminArayuz();
              }
              else if (f==4) {
                  System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
                  cikisYap();
              }
              else{
                  System.out.println("Hatalı Bir Numara Girdiniz.Sistemden Çıkış Yapılıyor...");
              }
              }
          
              else if (b == 2) {
                  System.out.println("Lütfen Gerçekleştirmek İstediğiniz İşlem Numarasını Giriniz:");
              System.out.println("(1:Öğrenci Ekle 2:Öğrenci Listesi Görüntüle 3:Öğrenci Sil 4:Sistemden Çıkış Yapma)");
              int g = adminSecim.nextInt();
              if (g == 1) {
                  ogrenciEkle();
                  adminArayuz();
              }
              else if (g==2) {
                  ogrenciListesi();
                  adminArayuz();
              }
              else if (g==3) {
                  ogrenciSil();
                  adminArayuz();
              }
              else if (g==4) {
                      System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
                      cikisYap();
              }
              else{
                  System.out.println("Hatalı Bir Numara Girdiniz.Sistemden Çıkış Yapılıyor...");
              }
              }
          
              else if (b == 3) {
                  System.out.println("Lütfen Gerçekleştirmek İstediğiniz İşlem Numarasını Giriniz:");
              System.out.println("(1:Asistan Ekle 2:Asistan Listesi Görüntüle 3:Asistan Sil 4:Sistemden Çıkış Yapma)");
              int h = adminSecim.nextInt();
              if (h == 1) {
                  asistanEkle();
                  adminArayuz();
              }
              else if (h==2) {
                  asistanListesi();
                  adminArayuz();
              }
              else if (h==3) {
                  asistanSil();
                  adminArayuz();
              }
              else if (h==4) {
                      System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
                      cikisYap();
              }
              else{
                  System.out.println("Hatalı Bir Numara Girdiniz.Sistemden Çıkış Yapılıyor...");
              }
              }
              else if (b == 4) {
                  System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
                  cikisYap();
              }
              else {
                  System.out.println("İki Defa Hatalı Seçim Yaptınız.Sistemden Çıkılıyor..."); 
                  cikisYap();
              }
          }
      }
      
      public static void ogretmenArayuz() throws IOException {
          System.out.println("                     Ana Sayfa");
          System.out.println("Lütfen Gerçekleştirmek İstediğiniz İşlem Numarasını Giriniz:");
          System.out.println("(1:Notlandırma 2:Not Listesi Görüntüleme 3:Öğrenci Listesi Görüntüleme 4:Sistemden Çıkış Yapma)");
          Scanner ogretmenSecim = new Scanner(System.in);
          int a = ogretmenSecim.nextInt();
          if (a == 1){
              notVer();
          }
          
          else if (a == 2) {
              ogretmenNotGoruntule();
          }
          
          else if (a == 3) {
              ogrenciListesi();
              ogretmenArayuz();
          }
          else if (a == 4) {
              System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
              cikisYap();
          }
          
          else {
              System.out.println("Lütfen Geçerli Bir Sayı Giriniz.Bir Hakkınız Kaldı.");
              System.out.println("(1:Notlandırma 2:Not Listesi Görüntüleme 3:Öğrenci Listesi Görüntüleme 4:Sistemden Çıkış Yapma)");
              int b = ogretmenSecim.nextInt();
              if (b == 1){
                  notVer();
              }
          
              else if (b == 2) {
                  ogretmenNotGoruntule();
              }
          
              else if (b == 3) {
                  ogrenciListesi();
              }
              else if (b == 4) {
                  System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
                  cikisYap();
              }
              else {
                  System.out.println("İki Defa Hatalı Seçim Yaptınız.Sistemden Çıkılıyor..."); 
                  cikisYap();
              }
          }
          
      }
      
      public static void ogrenciArayuz() throws IOException {
          System.out.println("                     Ana Sayfa");
          System.out.println("Lütfen Gerçekleştirmek İstediğiniz İşlem Numarasını Giriniz:");
          System.out.println("(1:Not Görüntüleme 2:Ders Listesi Görüntüleme 3:Transkript 4:Sistemden Çıkış Yapma)");
          Scanner ogrenciSecim = new Scanner(System.in);
          int a = ogrenciSecim.nextInt();
          if (a == 1){
              ogrenciNotGoruntule();
          }
          
          else if (a == 2) {
              dersler();
          }
          
          else if (a == 3) {
              transkript();
              ogrenciArayuz();
          }
          else if (a == 4) {
              System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
              cikisYap();
          }
          else {
              System.out.println("Lütfen Geçerli Bir Sayı Giriniz.Bir Hakkınız Kaldı.");
              System.out.println("(1:Not Görüntüleme 2:Ders Listesi Görüntüleme 3:Transkript 4:Sistemden Çıkış Yapma)");
              int b = ogrenciSecim.nextInt();
              if (b == 1){
                  ogrenciNotGoruntule();
              }
          
              else if (b == 2) {
                  dersler();
              }
          
              else if (b == 3) {
                  transkript();
              }
              else if (b == 4) {
                  System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
                  cikisYap();
              }
              else {
                  System.out.println("İki Defa Hatalı Seçim Yaptınız.Sistemden Çıkılıyor..."); 
                  cikisYap();
              }
          }
      }
      
      public static void asistanArayuz() throws IOException {
          System.out.println("                     Ana Sayfa");
          System.out.println("Lütfen Gerçekleştirmek İstediğiniz İşlem Numarasını Giriniz:");
          System.out.println("(1:Notlandırma 2:Not Listesi Görüntüleme 3:Öğrenci Listesi Görüntüleme 4:Sistemden Çıkış Yapma)");
          Scanner ogretmenSecim = new Scanner(System.in);
          int a = ogretmenSecim.nextInt();
          if (a == 1){
              notVer();
          }
          
          else if (a == 2) {
              ogretmenNotGoruntule();
          }
          
          else if (a == 3) {
              ogrenciListesi();
          }
          else if (a == 4) {
              System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
              cikisYap();
          }
          
          else {
              System.out.println("Lütfen Geçerli Bir Sayı Giriniz.Bir Hakkınız Kaldı.");
              System.out.println("(1:Notlandırma 2:Not Listesi Görüntüleme 3:Öğrenci Listesi Görüntüleme 4:Sistemden Çıkış Yapma)");
              int b = ogretmenSecim.nextInt();
              if (b == 1){
                  notVer();
              }
          
              else if (b == 2) {
                  ogretmenNotGoruntule();
              }
          
              else if (b == 3) {
                  ogrenciListesi();
              }
              else if (b == 4) {
                  System.out.println("Oturumunuz Güvenli Bir Şekilde Kapatılıyor...");
                  cikisYap();
              }
              else {
                  System.out.println("İki Defa Hatalı Seçim Yaptınız.Sistemden Çıkılıyor..."); 
                  cikisYap();
              }
          }
      }
      
      public static int arayuz() {
          System.out.println("AXU Uzaktan Eğitim Ders Portalı Sistemine Hoşgeldiniz...");
          Scanner giris = new Scanner(System.in);
          System.out.println("             Lütfen Giriş Yapınız.");
          System.out.print("E-mail: ");
          kullanici = giris.nextLine();
          System.out.print("Şifre: ");
          sifre = giris.nextLine();
          for (int i=0;i<400;i++) {
          if (kullanici.equals(adminkullanici) && sifre.equals(adminsifre)) {
              System.out.println("Başarıyla Giriş Yapıldı.");
              System.out.println("  Hoşgeldiniz Admin.");
              arayuz = 1;
              return arayuz;
          }
          
          else if (kullanici.equals(ogretmenkullanici[i]) && sifre.equals(ogretmensifre[i]))  {
              System.out.println("Başarıyla Giriş Yapıldı.");
              System.out.println("Hoşgeldiniz Değerli Öğretmenimiz.");
              arayuz = 2;
              return arayuz;
          }
          else if (kullanici.equals(ogrencikullanici[i]) && sifre.equals(ogrencisifre[i]))  {
              System.out.println("Başarıyla Giriş Yapıldı.");
              System.out.println("Hoşgeldiniz Değerli Öğrencimiz.");
              arayuz = 3;
              return arayuz;
          }
          else if (kullanici.equals(asistankullanici[i]) && sifre.equals(asistansifre[i]))  {
              System.out.println("Başarıyla Giriş Yapıldı.");
              System.out.println("Hoşgeldiniz Değerli Asistanımız.");
              arayuz = 4;
              return arayuz;
          }
      }
          System.out.println("Sisteme Giriş Yapılamadı...");
          arayuz = 5;
          return arayuz;
     }
    
      public static void ogretmenEkle() throws IOException{
        try 
        {
            File ogretmenler = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Ogretmen.txt");
            FileWriter fw = new FileWriter(ogretmenler,true);
            PrintWriter writer = new PrintWriter(fw);
            Scanner ogretmens = new Scanner(System.in);
            String ad;
            String email;
            String sifre;
            String cinsiyet;
            String yas;
            String brans;
            System.out.println("Lütfen Personelin Adını Ve Soyadını Giriniz: ");
            ad = ogretmens.nextLine();
            writer.println(ad);
            System.out.println("Lütfen Personelin E-mail Adresini Giriniz: ");
            email = ogretmens.nextLine();
            ogretmenkullanici[ogretmensayisi] = email;
            writer.println(email);
            System.out.println("Lütfen Personelin Şifresini Giriniz: ");
            sifre = ogretmens.nextLine();
            ogretmensifre[ogretmensayisi] = sifre;
            writer.println(sifre);
            System.out.println("Lütfen Personelin Cinsiyetini Giriniz: ");
            cinsiyet = ogretmens.nextLine();
            writer.println(cinsiyet);
            System.out.println("Lütfen Personelin Yaşını Giriniz: ");
            yas = ogretmens.nextLine();
            writer.println(yas);
            System.out.println("Lütfen Personelin Branşını Giriniz: ");
            brans = ogretmens.nextLine();
            writer.println(brans);
            ogretmensayisi++;
            for (int a=6;a<ogretmensayisi*6;a+=6) {
                       ogretmen.add(ad);
                       ogretmen.add(email);
                       ogretmen.add(sifre);
                       ogretmen.add(cinsiyet);
                       ogretmen.add(yas);
                       ogretmen.add(brans);
                   }
            System.out.println("Öğretmen Başarıyla Eklenmiştir.");
            writer.flush();
            writer.close();
            fw.close();
        } catch (FileNotFoundException ex) {
            
        }
        adminArayuz();
  }
      
      public static void ogrenciEkle() throws IOException{
        try 
        {
            File ogrenciler = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Ogrenci.txt");
            FileWriter fw = new FileWriter(ogrenciler,true);
            PrintWriter writer = new PrintWriter(fw);
            Scanner ogrencis = new Scanner(System.in);
            String ad;
            String email;
            String sifre;
            String cinsiyet;
            String yas;
            String numara;
            System.out.println("Lütfen Öğrencinin Adını Ve Soyadını Giriniz: ");
            ad = ogrencis.nextLine();
            writer.println(ad);
            System.out.println("Lütfen Öğrencinin E-mail Adresini Giriniz: ");
            email = ogrencis.nextLine();
            ogrencikullanici[ogrencisayisi] = email;
            writer.println(email);
            System.out.println("Lütfen Öğrencinin Şifresini Giriniz: ");
            sifre = ogrencis.nextLine();
            ogrencisifre[ogrencisayisi] = sifre;
            writer.println(sifre);
            System.out.println("Lütfen Öğrencinin Cinsiyetini Giriniz: ");
            cinsiyet = ogrencis.nextLine();
            writer.println(cinsiyet);
            System.out.println("Lütfen Öğrencinin Yaşını Giriniz: ");
            yas = ogrencis.nextLine();
            writer.println(yas);
            System.out.println("Lütfen Öğrencinin Okul Numarasını Giriniz: ");
            numara = ogrencis.nextLine();
            writer.println(numara);
            ogrencisayisi++;
            for (int a=6;a<ogrencisayisi*6;a+=6) {
                       ogrenci.add(ad);
                       ogrenci.add(email);
                       ogrenci.add(sifre);
                       ogrenci.add(cinsiyet);
                       ogrenci.add(yas);
                       ogrenci.add(numara);
                   }
            System.out.println("Öğrenci Başarıyla Eklenmiştir.");
            ogrencisayisi++;
            writer.flush();
            writer.close();
            fw.close();
        } catch (FileNotFoundException ex) {
            
        }
        adminArayuz();
  }
      
      public static void asistanEkle() throws IOException{
            try 
        {
            File asistanlar = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Asistan.txt");
            FileWriter fw = new FileWriter(asistanlar,true);
            PrintWriter writer = new PrintWriter(fw);
            Scanner asistans = new Scanner(System.in);
            String ad;
            String email;
            String sifre;
            String cinsiyet;
            String yas;
            String brans;
            System.out.println("Lütfen personelin Adını Ve Soyadını Giriniz: ");
            ad = asistans.nextLine();
            writer.println(ad);
            System.out.println("Lütfen personelin E-mail Adresini Giriniz: ");
            email = asistans.nextLine();
            asistankullanici[asistansayisi] = email;
            writer.println(email);
            System.out.println("Lütfen Personelin Şifresini Giriniz: ");
            sifre = asistans.nextLine();
            asistankullanici[asistansayisi] = sifre;
            writer.println(sifre);
            System.out.println("Lütfen Personelin Cinsiyetini Giriniz: ");
            cinsiyet = asistans.nextLine();
            writer.println(cinsiyet);
            System.out.println("Lütfen Personelin Yaşını Giriniz: ");
            yas = asistans.nextLine();
            writer.println(yas);
            System.out.println("Lütfen Personelin Branşını Giriniz: ");
            brans = asistans.nextLine();
            writer.println(brans);
            asistansayisi++;
            for (int a=6;a<asistansayisi*6;a+=6) {
                       asistan.add(ad);
                       asistan.add(email);
                       asistan.add(sifre);
                       asistan.add(cinsiyet);
                       asistan.add(yas);
                       asistan.add(brans);
                   }
            System.out.println("Asistan Öğretmen Başarıyla Eklenmiştir.");
            writer.flush();
            writer.close();
            fw.close();
        } catch (FileNotFoundException ex) {
            
        }
            adminArayuz();
  }
      
      public static void ogretmenListesi() throws IOException {
          try {
              File ogretmenler = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Ogretmen.txt");
              BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(ogretmenler)));
              try {
                  for (int i=1;i<ogretmensayisi+1;i++) {
                  String ad = reader.readLine();
                  System.out.println(i+".Öğretmenin Adı: "+ad);
                  String email = reader.readLine();
                  System.out.println(i+".Öğretmenin E-mail Adresi: "+email);
                  String sifre = reader.readLine();
                  System.out.println(i+".Öğretmenin Şifresi: "+sifre);
                  String cinsiyet = reader.readLine();
                  System.out.println(i+".Öğretmenin Cinsiyeti: "+cinsiyet);
                  String yas = reader.readLine();
                  System.out.println(i+".Öğretmenin Yaşı: "+yas);
                  String brans = reader.readLine();
                  System.out.println(i+".Öğretmenin Branşı: "+brans);
                  }
              } catch (IOException ex) {
              }
          } catch (FileNotFoundException ex) {
          }
          adminArayuz();
      }
      
      public static void ogrenciListesi() throws IOException {
          try {
              File ogrenciler = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Ogrenci.txt");
              BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(ogrenciler)));
              try {
                  for (int i=1;i<ogrencisayisi+1;i++) {
                      
                  String ad = reader.readLine();
                  System.out.println((i)+".Öğrencinin Adı: "+ad);
                  String email = reader.readLine();
                  System.out.println(i+".Öğrencinin E-mail Adresi: "+email);
                  String sifre = reader.readLine();
                  System.out.println(i+".Öğrencinin Şifresi: "+sifre);
                  String cinsiyet = reader.readLine();
                  System.out.println(i+".Öğrencinin Cinsiyeti: "+cinsiyet);
                  String yas = reader.readLine();
                  System.out.println(i+".Öğrencinin Yaşı: "+yas);
                  String numara = reader.readLine();
                  System.out.println(i+".Öğrencinin Okul Numarasıı: "+numara);
                  }
              } catch (IOException ex) {
              }
          } catch (FileNotFoundException ex) {
          }
      }
      
      public static void asistanListesi() throws IOException {
          try {
              File asistanlar = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Asistan.txt");
              BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(asistanlar)));
              try {
                  for (int i=0;i<asistansayisi;i++) {
                      
                  String ad = reader.readLine();
                  System.out.println((i+1)+".Asistan Öğretmenin Adı: "+ad);
                  String email = reader.readLine();
                  System.out.println((i+1)+".Asistan Öğretmenin E-mail Adresi: "+email);
                  String sifre = reader.readLine();
                  System.out.println((i+1)+".Asistan Öğretmenin Şifresi: "+sifre);
                  String cinsiyet = reader.readLine();
                  System.out.println((i+1)+".Asistan Öğretmenin Cinsiyeti: "+cinsiyet);
                  String yas = reader.readLine();
                  System.out.println((i+1)+".Asistan Öğretmenin Yaşı: "+yas);
                  String brans = reader.readLine();
                  System.out.println((i+1)+".Asistan Öğretmenin Branşı: "+brans);
                  }
              } catch (IOException ex) {
              }
          } catch (FileNotFoundException ex) {
          }
          adminArayuz();
      }
      
      public static void ogretmenSil() throws IOException {
          if (ogretmensayisi == 5){
              System.out.println("Mevcut Öğretmenleri Sistemden Silme Yetkiniz Bulunmamaktadır...");
          }
          else {
          File ogretmenler = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Ogretmen.txt");
          if (ogretmenler.exists()) {
              ogretmenler.delete();
          }
          Scanner ogretmenSil = new Scanner(System.in);
          System.out.println("Lütfen Silmek İstadiğiniz Öğretmenin Adını Ve Soyadını Giriniz: ");
          String a = ogretmenSil.nextLine();
          int esitlik = 0;
          for (int i=30;i<(ogretmensayisi)*6;i+=6){
          if (a.equals(ogretmen.get(i))) {
              ogretmen.remove(i);
              ogretmen.remove(i+1);
              ogretmen.remove(i+2);
              ogretmen.remove(i+3);
              ogretmen.remove(i+4);
              ogretmen.remove(i+5);
              esitlik++;
          }
          }
          if (esitlik == 0) {
              System.out.println("Sistemde Bu İsimde Bir Öğretmen Bulunmamaktadır.Lütfen Doğru Şekilde Girdiğinizden Emin Olunuz...");
          }
          else {
              ogretmensayisi--;
          }
          File ogretmenleryeni = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Ogretmen.txt");
          FileWriter fw = new FileWriter(ogretmenleryeni);
          PrintWriter writer = new PrintWriter(fw);
          for (int h=0;h<ogretmensayisi*6;h++) {
          String b = ogretmen.get(h);
          writer.println(b);
          }
          writer.flush();
          writer.close();
          fw.close(); 
         }
          adminArayuz();
      }
      
      public static void ogrenciSil() throws IOException {
          if (ogrencisayisi == 5){
              System.out.println("Mevcut Öğrencileri Sistemden Silme Yetkiniz Bulunmamaktadır...");
          }
          else {
          File ogrenciler = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Ogrenci.txt");
          if (ogrenciler.exists()) {
              ogrenciler.delete();
          }
          Scanner ogrenciSil = new Scanner(System.in);
          System.out.println("Lütfen Silmek İstadiğiniz Öğrencinin Adını Ve Soyadını Giriniz: ");
          String a = ogrenciSil.nextLine();
          int esitlik = 0;
          for (int i=30;i<(ogrencisayisi)*6;i+=6){
          if (a.equals(ogrenci.get(i))) {
              ogrenci.remove(i);
              ogrenci.remove(i+1);
              ogrenci.remove(i+2);
              ogrenci.remove(i+3);
              ogrenci.remove(i+4);
              ogrenci.remove(i+5);
              esitlik++;
          }
          }
          if (esitlik == 0) {
              System.out.println("Sistemde Bu İsimde Bir Öğrenci Bulunmamaktadır.Lütfen Doğru Şekilde Girdiğinizden Emin Olunuz...");
          }
          else {
              ogrencisayisi--;
          }
          File ogrencileryeni = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Ogrenci.txt");
          FileWriter fw = new FileWriter(ogrencileryeni);
          PrintWriter writer = new PrintWriter(fw);
          for (int h=0;h<ogrencisayisi*6;h++) {
          String b = ogrenci.get(h);
          writer.println(b);
          }
          writer.flush();
          writer.close();
          fw.close(); 
         }
          adminArayuz();
      }
      
      public static void asistanSil() throws IOException {
          if (asistansayisi == 2){
              System.out.println("Mevcut Asistanları Sistemden Silme Yetkiniz Bulunmamaktadır...");
          }
          else {
          File asistanlar = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Asistan.txt");
          if (asistanlar.exists()) {
              asistanlar.delete();
          }
          Scanner asistanSil = new Scanner(System.in);
          System.out.println("Lütfen Silmek İstadiğiniz Asistanın Adını Ve Soyadını Giriniz: ");
          String a = asistanSil.nextLine();
          int esitlik = 0;
          for (int i=12;i<(asistansayisi)*6;i+=6){
          if (a.equals(asistan.get(i))) {
              asistan.remove(i);
              asistan.remove(i+1);
              asistan.remove(i+2);
              asistan.remove(i+3);
              asistan.remove(i+4);
              asistan.remove(i+5);
              esitlik++;
          }
          }
          if (esitlik == 0) {
              System.out.println("Sistemde Bu İsimde Bir Asistan Bulunmamaktadır.Lütfen Doğru Şekilde Girdiğinizden Emin Olunuz...");
          }
          else {
              asistansayisi--;
          }
          File asistanlaryeni = new File("C:\\Users\\Ömer Alptuğ\\Desktop\\HER ŞEY\\ödev\\java proje\\Asistan.txt");
          FileWriter fw = new FileWriter(asistanlaryeni);
          PrintWriter writer = new PrintWriter(fw);
          for (int h=0;h<asistansayisi*6;h++) {
          String b = asistan.get(h);
          writer.println(b);
          }
          writer.flush();
          writer.close();
          fw.close(); 
         }
          adminArayuz();
      }

    public static void main(String[] args) throws IOException{
              //ogretmenEkle();
              //ogrenciEkle();
              //asistanEkle();
              //ogretmenListesi();
              //ogrenciListesi();
              //asistanListesi();
              //ogretmenSil();
              //ogrenciSil();
              //asistanSil();
              //arayuz();
              //adminArayuz();
              //ogretmenArayuz();
              //ogrenciArayuz();
              //asistanArayuz();
              //ogretmenNotGoruntule();
              //ogrenciNotGoruntule();
              //notVer();
              //cikisYap();
              //transkript();
              //dersler();
              ogretmenkullanici[0] = "eyup";
              ogretmenkullanici[1] = "kazim";
              ogretmenkullanici[2] = "suat";
              ogretmenkullanici[3] = "anil";
              ogretmenkullanici[4] = "ayse";
              ogretmensifre[0] = "eyup1";
              ogretmensifre[1] = "kazim1";
              ogretmensifre[2] = "suat1";
              ogretmensifre[3] = "anil1";
              ogretmensifre[4] = "ayse1";
              asistankullanici[0] = "abdulsamet";
              asistankullanici[1] = "abdullah";
              asistansifre[0] = "abdulsamet1";
              asistansifre[1] = "abdullah1";
              ogrencikullanici[0] = "elif";
              ogrencisifre[0] = "elif1";
              ogrencikullanici[1] = "polat";
              ogrencisifre[1] = "polat1";
              ogrencikullanici[2] = "memati";
              ogrencisifre[2] = "memati1";
              ogrencikullanici[3] = "abdulhey";
              ogrencisifre[3] = "abdulhey1";
              ogrencikullanici[4] = "erhan";
              ogrencisifre[4] = "erhan1";
              ogretmen.add("Eyup Emre Ulku");
              ogretmen.add("eyup");
              ogretmen.add("eyup1");
              ogretmen.add("erkek");
              ogretmen.add("35");
              ogretmen.add("Nesne Yonelimli Programlama");
              ogretmen.add("Kazim Yildiz");
              ogretmen.add("kazim");
              ogretmen.add("kazim1");
              ogretmen.add("erkek");
              ogretmen.add("40");
              ogretmen.add("Bilgisayar Programlama II");
              ogretmen.add("Suat Koc");
              ogretmen.add("suat");
              ogretmen.add("suat1");
              ogretmen.add("erkek");
              ogretmen.add("30");
              ogretmen.add("Ayrik Matematik");
              ogretmen.add("Anil Bas");
              ogretmen.add("anil");
              ogretmen.add("anil1");
              ogretmen.add("erkek");
              ogretmen.add("35");
              ogretmen.add("Insan-Bilgisayar Etkilesimi ve Gorsellik");
              ogretmen.add("Ayse Yayla");
              ogretmen.add("ayse");
              ogretmen.add("ayse1");
              ogretmen.add("kadin");
              ogretmen.add("35");
              ogretmen.add("Mantik Devreleri");
              asistan.add("Abdulsamet Aktas");      
              asistan.add("abdulsamet");         
              asistan.add("abdulsamet1");          
              asistan.add("erkek");         
              asistan.add("25");          
              asistan.add("Nesne Yonelimli Programlama");         
              asistan.add("Abdullah Bal");         
              asistan.add("abdullah");          
              asistan.add("abdullah1");
              asistan.add("erkek");          
              asistan.add("25");          
              asistan.add("Bilgisayar Programlama II");
              ogrenci.add("Elif Ceren Ciftci");
              ogrenci.add("elif");
              ogrenci.add("elif1");
              ogrenci.add("kadin");
              ogrenci.add("21");
              ogrenci.add("1");
              ogrenci.add("Polat Alemdar");
              ogrenci.add("polat");
              ogrenci.add("polat1");
              ogrenci.add("erkek");
              ogrenci.add("40");
              ogrenci.add("2");
              ogrenci.add("Memati Bas");
              ogrenci.add("memati");
              ogrenci.add("memati1");
              ogrenci.add("erkek");
              ogrenci.add("35");
              ogrenci.add("3");
              ogrenci.add("Abdulhey Coban");
              ogrenci.add("abdulhey");
              ogrenci.add("abdulhey1");
              ogrenci.add("erkek");
              ogrenci.add("33");
              ogrenci.add("4");
              ogrenci.add("Erhan Gullu");
              ogrenci.add("erhan");
              ogrenci.add("erhan1");
              ogrenci.add("erkek");
              ogrenci.add("30");
              ogrenci.add("5");
              arayuz();
              if (arayuz == 1) {
                  adminArayuz();
              }
              else if (arayuz == 2) {
                  ogretmenArayuz();
              }
              else if (arayuz == 3) {
                  ogrenciArayuz();
              }
              else if (arayuz == 4) {
                  asistanArayuz();
              }
              else {
                  System.out.println("E-Mail Veya Şifreniz Hatalı.Lütfen Tekrar Deneyiniz...");
              }
    }
}
