import java.util.Scanner;
class Test3{
	public static void main(String []args){
		Scanner s;
		s=new Scanner(System.in);
		double a;
		int b,abs,c;
		String output;
		
		System.out.print("-1000�ʰ� 1000�̸��� �Ǽ��� �Է��Ͻÿ�:");
		a=s.nextDouble();
		b=(int)a;
		abs=(b&0x80000000)==0?b:-b;
		
		System.out.printf("�����κ� : %d \n",b);
	
	System.out.printf("�����κ��� ����: %d ( ",abs);
	
	c=abs/100;
	abs=abs%100;
	output=c>1?c+"��":(c==1?"��":"");
	
	System.out.printf(output);
	
	c=abs/10;
	abs=abs%10;
	output=c>1?c+"��":(c==1?"��":"");
	
	System.out.printf(output);
	System.out.printf("%d)",abs>0?abs:"");
	
	}
}
	
	
		
		
		