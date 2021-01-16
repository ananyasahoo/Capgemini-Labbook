import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Create a method which accepts an integer array, reverse the numbers in the array and returns 
   the resulting array in sorted order
  *@author Ananya Priyadarshini
 */

public class Exercise7 {
public static void sortCharacters(int[] arr) {
		
		String arrs[] = new String[arr.length];

		for(int i=0;i<arr.length;i++) {
			arrs[i] = Integer.toString(arr[i]);
		}
		int[] b = new int[arr.length]; 
		int j = arr.length; 
		for (int i = 0; i < arr.length; i++) { 
			b[j - 1] = arr[i]; 
			j = j - 1; 
		} 
		System.out.println("Reversed array is: \n"); 
		for (int k = 0; k < arr.length; k++) { 
			System.out.println(b[k]); 
		} 
		
		
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arrs[i]);
		}
		
		Collections.sort(list);
		System.out.println("Sorted list = "+list);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter size : ");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter String : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		sortCharacters(arr);
	}



}
