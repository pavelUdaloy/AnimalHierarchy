public class Creating {
    public void createHummingbird(Integer Age, String name, double weight, String color){
        Hummingbird bird = new Hummingbird(Age,name, weight, color);
        System.out.print("вес-" + bird.getWeight() + "        продолжительность жизни-" + bird.getAge() + "        ");
        bird.moveSpeed(bird.getWeight(), bird.getAge());
        bird.move();
        System.out.print(bird.voise() + " ");
        bird.flyForLittle(bird.getColor(), bird.getName());
        //System.out.println();
    }

    public void createStork(Integer Age, String name, double weight, String color){
        Stork bird = new Stork(Age,name, weight, color);
        System.out.print("вес-" + bird.getWeight() + "        продолжительность жизни-" + bird.getAge() + "        ");
        bird.moveSpeed(bird.getWeight(), bird.getAge());
        bird.move();
        System.out.print(bird.voise() + " ");
        bird.flyForBig(bird.getColor(), bird.getName());
        System.out.println();
    }

    public void createCatfish(Integer Age, String name, double weight, String color){
        Catfish fish = new Catfish(Age,name, weight, color);
        System.out.print("вес-" + fish.getWeight() + "        продолжительность жизни-" + fish.getAge() + "        ");
        fish.moveSpeed(fish.getWeight(), fish.getAge());
        fish.move();
        System.out.print(fish.voise() + " ");
        fish.swimForBig(fish.getColor(), fish.getName());
        System.out.println();
    }

    public void createPerch(Integer Age, String name, double weight, String color){
        Perch fish = new Perch(Age,name, weight, color);
        System.out.print("вес-" + fish.getWeight() + "        продолжительность жизни-" + fish.getAge() + "        ");
        fish.moveSpeed(fish.getWeight(), fish.getAge());
        fish.move();
        System.out.print(fish.voise() + " ");
        fish.swimForLittle(fish.getColor(), fish.getName());
        //System.out.println();
    }

    public void createDog(Integer Age, String name, double weight, String color){
        Dog mammals = new Dog(Age,name, weight, color);
        System.out.print("вес-" + mammals.getWeight() + "        продолжительность жизни-" + mammals.getAge() + "        ");
        mammals.moveSpeed(mammals.getWeight(), mammals.getAge());
        mammals.move();
        System.out.print(mammals.voise() + " ");
        mammals.runForLittle(mammals.getColor(), mammals.getName());
        //System.out.println();
    }

    public void createCow(Integer Age, String name, double weight, String color){
        Cow mammals = new Cow(Age,name, weight, color);
        System.out.print("вес-" + mammals.getWeight() + "        продолжительность жизни-" + mammals.getAge() + "        ");
        mammals.moveSpeed(mammals.getWeight(), mammals.getAge());
        mammals.move();
        System.out.print(mammals.voise() + " ");
        mammals.runForBig(mammals.getColor(), mammals.getName());
        System.out.println();
    }

    public void createMosquito(Integer Age, String name, double weight, String color){
        Mosquito insect = new Mosquito(Age,name, weight, color);
        System.out.print("вес-" + insect.getWeight() + "        продолжительность жизни-" + insect.getAge() + "        ");
        insect.moveSpeed(insect.getWeight(), insect.getAge());
        insect.move();
        System.out.print(insect.voise() + " ");
        insect.buzzForLittle(insect.getColor(), insect.getName());
        //System.out.println();
    }

    public void createChafer(Integer Age, String name, double weight, String color){
        Chafer insect = new Chafer(Age,name, weight, color);
        System.out.print("вес-" + insect.getWeight() + "        продолжительность жизни-" + insect.getAge() + "        ");
        insect.moveSpeed(insect.getWeight(), insect.getAge());
        insect.move();
        System.out.print(insect.voise() + " ");
        insect.buzzForBig(insect.getColor(), insect.getName());
        System.out.println();
    }
}
