public class DogSize {
    private int size;
    private String name;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        if(!n.equals("")){
            name = n;
        }
    }

    void bark(){
        if(size > 70){
            System.out.println(name + " Baaaaaaaark!");
        } else if (size > 16){
            System.out.println(name + " Baark!");
        } else {
            System.out.println(name + " bark!");
        }
    }
}

class DogTest {
    public static void main(String[] args) {
        DogSize dog1 = new DogSize();
        dog1.setSize(80);
        dog1.setName("Fido");

        dog1.bark();

    }
}

class DogArray {
    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        if(s != 3){
            size = s;
        }
    }

    public void printSize(){
        System.out.println("Dog size is: " + size);
    }

    public static void main(String[] args) {
        DogArray[] houseDogs;
        houseDogs = new DogArray[3];

        houseDogs[0] = new DogArray();
        houseDogs[0].setSize(34);

        int x = houseDogs[0].getSize();
        houseDogs[0].printSize();

    }
}
