import java.util.Scanner;
import java.util.*;

public class Sort {

	public static void main(String[] args) {
		System.out.println("Please enter no of elements you want to enter: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> input = new ArrayList<Integer>(); 
		System.out.println("Enter number you want to sort");
		for(int i = 0; i< num; i++) {
			input.add(sc.nextInt());
		}
		
		System.out.println("You entered following numbers");
		for(int i = 0; i< num; i++) {
			System.out.println(input.get(i));
		}
		
		/*  Sorting functions
		 * */
		
		bubbleSort(input);
		
		System.out.println("Numbers after sorting");
		for(int i = 0; i< num; i++) {
			System.out.println(input.get(i));
		}
		
	}

	private static void bubbleSort(ArrayList<Integer> input) {
		for (int i = 0; i < input.size(); i++) {
			for (int j = 0; j < input.size() - i - 1; j++) {
				if (input.get(j) > input.get(j+1)) {
					int temp = input.get(j);
					input.set(j, input.get(j + 1));
					input.set(j + 1, temp);
				}
			}
		}
	}
}









