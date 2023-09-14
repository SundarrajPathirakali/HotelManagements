package Project;
import java.util.*;
public class HotelManagement {
        public static void main(String[] args) {
        	Scanner S = new Scanner(System.in);
        	int Qty,amt,i;
     
        	int Bill =0;
        	do
        	{
       System.out.println("W E L C O M E   T O ");
       
	System.out.println("    S.R  HOTELS    ");
	System.out.println("Whats your Choice:");
	System.out.println("1.South Indian");
	System.out.println("2.North Indian");
	System.out.println("3.Chinese");
	
	
    int ch = S.nextInt();
    
    switch(ch)
    {
    case 1:
         SouthIndian SI = new SouthIndian();
          Bill += SI.bill;
         break;
         
   case 2:
            NorthIndian NI = new NorthIndian();
            Bill += NI.bill;
            break;
   case 3:
       Chinese CH = new Chinese();
       Bill += CH.bill;
       break;
   
       default:
    	   System.out.println("Sorry invalid food So choose vald food");
    	   break;
    }
    System.out.println("you want contiue press 1 or press 0");
    i = S.nextInt(); 
        	}
        	while(i==1);
        	System.out.println("your bill is " + Bill);
    
        	}}
