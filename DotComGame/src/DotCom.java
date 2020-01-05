/**
 * 
 */

import java.util.ArrayList;

public class DotCom {
    private ArrayList<System> locationCells;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<System> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourSelf(String userInput) {
        String result = "мимо";

        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "потопил";
            }else {
                result = "попал";
            }
        }
        return result;
    }
}

