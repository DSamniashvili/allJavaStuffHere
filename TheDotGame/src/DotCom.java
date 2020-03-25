public class DotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locations) {
        locationCells = locations;
    }

    String checkYourSelf(String userInput){
        int guess = Integer.parseInt(userInput);
        String result = "missed";

        for(int cell : locationCells){
            if(guess == cell){
                result = "hit!";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "kill";
        }

        System.out.println(result);
        System.out.println("You tried " + numOfHits + " times");
        return result;
    }
}