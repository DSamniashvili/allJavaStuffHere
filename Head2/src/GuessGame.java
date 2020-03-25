public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    int maxTryCount = 3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessedNum1 = 0;
        int guessedNum2 = 0;
        int guessedNum3 = 0;

        boolean player1IsRight = false;
        boolean player2IsRight = false;
        boolean player3IsRight = false;

        int targetNumberToBeGuessed = (int) (Math.random() * 10);

        System.out.println("Creating a number to be guessed ...");

       while(maxTryCount > 0){
           System.out.println("Number to guess is: " + targetNumberToBeGuessed);

           p1.guess();
           p2.guess();
           p3.guess();

           guessedNum1 = p1.number;
           System.out.println("Player 1 said: " + guessedNum1);
           guessedNum2 = p2.number;
           System.out.println("Player 2 said: " + guessedNum2);
           guessedNum3 = p3.number;
           System.out.println("Player 3 said: " + guessedNum3);

           if(guessedNum1 == targetNumberToBeGuessed){
               player1IsRight = true;
           }
           if(guessedNum2 == targetNumberToBeGuessed){
               player2IsRight = true;
           }
           if(guessedNum3 == targetNumberToBeGuessed){
               player3IsRight = true;
           }

           if(maxTryCount > 1){
               if(player1IsRight || player2IsRight || player3IsRight){
                   System.out.println("we have a winner!");
                   System.out.println("is player1 winner?   - " + player1IsRight);
                   System.out.println("is player2 winner?   - " + player2IsRight);
                   System.out.println("is player3 winner?   - " + player3IsRight);

               } else {
                   System.out.println("we do not have a winner.");
                   System.out.println("Please try again.");

               }
           } else {
               System.out.println("Maximum tries reached. Game is over.");
           }

           maxTryCount -=1;
       }
    }
}
