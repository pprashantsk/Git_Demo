package reflectionDemoMain;

import java.lang.reflect.Method;

import privateClass.PrivateDemo;

public class ReflectionDemo {
	
	public static void main(String args[]) throws Exception {
		Class c = Class.forName("privateClass.PrivateDemo");
		
		System.out.println(c.isInterface());//to know the class or interface
		System.out.println(c.getSuperclass()); //to know the superclass of given class
		
		PrivateDemo pd = (PrivateDemo)c.newInstance();
		
		Method m = c.getDeclaredMethod("show", null);
		
		m.setAccessible(true);
		
		m.invoke(pd, null);
	}

}
