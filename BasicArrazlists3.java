//Straxinja 06/2020
import java.util.Random;
import java.util.ArrayList;

public class BasicArrazlists3
{

	public static void main(String[] args){

	Random rnd = new Random();
	ArrayList<Integer> numbers = new ArrayList<Integer>();

	for(int i = 0; i < 1000; i++){
		numbers.add(10 + rnd.nextInt(90));
	}	

	for(int n : numbers){
		if(n == 10){
			System.out.println("Stotka!" + numbers.indexOf(n) + " " + n);
			break;
		}
		System.out.println(n);
	}


	}
}
