//Straxinja 06/2020

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArraylistThereOrNot
{

	public static void main(String[] args){

	ArrayList<Integer> numbers = new ArrayList<Integer>();
	Random rnd = new Random();	
	Scanner scan = new Scanner(System.in);

	for(int i = 0; i < 10; i++){
		numbers.add(1+rnd.nextInt(50));
	}

	System.out.println("ArrayList: " + numbers);
	System.out.print("Value to find: ");
	int value = scan.nextInt();
	int count = 0;
	
	System.out.println();

	for(int n : numbers){
		if(n == value){
			System.out.println(value + " is in the ArrayList.");			
			count++;
		}
	}

	if(count == 0){System.out.println(value + " is NOT in the ArrayList.");}
	
	}
}
