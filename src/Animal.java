abstract public class Animal implements MoveSpeed,Voise{
    private Integer Age;
    private String name;
    private double weight;
    private String color;

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(Integer Age, String name, double weight, String color) {
        this.Age = Age;
        this.name = name;
        this.weight=weight;
        this.color=color;
    }

    abstract void move();
}