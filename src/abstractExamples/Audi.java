package abstractExamples;

public abstract class Audi {
	
	void commonFeatures() {
		System.out.println("Inside the common Features");
	}
	
	abstract void acceleration();
	
	abstract void brakingSystem();
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
	}

}
