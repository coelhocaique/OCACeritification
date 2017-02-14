package b;

import java.io.IOException;

public class B implements TheValue{
	int x;
	public static int[] getArray() {
		return null;
	}

	public static void main(String[] args) {
		int index = 1;
		try {
			getArray()[index = 2]++;
		} catch (Exception e) {
		} // empty catch       
	//	System.out.println("index = " + (index = 3));
		B b = new B();
		System.out.println(b.theValue);
		System.out.println(theValue);
		System.out.println(TheValue.theValue);
		int[] arr = {1,2,3};
		int[] rr = new int[3];
		
		int c = 5;
		System.out.println(c+=c);
		int lo = 1;
		switch(lo){
		
		}
		
	}
	public float parseFloat( String s ){
	     float f = 0.0f;      // 1
	     try{
	          f = Float.valueOf( s ).floatValue();    // 2
	          return f ;      // 3
	     }
	     catch(NumberFormatException nfe){
	        f = Float.NaN ;    // 4
	       //return f;     // 5
	     }
	     finally {
	       // return f;     // 6
	     }
	     return f ;    // 7
	 }
	
	public void m2(){
		int a;
		x++;
	}
}


interface TheValue{
	int theValue = 10;
}

class Base{
	Base(){
		
	}
	   public Object getValue() throws IOException{ return 1; } //1
	}
	class Base2 extends Base {
	   public Byte getValue() { return 2; } //2
	}