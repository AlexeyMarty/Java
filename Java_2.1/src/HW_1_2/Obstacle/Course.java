package HW_1_2.Obstacle;

import HW_1_2.Competitors.Competitor;
import HW_1_2.Competitors.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (Competitor c: team.getCompetitors()) {
            for (Obstacle o: obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()){
                    break;
                }
            }
        }
    }
}
