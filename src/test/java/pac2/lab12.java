package pac2;

import java.time.format.*;
import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Define date format
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				
				//Accept 1st input date
				System.out.println("Enter first date(dd-MM-yyyy): ");
				String inputDateStr = sc.nextLine();
				
				//Accept 2nd input date
				System.out.println("Enter second date(dd-MM-yyyy): ");
				String inputDateStr2 = sc.nextLine();
				
				LocalDate inputDate = LocalDate.parse(inputDateStr,formatter);
				
				LocalDate inputDate2 = LocalDate.parse(inputDateStr2,formatter);
				
				//LocalDate currentDate = LocalDate.now();
				
				//calculate the duration
				Period duration = Period.between(inputDate, inputDate2);
				
				System.out.println("Duration from "+inputDate.format(formatter)+ "to" + inputDate2.format(formatter)+ ":");
				System.out.println(duration.getYears()+"Years," +
				duration.getMonths()+ "Months," +
						duration.getDays()+ "Days");
				
				sc.close();

		
		
	}

}
