import java.util.Scanner;

class Test5{
	public static void main(String[]args){
		
	 Scanner s;
	 s=new Scanner(System.in);
	 int a;
	 int i=0;
	 int sum=1;
	 
	 while(true)
	 {System.out.print("정수: \n");
		a=s.nextInt();
		if(a==-1)
		break;
		if(i%2==1)
			i=i+1;
			sum=sum*a;

	 }
	 
	 
		System.out.printf("입력한 수 중 조건을 만족하는 %d개의 양의 홀수들의 곱은 %d입니다.",i,sum);
	 
		
		
	}
}