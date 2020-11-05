//Straxinja 06/2020

import java.util.Random;
import java.util.ArrayList;

public class BasicArrazlists2
{

	public static void main(String[] args){

	Random rnd = new Random();
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	for(int i = 0; i < 10; i++){
		numbers.add(1 + rnd.nextInt(100));
	}

	System.out.println("ArrayList: " + numbers);
				
	}
}
