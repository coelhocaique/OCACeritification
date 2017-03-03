package enthuware;

public class Discounter {
	static final double percent = 0; // 1     
	int offset = 10, base = 50; // 2     

	public static double calc(double value) {
		int coupon, offset, base; // 3        
		if (percent < 10) { // 4            
			coupon = 15;
			offset = 20;
			base = 10;
		}
		return coupon * offset * base * value / 100; // 5     
	}
	
	public static void main(String[] args) {
		int[][][] daaa = {
							{
							  {1,2,3},
							  {2,3,4},
							  {5,6,7}
							}
						};
		int[][] daa = {
						{8,8,8},
						{9,9,9},
						{0,0,0}
					  };
		
		daaa[0] = daa;
		daa = daaa[0];
		
		System.out.println(true + getString());
	}
	static String getString(){
		return null;
	}
}
