package pojo;

public class TransactionPojo {
	
	private int fromAccountId;
	private int toAccountId;
	private int transferAmount;
	public int getFromAccountId() {
		return fromAccountId;
		
		
		
	}
	public void setFromAccountId(int fromAccountId) {
		this.fromAccountId = fromAccountId;
	}
	public int getToAccountId() {
		return toAccountId;
	}
	public void setToAccountId(int toAccountId) {
		this.toAccountId = toAccountId;
	}
	public int getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(int transferAmount) {
		this.transferAmount = transferAmount;
	}
	

	
	
	
}