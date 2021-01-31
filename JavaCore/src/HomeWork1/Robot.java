package HomeWork1;

public class Robot implements Ability {
    protected int speed;
    protected int height;
    public Robot(int speed, int height){
        this.speed = speed;
        this.height = height;
    }

    @Override
    public boolean jump(Wall wall) {
        if (height <= wall.height) {
            System.out.println("Robot didn't jump");
            return true;
        } else {
            System.out.println("Robot jump");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Robot";
    }

    @Override
    public boolean run (Treadmill treadmill) {
        if (speed <= treadmill.speed) {
            System.out.println("Robot didn't ran");
            return true;
        } else {
            System.out.println("Robot ran");
            return false;
        }

    }

}
