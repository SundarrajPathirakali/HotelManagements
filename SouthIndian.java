package Project;

import java.util.Scanner;

public class SouthIndian {
	Scanner S = new Scanner(System.in);
	int bill =0;
	int c;
	
	
	public SouthIndian()
	
	{
		do
		{
		System.out.println("Welcome To SouthIndian");
		System.out.println("1.Combo of (Idli,Vada)");
		System.out.println("2.Combo of (Dosa,Vada)");
	    System.out.println("3.Combo of (Boori,Vada)");
		int Or = S.nextInt();
		switch(Or)
		{
		case 1:
			System.out.println("How much Idly Do u Want?");
			int Qty = S.nextInt();
			 int amt = Qty*10 +5;
			bill +=amt;
			System.out.println("Total Bill = "  + bill );
			break;
			
		case 2:
			System.out.println("How much Dosa Do u Want?");
			Qty = S.nextInt();
			 amt= Qty*15 +5;
			bill +=amt;
			System.out.println("Total Bill = "  + bill );
			break;
		case 3:
			System.out.println("How much Boori Do u Want?");
			Qty = S.nextInt();
			 amt = Qty*12 +5;
			bill +=amt;
			System.out.println("Total Bill = "  + bill );
			break;
			default:
				System.out.println("Sorry ,Enter valid Food");
		}
		System.out.println("Thank U");
		
		
		System.out.println("U want to continue 1 or 0");
		 c = S.nextInt();
		}
		while(c==1); 
			System.out.println("your bill is " + bill);
			
		
	}	
}