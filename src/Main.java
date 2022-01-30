import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static List<Animal> arrayList = CreateListAnimal.getListAnimal();
    static List<Animal> linkedList = CreateLinkedListAnimal.getLinkedListAnimal();

    public static void main(String[] args) {
        long m = System.currentTimeMillis();
        arrayList.add(500000,new Animal(-2,2));
        System.out.println((double) (System.currentTimeMillis() - m));

        long n = System.currentTimeMillis();
        linkedList.add(500000,new Animal(-5,2));
        System.out.println((double) (System.currentTimeMillis() - n));

    }
}
