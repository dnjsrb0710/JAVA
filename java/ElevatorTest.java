import java.util.Scanner;

class Elevator{
	int floor;
	boolean door;
	void str(int a){
		if(a==0)
		System.out.print("로비층");
		if(a<0)
			System.out.printf("지하 %d층",-a);
		if(a>0)
			System.out.print(a+"층");
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
		System.out.println("문이 열립니다");
	}
	void close(){
		System.out.println("문이 닫힙니다");
	}
	
	void move(int a){
		
		if(a>=-2&&a<=10){
			this.close();
			{if(a>this.floor){
				this.str(a);
				System.out.println("으로 이동합니다");
				for(int i=this.floor;i<=a;i++){
				changeStr(i);
				}
				}
			if(a<=this.floor){
				this.str(a);
				System.out.println("으로 이동합니다");
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
			System.out.println("그런 층은 없습니다 -2이상 10이하의 숫자를 입력해주세요");
		
		
	}
	
	void report(int a){
		switch(a){
		case -1: System.out.println("지하1층입니다.");
		break;
		case -2: System.out.println("지하2층입니다.");
		break;
		case 0: System.out.println("로비입니다.");
		break;
		default:
		System.out.printf("%d층입니다.\n",a);
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
		
		System.out.print("어떤 엘리베이터를 타시겠습니까 A? or B? 참고로 둘다 똑같습니다.");
		b=s.nextLine();
		
		if(b.equals("A")){
		while(true){	
		System.out.print("몇층으로 갈까요? ");
		a=s.nextInt();
		myEle.move(a);
		
		}
		}
		if(b.equals("B")){
		while(true){	
		System.out.print("몇층으로 갈까요? ");
		a=s.nextInt();
		yourEle.move(a);
		
		}
		}
		
		
		
		
		
		
		
	}
	
	
}