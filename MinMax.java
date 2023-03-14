package ArraysDemo;

public class MinMax {

	public static void main(String[] args) {
int[]ar={10,20,30,70};
int max= ar[0];
for(int i=0;i<ar.length;i++) {
if(ar[i]>max) {
	
	max=ar[i];
}
}
System.out.println("The max Array is" +max);
int min= ar[0];
for(int i=0;i<ar.length;i++) {
if(ar[i]<min) {
	min=ar[i];
}
}	
System.out.println("The min Array is" +min);
	}

}
