import java.time.Instant;

public class TestGit {
	public static void main(String args[]) {
		System.out.println("Hello Git! The name of the license project is [not chosen] ");
		
		Budget budget = new Budget("Savings", java.util.Date.from( Instant.now() ), 100);
		
		System.out.println("Budget " + budget.getType() + " - updated " + budget.getTransactionDate() + " value : " + budget.getValue());
		
		budget.addTransaction(java.util.Date.from( Instant.now() ), 50f);
		
		System.out.println("Budget " + budget.getType() + " - updated " + budget.getTransactionDate() + " value : " + budget.getValue());
	}
}
