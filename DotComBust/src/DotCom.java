import java.util.*;

public class DotCom {
    private String dotComName;
    private ArrayList<String> locationCells;

    public void setName(String name){
        dotComName = name;
    }

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public String checkYourSelf(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if(index >= 0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "kill";
                System.out.println("you killed: " + dotComName);
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
