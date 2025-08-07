package arrRegExc_lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] products = new String[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Enter product name "+(i+1)+": ");
			products[i] = sc.nextLine();
		}
		
		Arrays.sort(products);
		
		System.out.println("\nSorted Product List: ");
		for(String product : products) {
			System.out.println(product);
		}
		sc.close();
	}

}
