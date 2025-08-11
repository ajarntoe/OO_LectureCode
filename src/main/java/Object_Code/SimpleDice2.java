package Object_Code;
public class SimpleDice2 {
	final static int MAX = 6;
	int faceValue;


	public SimpleDice2(int faceValue) {
		// faceValue = val
		this.faceValue = faceValue;
	}

	public SimpleDice2() {
		this(1);
        //this.faceValue = this.roll();
	}

	public int roll() {
		faceValue = (int) (Math.random() * MAX) + 1;
		return faceValue;
	}

    public static void main(String[] args) {
        SimpleDice2 d = new SimpleDice2();
        System.out.println(d.faceValue);


    }

}
