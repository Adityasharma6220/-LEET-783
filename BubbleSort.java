package ArraysDemo;

public class BubbleSort {

	public static void main(String[] args) {
int []ar= {8,7,6,5,4,2,3,1};
for(int i=0;i<ar.length;i++) 
{
	for(int j=1;j<ar.length;j++) 
	{
if(ar[j]<ar[j-1]) 
{
int tempvar=ar[j];
ar[j]=ar[j-1];
ar[j-1]=tempvar;
     }
   }			
}
	for (int el:ar) {
		System.out.println(el+" ");
	}
}
	}


