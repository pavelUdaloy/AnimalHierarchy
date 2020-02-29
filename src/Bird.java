public class Bird extends Animal{
    Bird(Integer Age, String name, double weight, String color){
        super(Age, name, weight, color);
    }

    @Override
    void move() {
        System.out.print("bird flies!        ");
    }

    public void moveSpeed(double weight, Integer age){
        weight=getWeight();
        if (weight<1.0 && age<3) System.out.print("movespeed - high        ");
        else if ((weight<3.0) && (age<5)) System.out.print("movespeed - middling        ");
        else System.out.print("movespeed - low        ");
    }

    public String voise(){
        return "chik - chirik        ";
    }
}
