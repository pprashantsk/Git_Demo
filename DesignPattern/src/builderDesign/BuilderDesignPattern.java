package builderDesign;

public class BuilderDesignPattern {
	
	private int ram;
	private String os;
	private String battery;
	
	public BuilderDesignPattern() {
		super();
	}
	
	public BuilderDesignPattern(int ram, String os, String battery) {
		super();
		this.ram = ram;
		this.os = os;
		this.battery = battery;
	}
	
	public BuilderDesignPattern setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public BuilderDesignPattern setOs(String os) {
		this.os = os;
		return this;
	}
	public BuilderDesignPattern setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	
	public BuilderDesignPattern getPhone() {
		return new BuilderDesignPattern(ram, os, battery);
	}

	@Override
	public String toString() {
		return "BuilderDesignPattern [ram=" + ram + ", os=" + os + ", battery=" + battery + "]";
	}

	
	
	

}
