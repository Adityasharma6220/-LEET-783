package ArraysDemo;
import java.util.Scanner;
public class Binary21 {

	public static void main(String[] args) {
int ar[]= {10,20,30,40,50,60,70,80,90};
Scanner sc=new Scanner(System.in);
System.out.println("Enter the key to be Searched");	
int key=sc.nextInt();
int low=0;
int high=ar.length-1;
while(low<=high) {
int mid =(low+high)/2;
if (key==ar[mid]) {
System.out.println("key " +key+ " found at index " +mid);
break;
}
else if(key<ar[mid]){
high=mid-1;
}
else if (key>ar[mid])	{
	low =mid+1;
}	 
}
if(low>high) {
	System.out.println("Key not found");
}
}

	}

