/*
 * 	@Johnpaul Nguyen and @Markus Means
 * @version 1.0
 */

public class Project2 {
		
	public static void main(String[] args) 
		{
			/*The goal is to be able to create a bookstore calculator and print out prices of books and total cost*/
			
			String book1 = "Three Sisters, Bi Feiyu";
			String book2 = "Song of Solomon, Toni Morrison";
			String book3 = "Owls Do Not Have to Mean Death, Chip Livingston";
			double threeSisters = 18.99;
			double songSolomon = 11.99;
			double owlsDeath = 80.50;
			int numBook1 = 2;
			int numBook2 = 4;
			int numBook3 = 1;
			final double TAX_PERCENTAGE = 0.0875;
			
			double costBeforeTax = (threeSisters * numBook1) + (songSolomon * numBook2) + (owlsDeath * numBook3);
			double salesTax = costBeforeTax * TAX_PERCENTAGE;
			double totalCost = salesTax + costBeforeTax;
			
			System.out.println("Purchase" + " " + numBook1 + " " + "copies of" + " " + book1 + "." + " Each copy costs $" + threeSisters + ".");
			System.out.println("Purchase" + " " + numBook2 + " " + "copies of" + " " + book2 + "." + " Each copy costs $" + songSolomon + ".");
			System.out.println("Purchase" + " " + numBook3 + " " + "copy of" + " " + book3 + "." + " Each copy costs $" + String.format("%.2f", owlsDeath) + "."); 
			System.out.println("Total before tax: $" + String.format("%.2f", costBeforeTax));
			System.out.println("Sales tax: $" + String.format("%.2f", salesTax));
			System.out.println("The total cost of your order will be $" + String.format("%.2f", totalCost));
			
		}
}