import java.util.Objects;

public class Animal {
    int legs;
    int eyes;

    public Animal(int legs, int eyes) {
        this.legs = legs;
        this.eyes = eyes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return legs == animal.legs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(legs);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                ", eyes=" + eyes +
                '}';
    }
}
