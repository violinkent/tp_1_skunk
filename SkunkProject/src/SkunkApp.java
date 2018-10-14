import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp implements Reporter
{

	public static void main(String[] args)
	{
		StdOut.println("Welcome to 635 Skunk project! let's play!");
		
		StdOut.println("Play one Turn for player1");
		
		String player = "player1";
		
		Turn turn = new Turn(); 
		while(true) {
			StdOut.println("Your current turn score is " + turn.getTurnScore());
			StdOut.println("Do you wanna roll? y or n (ENTER=>y)");
			String response=StdIn.readLine();
		
			if (!response.equals("n")) {
				turn.rollAgain();
				turn.scoreTurn();			
				StdOut.println("You rolled a "+turn.getLastRoll().getDice().getDie1().getLastRoll() + "and a " +
						turn.getLastRoll().getDice().getDie2().getLastRoll());
				
				if (turn.ends()) {
					StdOut.println("Your turn is over :( ");
					break;
				}
			}	
			else {
				StdOut.println("You declined a roll.");
				break;
			}
		}
		int turnScore=turn.getTurnScore();
		StdOut.println("You scored: "+turnScore+" for this turn.");
	}
	
	@Override
		public void showMessage(String msg) 
		{
			StdOut.println(msg);
		}
		
	

}
