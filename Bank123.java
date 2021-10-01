 import java.util.*;
public class BankApp
{
	String name,address;
	int accno,contactno;
	double bal,rate;
	public static void main(String[] args)
	{
		int ch,flag=0;
		Scanner sc=new Scanner(System.in);
		BankApp bank=new BankApp();			
		do{
			System.out.println("*WELCOME TO THE BANKING APPLICATION*");
			System.out.println("----------:MENU:------------");
			System.out.println("ENTER 1 TO CREATE NEW ACCOUNT");
			System.out.println("ENTER 2 TO DEPOSIT MONEY");
			System.out.println("ENTER 3 TO WITHDRAW MONEY");
			System.out.println("ENTER 4 TO COMPUTE INTEREST");
			System.out.println("ENTER 5 TO DISPLAY BALANCE");
			System.out.println("ENETR 6 TO CLOSE THE APP");
			ch=sc.nextInt();
			if(ch==1)
			{   
				bank.createAccount();
				flag=1;   
				do
				{
					System.out.println("----------:MENU:------------");
					//System.out.println("ENTER 1 TO CREATE NEW ACCOUNT");
					System.out.println("ENTER 1 TO DEPOSIT MONEY");
					System.out.println("ENTER 2 TO WITHDRAW MONEY");
					System.out.println("ENTER 3 TO COMPUTE INTEREST");
					System.out.println("ENTER 4 TO DISPLAY BALANCE");
					System.out.println("ENETR 5 TO CLOSE THE APP");
					ch=sc.nextInt();
					switch(ch)
						{
						case 1 : bank.deposit();
								break;
						case 2 : bank.withdraw();
								break;
						case 3 : bank.computeInterest();
								break;
						case 4 : bank.displayBalance();
								break;
						case 5 : break;
						default:System.out.println("INVALID CHOICE!");
						}
				}while(ch!=5);
			}
			else if(ch<6)
			{
				System.out.println("FIRST CREATE ACCOUNT!");
			}
			else if(ch==6)
			{
				break;
			}
			else
			{
					System.out.println("Invalid Choice ");
			}
		}while(flag==0);
	}
	public void createAccount()
	{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE CUSTOMER NAME: ");
			name=sc.nextLine();
			System.out.println("ENTER THE CUSTOMER ADDRESS: ");
			address=sc.nextLine();
			System.out.println("ENTER THE ACCOUNT NUMBER: ");
			accno=sc.nextInt();
			System.out.println("ENTER THE INITIAL BALANCE: ");
			bal=sc.nextDouble();
			System.out.println("ENTER THE RATE OF INTEREST: ");
			rate=sc.nextDouble();
			System.out.println("ENTER THE CONTACT NUMBER: ");
			contactno=sc.nextInt();
			System.out.println("ACCOUNT CREATED SUCCESSFULLY!");
			}
public void deposit()
			{
				double dep;
				Scanner sc=new Scanner(System.in);
				System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT: ");
				dep=sc.nextDouble();
				bal=bal+dep;
				System.out.println("SUCCESSFULLY DEPOSITED THE MONEY!");
				System.out.println("YOUR CURRENT ACCOUNT BALANCE IS "+bal);
			}
public void withdraw()
			{
				double wd;
				Scanner sc=new Scanner(System.in);
				System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW: ");
				wd=sc.nextDouble();
				if(wd>bal)
				{
					System.out.println("Insufficient balance!!");
				}
				else
				{
					bal=bal-wd;
					System.out.println("SUCCESSFULLY WITHDRAWN THE MONEY!");
					System.out.println("YOUR CURRENT ACCOUNT BALANCE IS "+bal);
				}
			}
public void computeInterest()
			{
				int t;
				double interest;
				Scanner sc=new Scanner(System.in);
				System.out.println("ENTER THE TIME SPAN IN YEARS: ");
				t=sc.nextInt();
				interest=bal*(rate/100)*t;
				System.out.println("INTEREST WILL BE "+interest+" ON YOUR CURRENT BALANCE OF RS. "+bal+" IN "+t+" YEARS ");
			}
public void displayBalance()
			{
				System.out.println("YOUR CURRENT ACCOUNT BALANCE IS "+bal);
			}	
}




//output of the program
Microsoft Windows [Version 10.0.10240]
(c) 2015 Microsoft Corporation. All rights reserved.

C:\Users\rajth>D:

D:\>cd Java

D:\Java>javac BankApp.java

D:\Java>java BankApp.java
*WELCOME TO THE BANKING APPLICATION*
----------:MENU:------------
ENTER 1 TO CREATE NEW ACCOUNT
ENTER 2 TO DEPOSIT MONEY
ENTER 3 TO WITHDRAW MONEY
ENTER 4 TO COMPUTE INTEREST
ENTER 5 TO DISPLAY BALANCE
ENETR 6 TO CLOSE THE APP
1
ENTER THE CUSTOMER NAME:
Thali Raj Ashok
ENTER THE CUSTOMER ADDRESS:
Nagoan
ENTER THE ACCOUNT NUMBER:
1234567
ENTER THE INITIAL BALANCE:
3000
ENTER THE RATE OF INTEREST:
60
ENTER THE CONTACT NUMBER:
1234567890
ACCOUNT CREATED SUCCESSFULLY!
----------:MENU:------------
ENTER 1 TO DEPOSIT MONEY
ENTER 2 TO WITHDRAW MONEY
ENTER 3 TO COMPUTE INTEREST
ENTER 4 TO DISPLAY BALANCE
ENETR 5 TO CLOSE THE APP
2
ENTER THE AMOUNT YOU WANT TO WITHDRAW:
2000
SUCCESSFULLY WITHDRAWN THE MONEY!
YOUR CURRENT ACCOUNT BALANCE IS 1000.0
----------:MENU:------------
ENTER 1 TO DEPOSIT MONEY
ENTER 2 TO WITHDRAW MONEY
ENTER 3 TO COMPUTE INTEREST
ENTER 4 TO DISPLAY BALANCE
ENETR 5 TO CLOSE THE APP
3
ENTER THE TIME SPAN IN YEARS:
2
INTEREST WILL BE 1200.0 ON YOUR CURRENT BALANCE OF RS. 1000.0 IN 2 YEARS
----------:MENU:------------
ENTER 1 TO DEPOSIT MONEY
ENTER 2 TO WITHDRAW MONEY
ENTER 3 TO COMPUTE INTEREST
ENTER 4 TO DISPLAY BALANCE
ENETR 5 TO CLOSE THE APP
4
YOUR CURRENT ACCOUNT BALANCE IS 1000.0
----------:MENU:------------
ENTER 1 TO DEPOSIT MONEY
ENTER 2 TO WITHDRAW MONEY
ENTER 3 TO COMPUTE INTEREST
ENTER 4 TO DISPLAY BALANCE
ENETR 5 TO CLOSE THE APP
5

D:\Java>