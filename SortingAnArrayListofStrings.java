//Straxinja 06/2020

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingAnArrayListofStrings
{

	public static void stringSort(ArrayList<String> s){
		ArrayList<String> toSort = s;
		Collections.sort(toSort);
		System.out.println(toSort + "\n");
	}

	public static void main(String[] args){

	ArrayList<String> words = new ArrayList<String>();
	String[] word = {"Mjolnir", "Ascalon", "Zmijav", "Drakon", "Zmajat", "Kurjak"};
		
	for(int i = 0; i < word.length; i++){
		words.add(word[i]);
	}
	
	System.out.println("ArrayList before: " + Arrays.toString(word) + "\n");
	System.out.print("ArrayList after: ");

	stringSort(words);
	}
}

