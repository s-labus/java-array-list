//Straxinja 06/2020

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingAValueInAnArrayList
{

	public static void main(String[] args){

	Random rnd = new Random();

	Scanner scan = new Scanner(System.in);
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();

	
	for(int i = 0; i < 10; i++){
		numbers.add(1+rnd.nextInt(50));
	}	


	System.out.println("ArrayList: " + numbers);
	System.out.print("Value to find: ");
	int value = scan.nextInt();
	
	System.out.println();

	for(int n : numbers){
		if(n == value){
			System.out.println(value + " is in the ArrayList.");
		}
	}

	}
}
