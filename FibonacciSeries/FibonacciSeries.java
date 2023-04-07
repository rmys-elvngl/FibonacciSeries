package FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int count;
		System.out.println("Fibonacci serisi kaç elemanlı olsun? : ");
		count = input.nextInt();

		int[] series = new int[count];
		
		series[0] = 0;
		series[1] = 1;
		
		for(int i=2; i<count; i++) {
			series[i] = series[i-1] + series[i-2];
		}
		
		for(int i=0;i<count;i++){
			System.out.print(series[i] + " ");
		}
		
	}
}
 //arr[i+1] = arr[i-1] + arr[i];

