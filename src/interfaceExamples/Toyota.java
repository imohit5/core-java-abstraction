package interfaceExamples;
public class Toyota implements Car {

	@Override
	public void acceleration() {
		System.out.println("This is acceleration");
	}

	@Override
	public void brakingSystem() {
		System.out.println("This is toyota braking system");
	}

}
