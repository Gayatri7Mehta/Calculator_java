import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args) {
		System.out.println("Hi,I am a Calculator.. Enter two numbers.")
	    Scanner sc=new Scanner(System.in);
	    float a=sc.nextFloat();
	    float b=sc.nextFloat();
	    add(a,b);
	    sub(a,b);
	    mul(a,b);
	    div(a,b);
	}

	    
	    public static void add(float a,float b){
	        float c=a+b;
	        System.out.println(c);
	    }
		
		public static void sub(float a,float b){
		    float d=a-b;
		    System.out.println(d);
		}
		public static void mul(float a,float b){
		    float e=a*b;
		    System.out.println(e);
		}
		public static void div(float a,float b){
		    float f=a/b;
		    System.out.println(f);
		}
	

}