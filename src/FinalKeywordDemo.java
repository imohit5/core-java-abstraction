//final classes can extend other classes but cannot be extended from
public final class FinalKeywordDemo {

//	value cannot be changed once assigned
	final int a = 34;
	
//or
	final int b;
	
	FinalKeywordDemo(){
		b = 34;
	}
	
	final static float pi = 3.14F;
	
	public static void main(String[] args) {
		
		final FinalKeywordDemo finalKeywordDemo = new FinalKeywordDemo();
		
		System.out.println(FinalKeywordDemo.pi);
		
		//cannot be done since final keyword is present
		//finalKeywordDemo = new FinalKeywordDemo();
	}
	
}
