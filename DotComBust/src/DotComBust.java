import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;


    public void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        two.setName("eToys.com");

        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");

        for (DotCom i : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            i.setLocationCells(newLocation);
        }
    }

    public void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";
        for(DotCom i : dotComsList){
            result = i.checkYourSelf(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                dotComsList.remove(i);
                break;
            }
        }
        System. out.println(result);
    }

    public void finishGame(){
        if(numOfGuesses <= 18){
            System.out.println("Good catch! you took only " + numOfGuesses + " guesses");
        } else {
            System.out.println("Could do better, you took " + numOfGuesses + " guesses");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
