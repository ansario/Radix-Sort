package ansario_lab11;

import java.util.ArrayList;
import java.util.Random;

public class radixSort {

	private static ArrayList<Integer> newArrayList;

	public static ArrayList<Integer> generateArray(int n){
		newArrayList = new ArrayList<Integer>(n);
		Random rand = new Random();
		for (int i = 0; i<n; i++){
			newArrayList.add(rand.nextInt(n + 1));
		}
		
		return newArrayList;
	}

	public static ArrayList<Integer> radixSort(ArrayList<Integer> x){
		int MAX_DIGITS = 0;
		int divisor = 1;
		int counter = 0;
		
		for (int i = 0; i<x.size(); i++){
			if (x.get(i)>MAX_DIGITS){
				MAX_DIGITS = x.get(i);
			}
		}
		String tempDigits = MAX_DIGITS+"";
		int numberOfDigits = tempDigits.length();
		
		while(counter<numberOfDigits){
		ArrayList<Integer> bucketList = new ArrayList<Integer>();
		
		for (int j = 0; j < x.size(); j++){
			if ((x.get(j)/divisor)%10 == j){
				
			}
		}
		
		
		
		
		
		
		}
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> new1 = generateArray(10);
		System.out.println(new1);
		new1 = radixSort(new1);
		System.out.println(new1);
	}

}
