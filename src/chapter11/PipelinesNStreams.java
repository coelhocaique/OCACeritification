package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class PipelinesNStreams {

	public static void main(String[] args) {
		
		List<ShoeList> s = new ArrayList<>();
		s.add(new PipelinesNStreams.ShoeList(13));
		s.add(new PipelinesNStreams.ShoeList(10));
		s.add(new PipelinesNStreams.ShoeList(17));
		s.add(new PipelinesNStreams.ShoeList(15));
	
		ShoeSort shoe = new ShoeSort();
		Collections.sort(s,shoe);
		s.stream().forEach(sh -> System.out.println(sh.getSize()));
		
		s.stream().filter(sh -> !sh.isBranded()).forEach(sh -> System.out.println(sh.getSize()));
		
	}
	
	
	static class ShoeList{
		private int size;
		
		public ShoeList(int size){
			this.size = size;
		}
		public boolean isBranded(){
			return false;
		}
		
		public int getSize(){
			return size;
		}
	}
	
	static class ShoeSort implements Comparator<ShoeList>{

		@Override
		public int compare(ShoeList o1, ShoeList o2) {
			return o1.toString().compareTo(o2.toString());
		}
		
	}

}
