package enthuware;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] a = {{1,2},null};
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
			//	System.out.println(a[i][j]);
			}
		}
		
		String[][][] arr={{ { "a", "b" , "c"}, { "d", "e", "f" } },{ {"x"}, {"any"} },{{"y"}},{ { "z","p"}, {} }};
		
		for(String[][] i: arr){
			//System.out.println(String.valueOf(i) + " i starts");
			for(String[] j: i){
			//	System.out.println(String.valueOf(j)  + " j starts");

				for(String k:j){
				//	System.out.print(String.valueOf(k)  + " ");
				}
				System.out.println();
		//		System.out.println(String.valueOf(j)  + "j ends");

			}
	//		System.out.println(String.valueOf(i)  + "i ends");
			System.out.println();
		}
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("111");
		arrayList.add("222");
		System.out.println(arrayList.get(arrayList.size()));
		
		
	}

}

