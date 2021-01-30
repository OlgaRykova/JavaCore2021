package HomeWork1;

import java.util.Arrays;

public class Main {
    private static Object Ability;

    public static void main(String[] args) {
        Wall wall1 = new Wall(3);
        Wall wall2 = new Wall(10);
        Wall wall3 = new Wall(100);
        Treadmill treadmill1 = new Treadmill(5);
        Treadmill treadmill2 = new Treadmill(67);
        Treadmill treadmill3 = new Treadmill(52);
        Treadmill treadmill4 = new Treadmill(2);
        Cat cat = new Cat(6, 30);
        Robot robot = new Robot(100, 2000);
        Human human = new Human(4, 10);
        Ability[] participants = new Ability[]{human, robot, cat};
        Wall[] walls = new Wall[]{wall1, wall2, wall3};
        Treadmill[] treadmills = new Treadmill[]{treadmill1, treadmill2, treadmill3, treadmill4};

        for (int i = 0; i < participants.length; i++) {
            for (int j = 1; j < walls.length + 1; j++) {
                System.out.println(participants[i].toString() + " is jumping over wall " + j);
                if (participants[i].jump(walls[j - 1]))
                    break;
                System.out.println("_________________");
            }
            System.out.println("__________________________");
        }

        for (int i = 0; i < participants.length; i++) {
            for (int j = 1; j < treadmills.length + 1; j++) {
                System.out.println(participants[i].toString() + " is running over treadmill " + j);
                if (participants[i].run(treadmills[j - 1]))
                    break;
                System.out.println("_________________");
            }
            System.out.println("__________________________");
        }





    }
}

