public class Dog extends Mammals implements BehaviorDependingOnTheTypeOfAnimal{
    Dog(Integer Age, String name, double weight, String color){
        super(Age, name, weight, color);
    }

    @Override
    void move() {
        super.move();
    }

    @Override
    public void moveSpeed(double weight, Integer age) {
        super.moveSpeed(weight, age);
    }

    @Override
    public String voise() {
        return (super.voise());
    }

    @Override
    public void runForLittle(String color, String name) {
        System.out.println(color + " " + name + "(little) runs");
    }
}
