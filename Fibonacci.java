package ArraysDemo;

public class Fibonacci {

	public static void main(String[] args) {
int a=0,b=1, c;
System.out.println(a);
System.out.println(b);


//int c;
for(int i =1;i<10;i++) {
	c=a+b;
	System.out.println(c);
a=b;
b=c;
	}
}
}
