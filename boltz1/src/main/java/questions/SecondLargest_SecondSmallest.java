package questions;

import java.util.Arrays;

public class SecondLargest_SecondSmallest {
	
	public int secondlar(int arr[]) {
		
		int lar=0;
		int seclar=0;
		
		for (int num : arr) {
			if(num>lar) {
				seclar = lar;
				lar=num;
			}
			else if (num> seclar && num!=lar) {
				seclar = num;
			}
		}
		
		
		return seclar;
		
	}
	
	public void secondlarge(int[] arr) {
		Arrays.sort(arr);
		int second = 0;
		for (int i = 0; i < arr.length; i++) {
			 second = arr[arr.length-2];
		}
		System.out.println(second);
	}
	
	public void secondsmall(int[] arr) {
		Arrays.sort(arr);
		int second = 0;
		for (int i = 0; i < arr.length; i++) {
			 second = arr[1];
		}
		System.out.println(second);
	}
	
	

	public static void main(String[] args) {
		int[] arr = {5,9,2,4,13};
		
		System.out.println(Arrays.toString(arr));
		SecondLargest_SecondSmallest st = new SecondLargest_SecondSmallest();
		//st.secondlarge(arr);
		st.secondsmall(arr);
		st.secondlar(arr);
		

	}

}
