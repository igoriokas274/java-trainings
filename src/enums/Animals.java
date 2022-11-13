package enums;

public enum Animals {

    DOG("Pluto"), CAT("Tom"), MOUSE("Jerry");

    private String name;

    private Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }
}
