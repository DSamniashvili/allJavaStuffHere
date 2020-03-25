public class DotComGame {
    public static void main(String[] args) {

        GameHelper helper = new GameHelper();
        DotCom theDotCom = new DotCom();

        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive){
            String guess = helper.getUserInput("enter the number:");
            String result = theDotCom.checkYourSelf(guess);

            if(result.equals("kill")){
                isAlive = false;
            }
        }
    }
}
