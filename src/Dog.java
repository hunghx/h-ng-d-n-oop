public class Dog extends Animals implements Action,IOData{
    @Override
    public void inputData() {

    }

    @Override
    public void displayData() {

    }

    @Override
    public void move() {
        System.out.println("Không chịu ");
    }

    @Override
    public String makeSound() {
        return "go go";
    }
}
