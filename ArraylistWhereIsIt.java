//Straxinja 06/2020
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistWhereIsIt
{

	public static void main(String[] args){
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	Random rnd = new Random();
	Scanner scan = new Scanner(System.in);
	int counter = 0;

	for(int i = 0; i < 10; i++){
		numbers.add(1+rnd.nextInt(50));
	}

	System.out.println("ArrayList: " + numbers);
	System.out.print("Value to find: ");
	int toFind = scan.nextInt();

	System.out.println();


	for(int n = 0; n < numbers.size(); n++){		

		 if(numbers.get(n) == toFind){
		 	System.out.println(toFind + " is in slot " + n  + ".");
			counter++;
		}
	}

		if(counter == 0){
			System.out.println(toFind + " is not in ther ArrayList.");
		}
	
	}
}
