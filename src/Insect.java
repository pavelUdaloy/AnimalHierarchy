public class Insect extends Animal{
    Insect(Integer Age, String name, double weight, String color){
        super(Age, name, weight, color);
    }

    @Override
    void move() {
        System.out.print("insect сrawls!        ");
    }

    public void moveSpeed(double weight, Integer age){
        if (weight<0.1 && age<1) System.out.print("movespeed - high        ");
        else if (weight<0.2 && age<1) System.out.print("movespeed - middling        ");
        else System.out.print("movespeed - low        ");
    }

    public String voise(){
        return "bzzzzzzzzzz        ";
    }
}
