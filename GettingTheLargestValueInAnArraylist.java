//Straxinja 06/2020
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class GettingTheLargestValueInAnArraylist
{

	public static void main(String[] args){
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	Random rnd = new Random();

	for(int i = 0; i < 100; i++){
			numbers.add(1+rnd.nextInt(100));
		}	

	System.out.println("ArrayList: " + numbers + "\n");

	
	Collections.sort(numbers);

	int largest = numbers.get(numbers.size()-1);

	System.out.println("The largest value is " + largest);
	}
}
