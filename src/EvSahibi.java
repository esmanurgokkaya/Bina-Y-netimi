import java.util.ArrayList;
import java.util.List;
// ev sahibi bilgilerini tutabilmek için oluşturulur.
public class EvSahibi {

    // değişkenler ve sadece okunabilir olması için get metodu tanımlanır.
    private String adi;
    private  String soyadi;
    private  Bina bina;
    private List<Daire> daireList;
    public Bina getBina() {
        return bina;
    }
    public String getSoyadi() {
        return soyadi;
    }
    public String getAdi() {
        return adi;
    }
    public List<Daire> getDaireList() {
        return daireList;
    }

    // yapıcı metot tanımlanır ve ayrıca içinde liste tanımlanır.
    public EvSahibi(String adi, String soyadi,Bina bina){
        this.adi = adi;
        this.soyadi = soyadi;
        this.bina = bina;
        this.daireList = new ArrayList<>();
    }
    // ev sahibi bilgilerini yazdırır
    // aynı zamanda bina tipindeki değişkenin metodu kulllanılarak bina bilgileri yazdılır.
    public void displayInfo(){
        System.out.println("Ev sahibi adı : " + adi);
        System.out.println("Ev sahibi soyadı : " + soyadi);
        bina.displayInfo();
    }

    // daire classında kullanılan bir metot çağrılıp daire ekleme yapılır.
    // önce eklemek istediğimiz daire karşılaştırma metoduna gönderilir aynı daireden bahsediliyorsa sıfır döndür
    // sıfır olduğunda if içine girip ekleme işlemi yapılır.
    public void addApartment(Daire daire) {
        if (daire.compareTo(daire) == 0) {
            daireList.add(daire);
        }
        else {
            System.out.println("Daire bulunamadı");
        }
    }


}
