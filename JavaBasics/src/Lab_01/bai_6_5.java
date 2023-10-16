package Lab_01;

//Ho ten : Luong Hai Dang 
//Mssv: 20210151

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bai_6_5 {
  public static int sum(int[] arr) {
	  int s = 0;
	  for(int i : arr) {
		  s += i;
	  }
	  return s;
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input size array :");
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		System.out.printf("a[%d] = ",i);
		arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println("Sorted array:");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]);
	}
	System.out.println("");
	System.out.println("sum = " + sum(arr));
	double avg =(double) sum(arr)/n;
	System.out.println("average = " + avg);
	
	
}
}
