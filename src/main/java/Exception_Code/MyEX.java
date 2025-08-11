package Exception_Code;

public class MyEX extends Exception {
	String x = "";
	public MyEX(String s) {
		x = s;
		System.out.println("MyException = " + x);
	}

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
}
