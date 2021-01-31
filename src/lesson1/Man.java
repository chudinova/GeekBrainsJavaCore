package lesson1;

public class Man implements Actions {

    public String name;
    public int jumpHight;
    public int runWeight;

    public Man(String name, int jumpHight, int runWeight) {
        this.name = name;
        this.jumpHight = jumpHight;
        this.runWeight = runWeight;
    }

    public void jump() {
        System.out.println("Человек прыгает");
    }

    public void run() {
        System.out.println("Человек бежит");
    }
}
