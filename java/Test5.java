import java.util.Scanner;

class Test5{
	public static void main(String[]args){
		
	 Scanner s;
	 s=new Scanner(System.in);
	 int a;
	 int i=0;
	 int sum=1;
	 
	 while(true)
	 {System.out.print("����: \n");
		a=s.nextInt();
		if(a==-1)
		break;
		if(i%2==1)
			i=i+1;
			sum=sum*a;

	 }
	 
	 
		System.out.printf("�Է��� �� �� ������ �����ϴ� %d���� ���� Ȧ������ ���� %d�Դϴ�.",i,sum);
	 
		
		
	}
}