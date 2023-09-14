package Project;

import java.util.Scanner;

public class NorthIndian {
	Scanner S = new Scanner(System.in);
	int bill =0,c;
	public NorthIndian()
	{
	do
	{
	System.out.println("Welcome To NorthIndian");
	System.out.println("1.Hydrabad Briyani");
	System.out.println("2.Pulav with Dhall kari");
    System.out.println("3.Rotti With PaneerDika");
	int Or = S.nextInt();
	switch(Or)
	{
	case 1:
		System.out.println("How much Briyani Do u Want?");
		int Qty = S.nextInt();
		 int amt = Qty*120;
		bill +=amt;
		System.out.println("Total Bill = "  + bill );
		break;
		
	case 2:
		System.out.println("How much Pulav Do u Want?");
		Qty = S.nextInt();
		 amt= Qty*140;
		bill +=amt;
		System.out.println("Total Bill = "  + bill );
		break;
	case 3:
		System.out.println("How much Rotti Do u Want?");
		Qty = S.nextInt();
		 amt = Qty*15 +40;
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