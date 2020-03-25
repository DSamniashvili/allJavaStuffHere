public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourSelf(userGuess);
//        String testResult = "failed";
//        if(result.equals("hit!")){
//            testResult = "passed";
//        }
//        System.out.println(testResult);
    }
}

class SimpleDotCom {
    int numOfHits = 0;
    int[] locationCells;

    public void setLocationCells(int[] loc){
        locationCells = loc;
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

        return result;
    }
}


