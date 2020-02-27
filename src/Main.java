import common.Animal;
import common.Cat;
import common.Duck;

public class Main {

    public static void main(String[] args) {
        Animal cat  = new Cat("Bob", 13);
        Animal duck = new Duck("Rob", 10);

        System.out.println("Cat say: ");
        wrightHello(cat);

        System.out.println("Duck say: ");
        wrightHello(duck);
    }

    private static void wrightHello(Animal animal) {
        if(animal instanceof Cat) {
            System.out.println("Myay, " + animal.toString());
        } else if(animal instanceof Duck) {
            System.out.println("Krya, " +  animal.toString());
        }
    }
}
