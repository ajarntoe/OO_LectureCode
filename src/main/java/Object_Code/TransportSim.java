package Object_Code;

public class TransportSim {

    public static void main(String[] args) {
        Car a = new Car();
        Car b = new Car();

        a.setSpeed(100);
        b.setAcc(-100);

        System.out.println(a.getSpeed());
        System.out.println(b.getAcc());
    }


}

