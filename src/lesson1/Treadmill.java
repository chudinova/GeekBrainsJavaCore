package lesson1;

public class Treadmill {
    public static void runTreadmill(String name, int runWeith) {
        if (runWeith > 400)
            System.out.println(name + " успешно пробежал");
        else
            System.out.println(name + " не смог пробежать");
    }
}
