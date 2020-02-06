package EPAM.GiftBox;
import java.util.*;
public class App 
{
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Gift> gifts = new ArrayList<Gift>();
	
	static Gift gift;
	
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the New Year Gifts!!!");
        System.out.println("Enter Minimal cost of Gift Basket");
        int mincost = sc.nextInt();
        System.out.println("Enter Maximum cost of gift Basket");
        int maxcost = sc.nextInt();
        boolean check = true;
        int choice;
        
        do {
        	System.out.println("Enter your Choice :");
        	System.out.println("1.Sweet ");
        	System.out.println("2.Chocolates");
        	System.out.println("3.Exit");
        	int ch = makeChoice(3);
        	
        	switch(ch)
        	{
        		case 1:
                	gift = new Sweet();
        			System.out.println("1.Laddu");
        			System.out.println("2.Gulab Jamune");
        			System.out.println("3.Rasagulla");
                	choice = makeChoice(3);
                	switch(choice)
                	{
                		case 1:
                			gift = new Laddu();
                			break;
                		case 2:
                			gift = new GulabJamune();
                		case 3:
                			gift = new Rasagulla();
                			break;
                			
                	}
                	gifts.add(gift);
        		break;
        			
        		case 2:
                	gift = new Chocolate();
        			System.out.println("1.Hersheys");
        			System.out.println("2.MilkyWay");
        			System.out.println("3.Galaxy");
        			choice = makeChoice(3);
        			switch(choice)
                	{
                		case 1:
                			gift = new Hersheys();
                			break;
                		case 2:
                			gift = new MilkyWay(); 
                		case 3:
                			gift = new Galaxy();
                			break;
   
                	}
        			gifts.add(gift);
        		break;
        		
        		case 3:
        			check = false;
        	}
        }while(check == true);
        if(calculateTotalCost()>=mincost && calculateTotalCost()<=maxcost )
        {
        System.out.println("Selected Gifts are...");
        displaygift();
        }
        else
        {   
        	System.out.println("Sorry! New Years Gift Didn't met the Range You specified\n");
  
        }
    }

	private static void displaygift() {
		for(int i =0 ;i<gifts.size(); i++)
    	{
    		System.out.println(gifts.get(i).getName()+" ----- "+Integer.toString(gifts.get(i).getCost()));
    	}
    	System.out.println("Total Cost of the gift Basket is: "+Integer.toString(calculateTotalCost()));
		
	}

	private static int makeChoice(int i) {
		System.out.println("Enter your choice");
		int choice = 0;
		choice = sc.nextInt();
		return choice;
	}
      public static Integer calculateTotalCost() {
		
		int sum =0;
		for(int i =0 ;i<gifts.size();i++)
		{
			sum+= gifts.get(i).getCost();
		}
		return sum;
	}
	
}
