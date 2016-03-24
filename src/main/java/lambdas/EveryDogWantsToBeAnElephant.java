package lambdas;

/**
 * Created by olexandra on 2/6/16.
 */
class EveryDogWantsToBeAnElephant implements Dog, Elephant {

    public static void main(final String[] args) {
        EveryDogWantsToBeAnElephant elephantDog = new EveryDogWantsToBeAnElephant();
//        Elephant e = new Elephant() {
//            @Override
//            public boolean isProud() {
//                return false;
//            }
//        };
//        Elephant e = () -> { return false; };
        Elephant e = () -> false;
        Dog d = () -> true;
        System.out.println(e.makeSound("Слон"));
        System.out.println(d.makeSound("Моська"));
        System.out.println(elephantDog.makeSound("Моська-слон"));

        System.out.println(Elephant.walk());
        System.out.println(Dog.walk());

        System.out.println("Слон горделив: " + e.isProud());
        System.out.println("Моська горделива: " + d.isProud());
        System.out.println("Моська-слон горделив: " + elephantDog.isProud());
    }

    @Override
    public String makeSound(String name) {
        return name + ": Я спокоен";
    }

    @Override
    public boolean isProud() {
        return false;
    }
}

interface Elephant {
    default String makeSound(String name) {
        return name + ": Не злите меня!";
    }

    static String walk() {
        return "Я большой и ступаю тихо но тяжело.";
    }

    boolean isProud();
}

interface Dog {
    default String makeSound(String name) {
        return name + ": Гав-гав";
    }

    static String walk() {
        return "Я бегаю быстренько своими маленькими лапками.";
    }

    boolean isProud();
}
