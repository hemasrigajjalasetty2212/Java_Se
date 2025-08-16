package pac2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class lab13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Accept product purchase date
        System.out.print("Enter purchase date (YYYY-MM-DD): ");
        String purchaseDateStr = sc.nextLine();
        LocalDate purchaseDate = LocalDate.parse(purchaseDateStr);

        // Accept warranty period in years and months
        System.out.print("Enter warranty period in years: ");
        int years = sc.nextInt();

        System.out.print("Enter warranty period in months: ");
        int months = sc.nextInt();
        
       // Calculate expire date
        Period warrantyPeriod = Period.of(years, months, 0);
        LocalDate expiryDate = purchaseDate.plus(warrantyPeriod);

        // Print result
        System.out.println("Warranty Expiry Date: " + expiryDate);
        
        sc.close();
	}

}
