public class Fish extends Animal{
    Fish(Integer Age, String name, double weight, String color){
        super(Age, name, weight, color);
    }

    @Override
    void move() {
        System.out.print("fish swims!        ");
    }

    public void moveSpeed(double weight, Integer age){
        if (weight<5 && age<5) System.out.print("movespeed - high        ");
        else if (weight<10 && age<20) System.out.print("movespeed - middling        ");
        else System.out.print("movespeed - low        ");
    }

    public String voise(){
        return "byl' - byl'        ";
    }
}
