import java.util.Scanner;

class Test67{
	public static void main(String [] args){
		
		Scanner s;
		s=new Scanner(System.in);
		int a;
		int [] arr;
		System.out.print("배열의 크기를 입력하시오: ");
		a=s.nextInt();
		
		arr= new int[a];
		
		
		initArr(arr);
		printArr(arr);
		System.out.println();
		System.out.print("100보다 작은 성분 갯수"+printmin(arr));
		
		
		
		
	}
	
	static void initArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*33)+91;
		}
	}
	
	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
			
		}
	}
	
	static int printmin(int arr[]){
		int b=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<100)
				b++;
		
		}
		return b;
	}

		
	
	
	
	
	
}