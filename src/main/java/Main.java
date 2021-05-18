import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human guitarist = new Guitarist(100);
        Drummer drummer = new Drummer(30);
        Bassist bassist = new Bassist(40);
        KeyboardPlayer keyboardPlayer = new KeyboardPlayer(15);

        System.out.println("Все знают эту группу из "+BandActions.MEMBERS_AMOUNT+ " человек, благодаря длинным волосам гитариста!");
        guitarist.printHairLength();
        System.out.println("На сцену вышло трое человек, без всеми изветного патлатого участника");
        System.out.println("- Вы точно будете выступать? - спросил ведущий.");
        System.out.println("- Да, наш гитарист в больнице, мы должны сделать это для него - ответила группа.");
        System.out.println(" Вы готовы? И следующие выступают Кек Бэнд! Начинаем!");

        drummer.play();
        bassist.play();
        keyboardPlayer.play();
        drummer.scream();
        keyboardPlayer.scream();
        guitarist.setHairLength(0);
        System.out.println("После выступления, ребята сразу отправились в больницу к товарищу. Увиденное в палате друга повергло их в шок. Волос у гитариста совсем не было. В прямом смысле их длина была " +guitarist.getHairLength()
        +". Коллега рассказал, что из-за химиотерапии он решился сразу подстричь волосы. И тогда группа решилась на шаг, который поддержит их друга. Они все сбрили волосы");
        bassist.setHairLength(0);
        keyboardPlayer.setHairLength(0);
        drummer.setHairLength(0);
        System.out.println("Позже, группа Кек Бэнд переименовалась в Лысые Пирожки");



    }
}
