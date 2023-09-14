package Project;

import java.util.Scanner;

public class Chinese {
	
	Scanner S = new Scanner(System.in);
int bill =0,c;
	public Chinese()
	{
	do
	{
	System.out.println("Welcome To Chinese");
	System.out.println("1.Rice(Veg,Non veg)");
	System.out.println("2.Noodles(Veg,Non veg)");
	int Or = S.nextInt();
	switch(Or)
	{
	case 1:
		System.out.println("Which Rice Do u Want?(1.veg,2.Non veg");
		int Q = S.nextInt();
		if(Q ==1) {
		System.out.println("How Many? ");
		int Qty = S.nextInt();
		 int amt = Qty*70;
		bill +=amt;}
		else
		{
			System.out.println("How Many? ");
			int Qty = S.nextInt();
			 int amt = Qty*100;
			bill +=amt;
			
		}
		System.out.println("Total Bill = "  + bill );
		break;
		
	case 2:
		System.out.println("Which Noodles Do u Want?(1.veg,2.Non veg");
		 Q = S.nextInt();
		if(Q ==1) {
		System.out.println("How Many? ");
		int Qty = S.nextInt();
		 int amt = Qty*60;
		bill +=amt;}
		else
		{
			System.out.println("How Many? ");
			int Qty = S.nextInt();
			 int amt = Qty*90;
			bill +=amt;
			
		}
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

}}
