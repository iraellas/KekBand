public class Guitarist extends Human implements BandActions{
    public Guitarist(int hairLength) {
        super(hairLength);
    }

    @Override
    public void play() {
        System.out.print("Гитарист использовал ногти при игре. Это позволило достигнуть более яркого звучания. ");
    }
    @Override
    public void printHairLength(){
        System.out.println("Длина волос гитариста "+ getHairLength()+" cм.");
    }

}
