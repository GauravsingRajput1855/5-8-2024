package validations;
import banking.*;
import java.time.LocalDate;

import banking.AcType;
import exceptions.BankExceptions;

public class BankValidations {
	
	//----------parsing date------------------------
	
	public static LocalDate parsdateValidate(String date) {
		return LocalDate.parse(date);
	}
	
	//-----------parse validateactype-------------
	
	public static AcType parsevalidateAcType(String type)
	{
		return AcType.valueOf(type.toUpperCase());
	}
	
	//-----------checking for duplicates---------------------

	 
	public static void checkForDups(int acctno,BankAccount[] accts)throws BankExceptions{
		BankAccount accts1=new BankAccount(acctno);
		for(BankAccount a: accts)
		{
			if(a!=null&& a.equals(accts));
			else
			throw new BankExceptions("duplicate account");
		}
	}
	
	
	//------------minimum balance ---------------------------------
	
	public static void minumBalanceValidate(AcType type,double balance) throws BankExceptions
	{
		if(balance<type.getMinBalance())
			throw new BankExceptions("balance is below than minimum balance");
		System.out.println("valid balance");
			
	}
	
	
	//-----------validate inputs -------------------------------------
	
	
	public static BankAccount validateInputs(int accNo, String firstname, String lastname, double balance, String actype,String date,
			BankAccount[]accounts)throws BankExceptions 
	{
		
		//checkForDups(accNo, accounts);
		AcType type=parsevalidateAcType(actype);
		LocalDate Birthdate=parsdateValidate(date);
		minumBalanceValidate(type, balance);
		
		return new BankAccount(accNo, firstname, lastname, balance, type, Birthdate);
		
	}

}
