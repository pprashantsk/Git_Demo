package factoryDesign;

public class OSfactory {
	
	public OS getInstance(String str) {
		if(str.equals("android"))
			return new Android();
		else if(str.equals("Apple"))
			return new Apple();
		else return  new Windows();
					
	}

}
