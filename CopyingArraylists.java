//Straxinja 06/2020

import java.util.Random;
import java.util.ArrayList;

public class CopyingArraylists
{

	public static void main(String[] args){

	Random rnd = new Random();
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	ArrayList<Integer> numbers2 = new ArrayList<Integer>();

	for(int i = 0; i < 10; i++){
		numbers.add(1+rnd.nextInt(100));
	}

	numbers2.addAll(numbers); // this is one method to copy	

	ArrayList<Integer> numbers3 = new ArrayList<Integer>(numbers); // another method to copy

	numbers.set(numbers.size()-1, -7); // set method will modify last value

	System.out.println("ArrayList 1: " + numbers);
	
	System.out.println("ArrayList 2: " + numbers3);
	
	}
}
