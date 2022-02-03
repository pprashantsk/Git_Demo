package factoryDesign;

public class FactoryMain {
	final int num = 10;
	public static void main(String[] args) {
		OSfactory osf = new OSfactory();
		OS obj = osf.getInstance("Apple");
		OS obj1 = osf.getInstance("android");
		OS obj2 = osf.getInstance("windows");
		
		obj2.spec();		

	}

}
