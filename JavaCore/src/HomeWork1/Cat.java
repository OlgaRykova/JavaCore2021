package HomeWork1;

public class Cat implements Ability {
    protected int speed;
    protected int height;
    public Cat(int speed, int height){
        this.speed = speed;
        this.height = height;
    }


    @Override
    public boolean jump(Wall wall) {
        if (height <= wall.height) {
            System.out.println("Cat didn't jump");
            return true;
        } else {
            System.out.println("Cat jump");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cat";
    }


    @Override
    public boolean run (Treadmill treadmill) {
        if (speed <= treadmill.speed) {
            System.out.println("Cat didn't ran");
            return true;
        } else {
            System.out.println("Cat ran");
            return false;
        }
    }


}


