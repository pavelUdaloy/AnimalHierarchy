public class Main {
    public static void main(String[] args) {
        Creating hummingbird=new Creating();
        hummingbird.createHummingbird(1,"hummingbird", 0.1, "multicolor");
        Creating stork=new Creating();
        stork.createStork(3,"stork", 3.5, "grey");

        Creating perch=new Creating();
        perch.createPerch(1,"perch", 1.3, "silver");
        Creating catfish=new Creating();
        catfish.createCatfish(4,"catfish", 4.4, "black");

        Creating dog=new Creating();
        dog.createDog(5,"dog", 15.4, "white");
        Creating cow=new Creating();
        cow.createCow(8,"cow", 100.4, "black");

        Creating mosquito=new Creating();
        mosquito.createMosquito(1,"mosquito", 0.02, "black");
        Creating chafer=new Creating();
        chafer.createChafer(2,"chafer", 0.30, "multicolor");
    }

}
