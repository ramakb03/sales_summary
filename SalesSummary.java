package salesSummary;
/* 
 * Program computes statistics for how salespeople did
 */
import java.util.Scanner;
public class SalesSummary {

	public static void main(String[] args) {
		System.out.println("Ramatoulaye Kebe");
		System.out.println("Program #1");
		
		//declare variables
		int idNum;
		int numCustomersWhoBought;
		int numCustomersWhoDidNotBuy;
		int Quota;
		int totalCustomers;
		int Bonus;
		double salesPercentage; 
		int count;
		
		System.out.println();
		System.out.print("Enter salesperson's ID, the number of customers who bought and didn't buy from them, and their quota");
		System.out.println(" (or set salesperson's ID number to -1 to end) : ");		
		
		Scanner scnr = new Scanner (System.in);
		idNum = scnr.nextInt();
		count = 0;
		
		while (idNum != -1) { //entering -1 as input for idNum will automatically end loop. 
			count++; //To keep track of the number of salespeople
			
			numCustomersWhoBought = scnr.nextInt();
			numCustomersWhoDidNotBuy = scnr.nextInt();
			Quota = scnr.nextInt();
		
			Bonus = (numCustomersWhoBought * 2) - numCustomersWhoDidNotBuy;
			totalCustomers = numCustomersWhoBought + numCustomersWhoDidNotBuy;
			salesPercentage = (double)numCustomersWhoBought / totalCustomers;
			
		    System.out.println("id " + idNum);
		    System.out.println(numCustomersWhoBought + " bought " + numCustomersWhoDidNotBuy + " didn't");
		    System.out.println("quota " + Quota);
		    System.out.println("total customers " + totalCustomers);
		   
		     if (numCustomersWhoBought < Quota) {
			System.out.println((Quota - numCustomersWhoBought) + " below quota." + " Try harder.");
		}
		     else if (numCustomersWhoBought > Quota) {
			System.out.println ((numCustomersWhoBought - Quota) + " above quota." + " Congratulations!");
		}
		     else {
			System.out.println ("made quota. Congratulations!");
		}
		
		     if (Bonus >= 0) {
			System.out.println("bonus $" + Bonus);
		}
		     else {
			System.out.println("bonus 0");
		}
		
		     if (numCustomersWhoBought > numCustomersWhoDidNotBuy) {
			System.out.println("more bought than didn't");
		}
		     else if (numCustomersWhoBought < numCustomersWhoDidNotBuy) {
			System.out.println("more didn't buy");
		}
		     else {
			System.out.println("same number of each");
		}
		
		     System.out.printf("sales pct. is %.3f", salesPercentage);
		     System.out.println("%");
	         System.out.println();	
		     System.out.println("Enter next salesperson's ID or -1 to end: ");  //To get next input from user to continue or end loop
		    idNum = scnr.nextInt();
		   
		}
		
		System.out.println("Last salesperson has been processed. Total number of salespersons is: " + count);
		scnr.close();
		
	} 
    	
}

				