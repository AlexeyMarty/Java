package HW_1_2.Competitors;

import HW_1_2.Competitors.Competitor;

public class Team {
    private String title;
    private Competitor[] competitors;

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public Team(String title, Competitor... competitors) {
        this.title = title;
        this.competitors = competitors;
    }

    public void infoTeam() {
        for (Competitor com: competitors) {
            com.info();
        }
    }
}
