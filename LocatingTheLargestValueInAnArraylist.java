//Straxinja 06/2020
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
public class LocatingTheLargestValueInAnArraylist
{

	public static int search(ArrayList<Integer> arr, int x){
		for(int i = 0; i < arr.size(); i++){
			if(arr.get(i) == x){
				return i;
			}
		
		}
	return -1;
	}

	public static void main(String[] args){
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	Random rnd = new Random();

	for(int i = 0; i < 100; i++){
		numbers.add(1+rnd.nextInt(100));
	 }
	
	/*sorting highest value using arraylist 
	 ArrayList<Integer> copy = new ArrayList<>();
	 copy.addAll(numbers);
	 Collections.sort(copy);
	 int ln = copy.size()-1;
	 int key = copy.get(ln);
	*/

	Integer[] sorted = new Integer[numbers.size()];
	sorted = numbers.toArray(sorted);
	Arrays.sort(sorted);
	int key = sorted[sorted.length-1];
	
	System.out.println("ArrayList: " + numbers + "\n");	

	System.out.println("The largest values is "+ key + " which is in slot " + search(numbers, key));

	}
}
