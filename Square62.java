import java.util.Scanner;


public class Square62 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a1=s.nextInt();
		int b1=s.nextInt();
		int a2=s.nextInt();
		int b2=s.nextInt();
		int a3=s.nextInt();
		int b3=s.nextInt();
		int a4=s.nextInt();
		int b4=s.nextInt();
		if(a1==a2 && a3==a4 && b3==b2 && b1==b4){
			System.out.println("Square");
		}else{
			System.out.println("Not a square");
		}
	}

}
