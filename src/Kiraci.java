// kiraci bilgilerini tutulabilmek için açılan sınıftır.
public class Kiraci {
    //değişkenler tanımlanır ve get metodu kullanılarak sadece okumaya izin verilir.
    private String adi;
    private String soyadi;
    private EvSahibi sahibi;
    public String getAdi() {
        return adi;
    }
    public String getSoyadi() {
        return soyadi;
    }
    public EvSahibi getSahibi() {
        return sahibi;
    }

    // yapıcı metot tanımlanır ev sahibi tipinde bir değişken tanımlanır.
    public Kiraci(String adi , String soyadi, EvSahibi sahibi){
        this.adi = adi;
        this.soyadi = soyadi;
        this.sahibi = sahibi;
    }

    // bilgileri yazdırabilmek için metot tanımlanır
    // ve ev sahibi tipindeki değişkeni ile metot çağrılır ve ev sahibi bilgileri yazdırılır.
    public void displayInfo(){
        System.out.println("Kiracı adı : " + adi);
        System.out.println("Kiracı soyadı : " + soyadi);
        sahibi.displayInfo();
    }
}
