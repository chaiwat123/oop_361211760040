package Lab8;

public class AnimalApp {
    public static void main(String[] args) {
        Dog d = new Dog("yo",8);
        Cat c = new Cat("Got",3);

        d.makeNoise();
        c.makeNoise();

        //POLYMORPHISM หรือ การฟ้องรูป
        Animal A1 = new Dog("Ja",3);
        Animal A2 = new Cat("zA",1);

        A1.makeNoise();
        A2.makeNoise();





    }
}
