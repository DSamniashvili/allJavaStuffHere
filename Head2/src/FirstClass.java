public class FirstClass {
    public static void main(String[] args) {
        System.out.println("First run");
        System.out.println("Hello!");

        int x = 3;

        while(x < 5){
            x = x + 1;
            System.out.println("X equals: "+ x);
        }

        x = 1;
        while(x < 3){
            System.out.print("Doo");
            System.out.print("Bee");

            x += 1;
        }
        if(x == 3){
            System.out.print("Do");
        }
    }
}
