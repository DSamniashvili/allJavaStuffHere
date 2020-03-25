public class Island {
    String name;
}
class IslandsTestClass {
    public static void main(String[] args) {
        Island[] islands = new Island[4];

        islands[0] = new Island();
        islands[1] = new Island();
        islands[2] = new Island();
        islands[3] = new Island();

        islands[0].name = "Bermuda";
        islands[1].name = "Fiji";
        islands[2].name = "Azores";
        islands[3].name = "Cozumel";

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;


        int y = 0;
        int ref;

        while(y < 4){

            ref = index[y];

            System.out.print("Island is: ");
            System.out.println(islands[ref].name);

            y = y+1;
        }
    }
}
