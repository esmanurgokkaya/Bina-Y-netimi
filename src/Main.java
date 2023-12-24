import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      // ilk olarak bina nesnesi oluşturulur.
      Bina bina =  new Bina("İstanbul", 3);
      // daire sınıfından da nesneler oluşturularak bulunduğu binanın adresi ve diğer değerler parametre olarak verilir.
      Daire daire1 = new Daire(bina.getAdres(),1, 1);
      Daire daire2 = new Daire(bina.getAdres(),2,1);
      Daire daire3 = new Daire(bina.getAdres(),3, 2);
      Daire daire4 = new Daire(bina.getAdres(),4, 2);
      Daire daire5 = new Daire(bina.getAdres(),5,3);
      // ev sahipleri bilgileri ve hangi binadaki evlerin sahipleriyse o bina parametre olarak eklenir.
      EvSahibi evSahibi1 = new EvSahibi("Esma Nur", "Gökkaya" , bina);
      EvSahibi evSahibi2 = new EvSahibi("Sude", "İlhan", bina);
      // kiracıların bilgileri ve ev sahiplerinin bilgileri eklenir.
      Kiraci kiraci1 = new Kiraci("Sıla", "Yazıcı",evSahibi1);
      Kiraci kiraci2 = new Kiraci("Aysun","Yurttaş", evSahibi2);
      Kiraci kiraci3 = new Kiraci("Elif","Yüksel", evSahibi1);
      Kiraci kiraci4 = new Kiraci("Beyza","Uzuntaş", evSahibi1);
      Kiraci kiraci5 = new Kiraci("Sena","Tekin", evSahibi2);
      // ev sahiplerinin evleri eklenir ve bir listede evlerinin bilgileri tutulur.
      evSahibi1.addApartment(daire1);
      evSahibi1.addApartment(daire3);
      evSahibi1.addApartment(daire4);
      evSahibi2.addApartment(daire2);
      evSahibi2.addApartment(daire5);
      // binanın bilgileri yazdırılır.
      System.out.println("Bina bilgileri");
      bina.displayInfo();

      System.out.println();
      // ev sahiplerinin bilgileri yazdırılır.
      System.out.println("Ev sahiplerinin bilgileri ");
      evSahibi1.displayInfo();
      System.out.println("-----------");
      evSahibi2.displayInfo();

      System.out.println();
      // ev sahiplerinin dairlerinin bilgileri yazdırılır.
      System.out.println("Ev sahibi Esma'nın dairelerinin bilgileri");
      for (Daire daire : evSahibi1.getDaireList()){
        System.out.println("Adres : "+ daire.getAdres() + " | " + "Kapı numarası : " + daire.getApartmentNumber() + " | " +"Kat numarası : " + daire.getKatNo());
      }

      System.out.println();

      System.out.println("Ev sahibi Sude'nin dairelerinin bilgileri");
      for (Daire daire : evSahibi2.getDaireList()){
        System.out.println("Adres : "+ daire.getAdres() + " | " + " Kapı numarası : "  + daire.getApartmentNumber() + " | " + " Kat numarası : " + daire.getKatNo());

      }

      System.out.println();
      // kiracıların bilgileri yazdırılır.
      System.out.println("Kiraci bilgileri");
      kiraci1.displayInfo();
      System.out.println();
      kiraci2.displayInfo();
      System.out.println();
      kiraci3.displayInfo();
      System.out.println();
      kiraci4.displayInfo();
      System.out.println();
      kiraci5.displayInfo();




    }
}
