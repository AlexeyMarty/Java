package HW_1_2.Obstacle;

import HW_1_2.Competitors.Competitor;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }

    String str = "asd asdasd asdasdasd asdas" +
            "asdasdasd asdasda asdasd asd" +
            "asd asdasdasd asda" +
            "asdas dasdasd";

}