public class Drummer extends Human implements BandActions{
    public Drummer(int hairLength) {
        super(hairLength);
    }
    @Override
    public void play() {
        System.out.print("Барабанные палочки подлетели вверх и через секунду оказались в руках баранщика. Он ударил по тарелке. \"Бадуууумц!\", прозвучало в зале. ");
    }
    @Override
    public void printHairLength(){
        System.out.println("Длина волос барабанщика "+ getHairLength());
    }
    @Override
    public void scream(){
        System.out.print("Всем спасибо! ");
    }

}
