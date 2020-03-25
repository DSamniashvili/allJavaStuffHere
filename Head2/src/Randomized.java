public class Randomized {
    public static void main(String[] args){
        String[] words1 = {"this", "That", "it", "one", "the one"};
        String[] words2 = {"is", "was", "will be"};
        String[] words3 = {"nice", "amazing", "cool"};

        int randomNum = (int) (Math.random() * words2.length);
        int randomNum1 = (int) (3.6);

        String myPhrase = words1[randomNum] + " " + words2[randomNum] + " " + words3[randomNum];

        System.out.println("Generated sentence is: " + myPhrase + " " +  randomNum1);

    }
}
