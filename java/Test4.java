import java.util.Scanner;

class Test4{
	public static void main(String []args){
		
		Scanner s;
		s=new Scanner(System.in);
		
		double a,c,d;
		String b;
		
		while(true){
			System.out.print("���� �������� �����մϴ�.���� �Է��ϼ���:");
			a=s.nextDouble();
			b=s.next();
			c=s.nextDouble();
			
			if(b.equals("*"))
				break;
			if(b.equals("/"))
				break;
			else System.out.print("�Է¿���. ������ �������� �����մϴ�\n");
		}
		
		switch(b){
			
			case "*":
			d=a*c;
			if(d%1==0)
				System.out.printf("��� ���:%d",(int)d);
			else 
				System.out.printf("��� ���:%.2f",d);
			break;
			case "/":
			d=a/c;
			if(c==0)
				System.out.print("0���δ� ���� �� �����ϴ�");
			else{if(d%1==0)
				System.out.printf("��� ���:%d",(int)d);
			else 
			System.out.printf("��� ���:%.2f",d);}
			break;
		}
	}
}
				
			
			
			
			
			
			
			
			
			
			
			
			