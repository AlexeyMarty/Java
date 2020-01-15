package HW_1_2;

import HW_1_2.Competitors.*;
import HW_1_2.Obstacle.*;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(new Water(100),new Wall(2), new Cross(300), new Water(20));
        Team team_1 = new Team("Omega", new Dog("Shurik"), new Human("Alex"), new Cat("Barsik"));

        course.doIt(team_1);
        team_1.infoTeam();



    }
}
