package Quiz1;
import java.util.Scanner; 
public class QBR {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Value for Completions:");
		double Completions = input.nextDouble();
		
		System.out.print("Enter Value for Attempts:");
		double Attempts = input.nextDouble();
		
		System.out.print("Enter Value for Yards:");
		double Yards = input.nextDouble();
		
		System.out.print("Enter Value for Touchdowns:");
		double Touchdowns = input.nextDouble();
		
		System.out.print("Enter Value for Interceptions:");
		double Interceptions = input.nextDouble();
		
		
		double a= (((Completions/Attempts)-.3)*5);
		double b= (((Yards/Attempts)-3)*.25);
		double c= ((Touchdowns/Attempts)*20);
		double d= (2.375-((Interceptions / Attempts)*25));
		
		double PasserRating= (((a+b+c+d)/6)*100);
		
		System.out.print("The Quarterback Rating is:" + PasserRating);
		
				
				
		
	}

}
