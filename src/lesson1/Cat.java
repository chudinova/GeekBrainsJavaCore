package lesson1;

public class Cat implements Actions {

    public String name;
    public int jumpHight;
    public int runWeight;

    public Cat(String name, int jumpHight, int runWeight) {
        this.name = name;
        this.jumpHight = jumpHight;
        this.runWeight = runWeight;
    }

    public void jump() {
        System.out.println("Котик прыгает");
    }

    public void run() {
        System.out.println("Котик бежит");
    }


}
