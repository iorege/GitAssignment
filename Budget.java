import java.util.Date;

public class Budget {
	private String type;
	private Date transactionDate;
	private Integer value;
		
	public Budget(String type, Date transactionDate, Integer value) {
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
	
	public Integer getValue() {
		return value;
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}
}
