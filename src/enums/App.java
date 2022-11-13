package enums;

public class App {

    public static void main(String[] args) {

        Animals animals = Animals.CAT;

        switch (animals) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
        }

        System.out.println(Animals.CAT); // Calls toString() method
        System.out.println("Enum name as a string: " + Animals.CAT.name());
        System.out.println(Animals.DOG.getClass());
        System.out.println(Animals.MOUSE.getName());

        Animals animals1 = Animals.valueOf("MOUSE");
        System.out.println(animals1);
    }
}
