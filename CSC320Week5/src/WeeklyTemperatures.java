
import java.util.ArrayList;
import java.util.Scanner;


public class WeeklyTemperatures {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		ArrayList<String> daysOfWeek = new ArrayList<String>();
		ArrayList<Integer> dailyTemperature = new ArrayList<Integer>();
		
		
		String dayInput;
		int tempInput = 0;
		String findDay;
		
		for(int i = 0; i < 7; ++i) {
			System.out.print("Enter the days of the week (Mon to Sun): " );
			dayInput = scnr.next();
			daysOfWeek.add(dayInput);
			
			System.out.print("Enter the average temperature of " + dayInput + ":" );
			tempInput = scnr.nextInt();
			dailyTemperature.add(tempInput);	
		}
		
		System.out.println("========================= GET TEMPERATURE BY DAY =========================== ");
		
		System.out.print("Please provide the day you want to get the tempature for: ");
		findDay = scnr.next();
		
		if(findDay.equalsIgnoreCase("week")) {
			double sum = 0.0;
			for(int i = 0; i < dailyTemperature.size(); i++) {
				System.out.println(daysOfWeek.get(i) + ": " + dailyTemperature.get(i));
				sum += dailyTemperature.get(i);	
			}
			System.out.print("The temperature average is: " + sum/dailyTemperature.size());
		}
		else {
			int indexDay = daysOfWeek.indexOf(findDay); 
			if(indexDay != -1) {
				int temp = dailyTemperature.get(daysOfWeek.indexOf(findDay));
				System.out.print("The tempature for " + findDay +  " is:  " + temp);
			}else {
				System.out.print("Invalid entry, end of program");
				
			}
		}
	}
}

