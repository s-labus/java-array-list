//Straxinja 06/2020
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingSentences
{

	public static void stringSort(ArrayList<String> s){
		ArrayList<String> toSort = s;
		Collections.sort(toSort);
		System.out.println(toSort);
	}

	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	System.out.print("Sentence: ");
	String sentence = scan.nextLine().toLowerCase();
	String[] words = sentence.split(" ");
	
	ArrayList<String> listWords = new ArrayList<String>(Arrays.asList(words));
	
	System.out.print("Sorted: ");
	stringSort(listWords);

	}
}

