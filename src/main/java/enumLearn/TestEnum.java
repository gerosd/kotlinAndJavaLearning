package enumLearn;

import java.util.Random;

public class TestEnum {
    public static Animal[] animalList = {Animal.CAT, Animal.DOG, Animal.FROG};
    static Random random = new Random();
    public static void main(String[] args) {
        animalEnum();
    }

    public static void animalEnum() {
        Animal animal = animalList[random.nextInt(animalList.length)];

        switch (animal) {
            case CAT -> System.out.println("Cat");
            case DOG -> System.out.println("Dog");
            case FROG -> System.out.println("Frog");
        }
    }
}
