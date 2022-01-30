import java.util.ArrayList;
import java.util.List;

public class CreateListAnimal {
    public static List<Animal> getListAnimal() {
        List<Animal> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            Animal animal = new Animal(i, 2);
            list.add(animal);
        }
        return list;
    }
}
