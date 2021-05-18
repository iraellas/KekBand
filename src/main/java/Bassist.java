public class Bassist extends Human implements BandActions{
    public Bassist(int hairLength) {
        super(hairLength);
    }

    @Override
    public void play() {
        System.out.print("Плавный и оригинальный звук пронесся среди зрителей, благодаря тому, что правая рука басиста произвела щепок, а левая проскользила по прижатой струне на грифе. ");

    }
    @Override
    public void printHairLength(){
        System.out.println("Длина волос басиста "+ getHairLength());
    }
}
