package enthuware;

public class OrderTest {

	// static String url = "jdbc://derby://localhost:1527//mydb";   
	//
	// static DatabaseWrapper getDatabase()   {     
	//  System.out.println("Getting DB");      
	// return null;   
	// }   
	// public static void main(String[] args)   {
	//     System.out.println( getDatabase().url );   } }

	public static void main(String[] args) {

		//
		int i = 4;
		int ia[][][] = new int[i][i = 3][i];

		// System.out.println( ia.length + ", " + ia[0].length+", "+
		// ia[0][0].length);

		Init init = new Init();
		setInit(init);
		System.out.println(init.getIndex());

		// infinite loop
	}

	static int si = 10;

	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.si;
	}
	private static void setInit(Init init) {
		init.setIndex(13);
		init = null;
	}
	
	private static void getLoad(){
		
	}
	private void getLoad(int i){
		
	}

}


class Init{
	public final int BR;
	
	{
		BR = 54;
	}
	int index ;
	
	void setIndex(int i){
		this.index = i;
	}
	
	static int getIndex(){
		return 1;
	}
	
}

class SubInit extends Init{
	
}
