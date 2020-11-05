//Straxinja 06/2020

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayList
{

	public static void sorted(ArrayList<Integer> list){
		ArrayList<Integer> after = list;
		Collections.sort(after);
		System.out.println(after);
	}

	public static void main(String[] args){
	Random rnd = new Random();
	ArrayList<Integer> before = new ArrayList<Integer>();

	for(int i = 0; i < 100; i++){
		before.add(10+rnd.nextInt(89));
	}

	System.out.println("ArrayList before: " + before + "\n");

	System.out.print("ArrayList after: ");
	sorted(before);

	}
}

