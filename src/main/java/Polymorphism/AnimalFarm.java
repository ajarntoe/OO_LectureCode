package Polymorphism;

public class AnimalFarm {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();

        System.out.println(a.speak());
        System.out.println(b.speak());
        System.out.println(((Cat)a).speakFromSup());


        System.out.println("--------------");

        Animal c = a;
        a = b;
        b =c;
        System.out.println(a.speak());
        System.out.println(b.speak());


    }


}
