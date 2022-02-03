package suberSub;

abstract class Teacher {
	public void show() {
		System.out.println("SuperShow");
	}
}

public class Superb extends Teacher {
	public void show() {
		System.out.println("childShow");
	}

	public static void main(String args[]) {
		Teacher teacher = new Superb();
		teacher.show();
	}

}