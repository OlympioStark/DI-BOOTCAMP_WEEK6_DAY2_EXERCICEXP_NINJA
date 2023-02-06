package Ninja;

public class Solutions {
	
	private int a, b, c;
	int delta;

	public Solutions(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public void solution(int x, int y, int z) {
		int numberSolutions;
		delta = ((y * y) - (4 * x * z));
		
		//Conditions
		if (delta > 0) {
			numberSolutions = 2;
			System.out.println("The number of solutions is : " + numberSolutions);
		} else if(delta == 0) {
			numberSolutions = 1;
			System.out.println("The number of solutions is : " + numberSolutions);
		} else if(delta < 0) {
			numberSolutions = 0;
			System.out.println("The number of solutions is : " + numberSolutions);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
