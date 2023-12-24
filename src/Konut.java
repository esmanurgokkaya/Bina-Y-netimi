// burada abstract class oluşturulur
public abstract class Konut {
    // değişken oluşturulur ve dışarıdan okunabilir olması için get metodu eklenir.
    private String adres;
    public String getAdres() {
        return adres;
    }
    // yapıcı metodu adres değişkenini alır.
    public Konut(String adres) {
        this.adres = adres;
    }
    // alınan adres değişkeninin bilgisini yazdırmak için kullanılan bir metoddur.
    // bu bağlı olan classlar tarafından kullanılıp override edilebilir.
    public void displayInfo(){
       System.out.println("Konut'un adresi: " + adres );
    }

}

