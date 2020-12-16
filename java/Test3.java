import java.util.Scanner;
class Test3{
	public static void main(String []args){
		Scanner s;
		s=new Scanner(System.in);
		double a;
		int b,abs,c;
		String output;
		
		System.out.print("-1000초과 1000미만의 실수를 입력하시오:");
		a=s.nextDouble();
		b=(int)a;
		abs=(b&0x80000000)==0?b:-b;
		
		System.out.printf("정수부분 : %d \n",b);
	
	System.out.printf("정수부분의 절댓값: %d ( ",abs);
	
	c=abs/100;
	abs=abs%100;
	output=c>1?c+"백":(c==1?"백":"");
	
	System.out.printf(output);
	
	c=abs/10;
	abs=abs%10;
	output=c>1?c+"십":(c==1?"십":"");
	
	System.out.printf(output);
	System.out.printf("%d)",abs>0?abs:"");
	
	}
}
	
	
		
		
		