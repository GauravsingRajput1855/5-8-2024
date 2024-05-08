package banking;

import java.util.Scanner;
import validations.BankValidations.*;
public class Taster {

	public static void main(String[] args) {
		System.out.println("welcome to cheat fund");
		
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("enter max no of accounts you want to add ");
			BankAccount[] noOfacct=new BankAccount[sc.nextInt()];
			boolean exit=false;
			
			int counter=0;
			while(!exit)
			{
				System.out.println("1- for creating account \n.2for showing accounts \n4-for exit ");
				System.out.println("enter your choice please");
				try {
					switch(sc.nextInt())
					{
					case 1:
						if(counter<noOfacct.length)
						{
							System.out.println("enter the details ");
							System.out.println("acct no , fitst name ,last name ,balance,acctype, date ");
							System.out.println("acctype should be = SAVING ,CURRENT ,FD,LOAN");
							BankAccount acct=validations.BankValidations.validateInputs(sc.nextInt(), sc.next(), sc.next(),sc.nextInt(), 
									sc.next(), sc.next(), noOfacct);
							noOfacct[counter++]=acct;
							System.out.println("your account is crteated sucessfully");
							
						}
						
						break;
					case 2:
						System.out.println("account details are ");
						for(BankAccount b: noOfacct)
							if(b!=null)
							System.out.println(b);
						break;
					case 3:
						break;
					case 4:
						exit=true;
						break;
					}
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
