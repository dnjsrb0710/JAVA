import java.util.Scanner;

class Elevator{
	int floor;
	boolean door;
	void str(int a){
		if(a==0)
		System.out.print("�κ���");
		if(a<0)
			System.out.printf("���� %d��",-a);
		if(a>0)
			System.out.print(a+"��");
	}
	
	void changeStr(int a){
		switch(a){
		case -1: System.out.print("B1 ");
		break;
		case -2: System.out.print("B2 ");
		break;
		case 0: System.out.print("L ");
		break;
		case 1: System.out.print("1 ");
		break;
		case 2: System.out.print("2 ");
		break;
		case 3: System.out.print("3 ");
		break;
		case 4: System.out.print("4 ");
		break;
		case 5: System.out.print("5 ");
		break;
		case 6: System.out.print("6 ");
		break;
		case 7: System.out.print("7 ");
		break;
		case 8: System.out.print("8 ");
		break;
		case 9: System.out.print("9 ");
		break;
		case 10: System.out.print("10 ");
		break;
		}
		
	}
	
	void open(){
		System.out.println("���� �����ϴ�");
	}
	void close(){
		System.out.println("���� �����ϴ�");
	}
	
	void move(int a){
		
		if(a>=-2&&a<=10){
			this.close();
			{if(a>this.floor){
				this.str(a);
				System.out.println("���� �̵��մϴ�");
				for(int i=this.floor;i<=a;i++){
				changeStr(i);
				}
				}
			if(a<=this.floor){
				this.str(a);
				System.out.println("���� �̵��մϴ�");
				for(int i=this.floor;i>=a;i--){
				changeStr(i);
				}
				}
			}
			System.out.println();
			this.report(a);
			this.floor=a;
			this.open();
		}
		else 
			System.out.println("�׷� ���� �����ϴ� -2�̻� 10������ ���ڸ� �Է����ּ���");
		
		
	}
	
	void report(int a){
		switch(a){
		case -1: System.out.println("����1���Դϴ�.");
		break;
		case -2: System.out.println("����2���Դϴ�.");
		break;
		case 0: System.out.println("�κ��Դϴ�.");
		break;
		default:
		System.out.printf("%d���Դϴ�.\n",a);
		break;
		}
	}
			
		
		
		
		
	}
	
	



class ElevatorTest{
	public static void main(String [] args){
		
		Scanner s;
		s=new Scanner(System.in);
		Elevator myEle=new Elevator();
		Elevator yourEle=new Elevator();
		int a;
		String b;
		
		System.out.print("� ���������͸� Ÿ�ðڽ��ϱ� A? or B? ����� �Ѵ� �Ȱ����ϴ�.");
		b=s.nextLine();
		
		if(b.equals("A")){
		while(true){	
		System.out.print("�������� �����? ");
		a=s.nextInt();
		myEle.move(a);
		
		}
		}
		if(b.equals("B")){
		while(true){	
		System.out.print("�������� �����? ");
		a=s.nextInt();
		yourEle.move(a);
		
		}
		}
		
		
		
		
		
		
		
	}
	
	
}