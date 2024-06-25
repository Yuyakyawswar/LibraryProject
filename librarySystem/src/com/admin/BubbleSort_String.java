package lo3.sorting;

import java.util.Arrays;

public class BubbleSort_String {
	public static void main(String[] args) {
		String[] arr = {"Yuya","Chi","Nay","Han","Thar"};
		System.out.print("Before sorting : ");
		System.out.println(Arrays.toString(arr));
		
		sort(arr);
		System.out.print("After sorting : ");
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(String[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 1; j < arr.length-i; j++)
				if(arr[j-1].compareToIgnoreCase(arr[j])>0) {
					String temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
		}
	}

}
