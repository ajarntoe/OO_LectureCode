package Object_Code;

public class Car {
    private int speed;
    private int acc;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed <0)
            this.speed =0;
        else
            this.speed = speed;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        if(acc <0)
            this.acc =0;
        else
            this.acc = acc;
    }
}
