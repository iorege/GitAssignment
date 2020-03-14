import java.time.Instant;
import java.util.Date;

public class Budget implements Transaction {
	private String type;
	private Date transactionDate;
	private Float value;
		
	public Budget(String type, Date transactionDate, float value) {
		this.type = type;
		this.transactionDate = transactionDate;
		this.value = value;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Date getTransactionDate() {
		return transactionDate;
	}
	
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public Float getValue() {
		return value;
	}
	
	public void setValue(float f) {
		this.value = f;
	}


	@Override
	public void addTransaction(Date date, Float value) {
		setTransactionDate(date);
		setValue(getValue() + value);
	}
	
}
