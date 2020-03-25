class SimpleDotComGame {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom game1 = new SimpleDotCom();
        int randomNumber = (int) (Math.random() * 5);
        int[] locations = {randomNumber, randomNumber + 1, randomNumber + 2};

        game1.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive){
            String guess = helper.getUserInput("enter a number");
            String result = game1.checkYourSelf(guess);
            numOfGuesses ++;

            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}

