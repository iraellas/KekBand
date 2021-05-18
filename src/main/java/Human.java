public class Human {
    private int hairLength;

    public Human(int hairLength) {
        this.hairLength = hairLength;

    }

    public int getHairLength() {
        return hairLength;
    }

    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }

    public void printHairLength() {
        System.out.println("Длина волос составляет " + getHairLength());
    }
}
