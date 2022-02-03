package singleTon;

public class SingletonDesing{
	public static void main(String args[]){
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton obj = Singleton.getInstance();
				
			}
		});

		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton obj2 = Singleton.getInstance();
				
			}
		});
		
		t1.start();
		t2.start();
	}
} 

class Singleton {
	private static Singleton obj;
	
	private Singleton(){
		System.out.println("object is created");
	}
	
	public static synchronized Singleton getInstance() {
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}
}
