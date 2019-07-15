public class TelevisorTest {
    public static void main(String[] args) {
        Televisor tv = new Televisor();

        System.out.println(tv.showStatus());
        System.out.println();

        tv.turnOn();
        System.out.println(tv.showStatus());
        System.out.println();

        tv.turnOff();
        System.out.println(tv.showStatus());
        System.out.println();

    }


}
