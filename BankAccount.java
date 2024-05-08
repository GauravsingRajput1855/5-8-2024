package banking;

import java.time.LocalDate;

import exceptions.BankExceptions;

public class BankAccount {
	private int accNo;
	private String firstname;
	private String lastname;
	private double balance;
	private AcType actype;
	private LocalDate date;
	//------constructors-----------------------------------------
	public BankAccount(int accNo, String firstname, String lastname, double balance, AcType actype,LocalDate date) {
		super();
		this.accNo = accNo;
		this.firstname = firstname;
		this.lastname = lastname;
		this.balance = balance;
		this.actype = actype;
		this.date=date;
		
	}
	//------getter and setters------------------------------------
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AcType getActype() {
		return actype;
	}
	public void setActype(AcType actype) {
		this.actype = actype;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	//----------to string method------------------------------
	
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", firstname=" + firstname + ", lastname=" + lastname + ", balance="
				+ balance + ", actype=" + actype + ", date=" + date + "]";
	}
	
	
	
	//------------equals method----------
	public boolean equals(Object o)
	{
		System.out.println("inside equals");
	if(o instanceof BankAccount)
	{
		return this.accNo==((BankAccount)o).accNo;
	}
	return false;
	}
	//-------------override acctno constructor------
	public BankAccount(int accNo) {
		super();
		this.accNo = accNo;
	}
	//-----------------------
	
	
	public double deposit (double amount)
	{
		this.balance+=amount;
		return balance;
	}
	
	public double widraw(double amount)throws BankExceptions{
		validations.BankValidations.minumBalanceValidate(actype, amount);
		this.balance-=amount;
		return amount;
	}

	
	
	
}
