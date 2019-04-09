import java.util.Date;
import java.util.Random;

public class AirportSimulation implements AirportInterface{
		// toString() Def: a string representation of an object.
	
		public AirportSimulation()//for initializing variables.
		{
			Random num =new Random();
			terminal = num.nextInt(4)+1;
			flight= num.nextInt(10000);
			int rand = num.nextInt(10);

			countryNames[temp]=countryNames[rand];
			rand = num.nextInt(4);
			flightStatus[temp]=flightStatus[rand];
			rand = num.nextInt(7);
			gate[temp]=gate[rand];
		}
		public void displayHeading()// for displaying heading.
		{
			System.out.println("Welcome to Frankfurt's airport !");
			Date date = new Date();
			System.out.println(date+"\n");
			System.out.println(heading+"\n");
		}
		
		
		@Override
		public String toString() {
				return flight+"\t\t"+terminal+"  "+"  \t  "+countryNames[temp]+"  \t  "+
		flightStatus[temp] +"\t"+gate[temp]+terminal;
				
		}
		
	
		
		@SuppressWarnings("unused")
		private final String heading = "Flight \t    Terminal \t  Destination \t  Status \tGate";
		
		private static String [] countryNames= {"Rome ","Munich","Dubai","New York","Singapore","Istanbul",
				"Mumbai","London","Paris","Melbourne"};
	
		private static String [] flightStatus= {"Departed","Arrived","Delayed","Boarding"};
		
		private static String[] gate = {"A","B","C","D","E","F","G"};
		
		@SuppressWarnings("unused")
		private int terminal;
		
		@SuppressWarnings("unused")
		private int temp;
		
		@SuppressWarnings("unused")
		private int flight;
		
		
		@SuppressWarnings("static-access")
		public static void main(String args[])
		{
					
			for(int i =0;i<=4;++i)
			{
				@SuppressWarnings("unused")
			    AirportSimulation simulator = new AirportSimulation();
				if(i==0)
				{
					simulator.displayHeading();
				}
				else 
				{
				System.out.println(simulator);

				System.out.println("\n");
				}
			}
		}
}

