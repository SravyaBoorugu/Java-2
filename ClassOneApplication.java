package javapractice;

public class ClassOneApplication extends ClassOne{
	
	public ClassOneApplication(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	void output() {
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		ClassOne one = new ClassOneApplication(1,2);
		one.output();
        one.display();
	}

}
