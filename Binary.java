package ArraysDemo;

import java.util.Scanner;

public abstract class Binary {
	public static void main(String[] args) {
int arr[]= {1,2,3,4,5,6,7,8,9};
Scanner sc=new Scanner(System.in);
System.out.println("Enter the key to be searched");
      int key=sc.nextInt();
      int low=0;
      int high=arr.length-1;
	while(low<=high) {
		int mid =(low+high)/2;
		if(key==arr[mid]) {
		System.out.println("key "+key+ " found at index " +mid);
		break;
		}
		else if(key<arr[mid]) {
		high=mid-1;
		}
		else if(key>arr[mid]) {
			low=mid +1;	
		}
		}
	if(low>high) {
	System.out.println("key not found");
	}
	}
}
