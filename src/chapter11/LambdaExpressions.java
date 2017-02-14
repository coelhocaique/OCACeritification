package chapter11;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		//Arrays.sort(args,(o1,o2) -> o1.compareToIgnoreCase(o2));
		
		Strummable instrument = (a) -> {return a++;};
		int b = 10;
		System.out.println(instrument.strum(b));
		
		int i = 1 + 2 << 1;
		if((1 | 2 |3) != i)
			System.out.println(i);

	}
	
	@FunctionalInterface
	interface Strummable {
		int strum(int a);
	}
	
}
