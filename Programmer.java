public class Programmer extends Orang {

    @Override
    public void makan() {
        super.makan();
        System.out.println("Programmer sedang makan");
    }

    @Override
    public void tampilkanInfo(String nama, int dumur, String warnapakaian) {
        super.tampilkanInfo(nama, dumur, warnapakaian);
        System.out.println("Saya bernama " + nama + " dan berumur" + umur);
    }
    public void ngoding(){
        System.out.println("Programmer sedang ngoding");
    }
}
