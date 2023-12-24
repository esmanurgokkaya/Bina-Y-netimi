// daire bilgilerini tutmak ve karşılaştırma yapmak için tanımlanır
// konutu extend eder ve karşılaştırma yapmak için varolan bir interface i implemente eder.
public class Daire extends Konut implements  Comparable<Daire>{
    // değişkenler ve sadece  okunur olabilmesi için get metodu tanımlanır.
    private int apartmentNumber;
    private int katNo;
    public int getKatNo() {
        return katNo;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }

    // yapıcı metot tanımlanır adres değişkeni üst sınıf ile bağlantı kurabilsin diye super metodu çağrılır.
    public Daire(String address, int apartmentNumber, int katNo){
        super(address);
       this.apartmentNumber = apartmentNumber;
       this.katNo = katNo;
    }

    // konutta olan metot override edilir ve içindeki değer de super ile çağrılıp kullanılır.
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Daire'nin kapı numarası : " + apartmentNumber);
        System.out.println("Daire'nin kat numarası : " + katNo);
    }

    // implemente edilen interface in bir metodu override edilir.
    // bu metot apartmentNumber değikenlerini kullanarak bir kıyaslama yapar.
    // sınıf içindeki nesne ile verilen başka bir nesnenin değişkenlerini karşılaştırır.
    // eşitlerse sıfır verir ve biz bu örnekte sıfır olduğu durumda kullanım yapacağız.
    // this.apartmentNumber > other.apartmentNumber  = negatif değer döner (-1)
    // this.apartmentNumber < other.apartmentNumber  = pozitif değer döner (1)
    // değerlerini de alabilir.
     @Override
    public int compareTo(Daire other){
        return this.apartmentNumber - other.apartmentNumber;
    }
}
