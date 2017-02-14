package enthuware;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tests {
	private double side = 0;
	private Tests(){
		
	}
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//conversions
		System.out.println(new Tests().main);
		short s = Short.MAX_VALUE;
		byte b = 1;
		char c = (char)s;
		c++;
		long l = 1l;
		double d = 1;
		Object o = new String();
		l = c;
		int i = 1234567890; 
		i = c;
		s = (short)c;
		switch(i){
		case 's':
		default:
		case 'd':
		}
		boolean z = false,x = true;
		if(z=x)
			if(true)
			System.out.println();
		else
			System.out.println();
		
		//long y = _123_456L;
		float f1 = 123_345_667F;
		int j,k,m;
		j=k=m=9;
		System.out.println("j : "+ f1);
		System.out.println(LocalDate.now());
		//end 
		StringBuilder s1 = new StringBuilder("snorkler");
		StringBuilder s2 = new StringBuilder("yoodler");
		
		System.out.println("action: " + s1.append(s2.substring(2, 5).toUpperCase()));
		System.out.println("variable b1: " + s1);
		System.out.println("variable b2: " + s2);
		System.out.println("------------------");
		
		s1 = new StringBuilder("snorkler");
		s2 = new StringBuilder("yoodler");
		
		System.out.println("action: " + s2.insert(3, s1.append("a")));
		System.out.println("variable b1: " + s1);
		System.out.println("variable b2: " + s2);
		System.out.println("------------------");
		
		s1 = new StringBuilder("snorkler");
		s2 = new StringBuilder("yoodler");
		
		System.out.println("action: " + s1.replace(3, 6, s2.substring(1,3)).append(s2.append(false)));
		System.out.println("variable b1: " + s1);
		System.out.println("variable b2: " + s2);
		System.out.println("------------------");
		
	//	String o = new String();
		Object stt = (Object) o;
		System.out.println(stt);
		
		int a = (Integer)Integer.MIN_VALUE;
		System.out.println(a);
		int a1 = 64;
		System.out.println(a1);
		System.out.println(a + "     "+ a1);
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		 j =0;i=0;
		 for (i = 0; i++ < 3;System.out.println(i)){
	      }
		
		String 	t1 = "good";
		String t2 = "good";
		System.out.println(t1.intern() == t2.intern());
		System.out.println("\u0000");
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("a");
		l1.add("b");
		l1.add(1, "c");
		
		List<String> subList = l1.subList(1, 1);
		Object t = new Integer(107); 
		
		int ki = ((Integer) t).intValue()/9; 
		System.out.println(ki);
		int[][] xs = new int[1][2];
		int yt = xs.length;
//		do{
//			xs--;
//			System.out.println(xs);
//			
//		}while(xs<10);
		
		try{
			
		}catch(RuntimeException r){
			
		}

		subList.stream().forEach(p -> System.out.println(p));
		boolean b1 = false; boolean b2 = false; 
		if (b2 != (b1 = !b2)){System.out.println("true"); }
		
	}
	int main;
	//abstract public void myMethod(int m, Object p, double d);//  ... valid code here }
	static void crazyLoop(){
		   int c = 0;
		   JACK: while (c < 8){
		       JILL: System.out.println(c);
		       if (c > 3) break JACK; else c++;
		   }
		}

}

class ABCD{
	   int x = 10;
	   static int y = 20;
	   
	   public void m1(){
		  
		   while(x!= 0 ){
			   
		   }
	   }
	}
	class MNOP extends ABCD{
	   int x = 30;
	   static int y = 40;
	}
	
interface T1{
	int value = 10;
}

interface T2{
	int value = 20;
	void m1();
}

class T3 implements T1,T2{
	public  void m1(){
		
	}
}
abstract class a{
	
}

class TestClass1{
	   public static void main(String args[]){
	      int i = 0;
	      loop :         // 1
	      {
	         System.out.println("Loop Lable line");
	         try{
	            for (  ;   ;  ){
	               if( i >5) break loop;       // 2
	            }
	         }
	         catch(NullPointerException e){
	            System.out.println("Exception in loop.");
	         }
	         finally{
	            System.out.println("In Finally");      // 3
	         }
	      }
	   }
	}
