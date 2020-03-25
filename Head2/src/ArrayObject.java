public class ArrayObject {
    public static void main(String[] args) {
        Dog[] dogs;
        dogs = new Dog[3];

        Dog fido = new Dog();

        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = fido;

        dogs[0].name = "Fido";
        dogs[0].weight = 12;
        dogs[1].name = "Vuvi";
        dogs[1].weight = 10;
        dogs[2].name = "Sani";
        dogs[2].weight = 8;
        fido.name = "Fido";
        fido.weight = 18;


        for(int i=0; i< dogs.length; i++){
            String dogName = dogs[i].name;
            int dogWeight = dogs[i].weight;

            dogs[i].bark(dogName);
        }
    }
}

class Dog {
    String name;
    int weight;

    void bark(String name){
        System.out.println(name + " Woof, woof");
    }
}
