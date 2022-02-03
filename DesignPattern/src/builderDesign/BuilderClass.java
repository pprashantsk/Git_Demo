package builderDesign;

public class BuilderClass {

	public static void main (String args[]) {
	BuilderDesignPattern bd = new BuilderDesignPattern().setBattery("34546").setOs("dfg").getPhone();
	System.out.println(bd);
	}


}
