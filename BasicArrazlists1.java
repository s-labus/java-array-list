//Straxinja 06/2020

import java.util.ArrayList;

public class BasicArrazlists1
{

	public static void main(String[] args){

		ArrayList<Integer> numbers = new ArrayList<Integer>();
	
		for(int i = 0; i < 10; i++){
			numbers.add(-113);
		}
		
		for(int i = 0; i < numbers.size(); i++){
			System.out.println("Slot " + i + " contains a " + numbers.get(i));
		}	
				
	}
}
