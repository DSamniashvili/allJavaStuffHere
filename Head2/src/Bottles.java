public class Bottles {
    public static void main(String[] args){
        int bottleNum = 99;
        String beerWord = "Bottles";

        while(bottleNum > 0){
            if(bottleNum == 1){
                beerWord = "Bottle";
            }
            System.out.println(bottleNum + " "+ beerWord + " of the beer" );
            bottleNum = bottleNum - 1;
        }
    }
}
