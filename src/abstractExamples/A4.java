package abstractExamples;
//final classes can extend other classes but cannot be extended from
public final class A4 extends Audi {

	@Override
	void acceleration() {
		System.out.println("This is A4 acceleration");
	}

	@Override
	void brakingSystem() {
		System.out.println("This is A4 brakingSystem");
	}

}
