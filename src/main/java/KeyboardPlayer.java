public class KeyboardPlayer extends Human implements BandActions {
    public KeyboardPlayer(int hairLength) {
        super(hairLength);
    }

    @Override
    public void play() {
        System.out.print("Клавишник умело использовал свои пальцы и подарил аудитории незабываемый ритм. ");
    }
    @Override
    public void printHairLength(){
        System.out.println("Длина волос клавишника "+ getHairLength());
    }
}
