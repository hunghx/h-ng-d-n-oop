public class Cat extends Animals implements Action{

    @Override
    public void move() {
        System.out.println("Đang di chuyển");
    }

    @Override
    public String makeSound() {
        return "meo meo";
    }
}
