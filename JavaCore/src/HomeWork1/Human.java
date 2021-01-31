package HomeWork1;

public class Human implements Ability {
    protected int speed;
    protected int height;
    public Human(int speed, int height){
        this.speed = speed;
        this.height = height;
    }

    @Override
    public boolean jump(Wall wall) {
        if (height <= wall.height) {
            System.out.println("Human didn't jump");
            return true;
        } else {
            System.out.println("Human jump");
            return false;

        }
    }

    @Override
    public String toString() {
        return "Human";
    }

    @Override
    public boolean run (Treadmill treadmill) {
        if (speed <= treadmill.speed) {
            System.out.println("Human didn't ran");
            return true;
        } else {
            System.out.println("Human ran");
            return false;
        }
    }

}
