import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListAnimal {
    public static List<Animal> getLinkedListAnimal() {
        List<Animal> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            Animal animal = new Animal(i, 2);
            list.add(animal);
        }
        return list;
    }
}
