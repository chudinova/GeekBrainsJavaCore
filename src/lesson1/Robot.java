package lesson1;

public class Robot implements Actions {

    public String name;
    public int jumpHight;
    public int runWeight;

    public Robot(String name, int jumpHight, int runWeight) {
        this.name = name;
        this.jumpHight = jumpHight;
        this.runWeight = runWeight;
    }

    public void jump() {
        System.out.println("Робот прыгает");
    }

    public void run() {
        System.out.println("Робот бежит");
    }
}
