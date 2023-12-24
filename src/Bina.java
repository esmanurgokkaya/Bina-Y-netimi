// konut classını extend etmiş bir classdır adres bilgisini alır ve metodunu override eder.
public class Bina extends Konut{
   // değişken ve sadece okunur olması için get metodu tanımlanır.
    private int numbersofFloors;
    public int getNumbersofFloors() {
        return numbersofFloors;
    }

    // yapıcı metot adres ve kat numarası alır.
    // adres üst sınıfla bağlantı kurabilmesi için super metodu kullanılır.
    public Bina(String adres, int numbersofFloors){
        super(adres);
        this.numbersofFloors = numbersofFloors;
    }

    // konutta bulunan metod override edilir
    // aynı zamanda üst sınıftaki yani konuttaki metot çağrılıp değerlerin yazılması istenir.
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bina kat sayısı : " + numbersofFloors);
    }

}
