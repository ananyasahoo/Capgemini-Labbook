/*
*Ananya Priyadarshini
* Date- 04/01/2021
* calculate the sum of first n natural numbers which are divisible by 3 or 5.
*/
public class Excercise5 {
	static int calculateSum () 
	{ 
		int N = 6;
		int s = 0;
		for (int num = 0; num <= N; num++) 
        {        
            if (num % 3 == 0 || num % 5 == 0) 
                s+=num; 
        }
		return s;
	} 

	public static void main(String[] args) {
		 
		 System.out.print(calculateSum()); 
	} 
}



