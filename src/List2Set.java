

import java.util.*;


public class List2Set {

	public static void main(String[] args) {


		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(45);
		al.add(12);
		al.add(45);
		al.add(76);
		
		
		System.out.println(al);
		
		for(int i:al){
			System.out.println(i);
		}
		

		Set<Integer> S=new HashSet<Integer>(al);
		
		System.out.println(S);
		
	}

}
