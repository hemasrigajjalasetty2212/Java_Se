package pac2;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class lab14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a valid Zone ID: ");
		String zoneInput = sc.nextLine();
		
		printCurrentDateTimeForZone(zoneInput);
		
		sc.close();
	}
	
	public static void printCurrentDateTimeForZone(String zoneIdStr) {
        ZoneId zoneId = ZoneId.of(zoneIdStr);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);

        System.out.println("Current date and time in " + zoneId + ": " + zonedDateTime);
	}

}
