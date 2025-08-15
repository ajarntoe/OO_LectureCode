package Polymorphism;

public class Cat extends Animal{
    public String speak(){
        return "Meaw!";
    }
    public String speakFromSup(){
        return super.speak();
    }


}
