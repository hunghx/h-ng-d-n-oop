public abstract class Animals {
    private String name;

    public Animals() {
    }

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String makeSound(); // trừu tượng

}
