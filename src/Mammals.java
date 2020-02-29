public class Mammals extends Animal{
    Mammals(Integer Age, String name, double weight, String color){
        super(Age, name, weight, color);
    }

    @Override
    void move() {
        System.out.print("mammal walks!        ");
    }

    public void moveSpeed(double weight, Integer age){
        if (weight<20 && age<5) System.out.print("movespeed - high        ");
        else if (weight<50 && age<10) System.out.print("movespeed - middling        ");
        else System.out.print("movespeed - low        ");
    }

    public String voise(){
        return "grrrrraaaaaaa        ";
    }
}
