package week1.day2.assignments;

public class Car {
	public void applyBreak() {
		System.out.println("Break is applied");
	}

	private void applyGear() {
		System.out.println("Gear changed");
	}

	void switchOnAc() {
		System.out.println("AC is ON");
	}

	public void applyAcclerate() {
		System.out.println("Acceleration started");
	}

	public static void main(String[] args) {
		Car obj = new Car();
		obj.applyBreak();
		obj.applyGear();
		obj.switchOnAc();
		obj.applyAcclerate();

	}

}
