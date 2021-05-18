public interface BandActions {
    int MEMBERS_AMOUNT = 4;

    void play();

    default void scream() {
        System.out.println("ееее рок");
    }


}
