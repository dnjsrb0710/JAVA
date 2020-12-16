import java.util.Scanner;

class Test4{
	public static void main(String []args){
		
		Scanner s;
		s=new Scanner(System.in);
		
		double a,c,d;
		String b;
		
		while(true){
			System.out.print("곱과 나눗셈만 가능합니다.식을 입력하세요:");
			a=s.nextDouble();
			b=s.next();
			c=s.nextDouble();
			
			if(b.equals("*"))
				break;
			if(b.equals("/"))
				break;
			else System.out.print("입력오류. 곱셈과 나눗셉만 가능합니다\n");
		}
		
		switch(b){
			
			case "*":
			d=a*c;
			if(d%1==0)
				System.out.printf("계산 결과:%d",(int)d);
			else 
				System.out.printf("계산 결과:%.2f",d);
			break;
			case "/":
			d=a/c;
			if(c==0)
				System.out.print("0으로는 나눌 수 없습니다");
			else{if(d%1==0)
				System.out.printf("계산 결과:%d",(int)d);
			else 
			System.out.printf("계산 결과:%.2f",d);}
			break;
		}
	}
}
				
			
			
			
			
			
			
			
			
			
			
			
			