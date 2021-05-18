package day4;

import java.util.Scanner;

public class FoodBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
            String Item1Key = " CocaCola ";
            System.out.println(" Enter Item1 Price ");
    		String Item1Value = scanner.nextLine();
    		
    		String Item2Key = " Sandwitch ";
            System.out.println(" Enter Item2 Price ");
    		String Item2Value = scanner.nextLine();
    		
    		String Item3Key = " Veg Pizza ";
            System.out.println(" Enter Item3 Price ");
    		String Item3Value = scanner.nextLine();
    		
    		String TotalKey = " Total ";
    		double addition(double Item1Value, double Item2Value, double Item3Value){
    			String TotalValue = (" Item1Value " + " Item2Value " + " Item3Value ");
    			return TotalValue;
    		}
    		String TotalValue = scanner.nextLine();
    		
    		String formattedItem1Key = String.format("|%-25s|", Item1Key);
    		String formattedItem1Val = String.format("%-25s|", Item1Value);
    		String formattedItem2Key = String.format("|%-25s|", Item2Key);
    		String formattedItem2Val = String.format("%-25s|", Item2Value);
    		String formattedItem3Key = String.format("|%-25s|", Item3Key);
    		String formattedItem3Val = String.format("%-25s|", Item3Value);
    		String formattedTotalKey = String.format("|%-25s|", TotalKey);
    		String formattedTotalVal = String.format("%-25s|", TotalValue);
    		
    		
    		
    		String dash = "-------------------------|------------------------";
    		
    		
    		System.out.println(String.format("|%-51s|", dash));
    		System.out.println(formattedItem1Key + formattedItem1Val);
    		System.out.println(String.format("|%-51s|", dash));
    		System.out.println(formattedItem2Key + formattedItem2Val);
    		System.out.println(String.format("|%-51s|", dash));
    		System.out.println(formattedItem3Key + formattedItem3Val);
    		System.out.println(String.format("|%-51s|", dash));
    		System.out.println(formattedTotalKey + formattedTotalVal);
    		System.out.println(String.format("|%-51s|", dash));
    		
    		
    		scanner.close();
	}
}
    		
    		
    		
    		
    		