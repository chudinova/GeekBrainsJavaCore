package lesson1;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Пушок", 3, 100);
        Man man = new Man("Василий", 1, 500);
        Robot robot = new Robot("Железяка", 6, 1000);

        cat.run();
        cat.jump();

        man.run();
        man.jump();

        robot.run();
        robot.jump();


    }
}
