package datatype;

import java.util.Scanner;

public class Payment {
	
public static void main(String[] args) {
	Scanner src= new Scanner(System.in);
	int pay;
	do {
		display();
		pay=Integer.parseInt(src.next());
		
		switch(pay) {
		case 1:
			phonepay();
			break;
		case 2:
			GPay();
			break;
		case 3:
			Paytm();
			break;
		case 4:
			NetBanking();
			break;
		case 5:
			Help();
			break;
			default:
				System.out.println("Thank You");
		}
	}
	while(pay>0);
}

private static void NetBanking() {
	Scanner src=new Scanner(System.in);
	int bk;
	do {
		net();
		bk=Integer.parseInt(src.next());
		switch(bk) {
		case 1:
			SBI();
			break;
		case 2:
			Axis();
			break;
		case 3:
			HDFC();
			break;
			default:
				System.out.println("Exit");
		}
	}
	while(bk>0);
}

private static void HDFC() {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter Account number:");
	int ac=src.nextInt();
	System.out.println(" Enter ifsc Code:");
	String ifsc=src.next();
	
	System.out.println("Enter payment Amount:");
	int amount=src.nextInt();
	if(ifsc=="123@abc") {
		System.out.println("Payment Successfull !");
	}
	else {
		System.out.println("Failed");
	}
	
}

private static void Axis() {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter Account number:");
	int ac=src.nextInt();
	System.out.println(" Enter ifsc Code:");
	String ifsc=src.next();
	System.out.println("Enter payment Amount:");
	int amount=src.nextInt();
	if(ifsc=="123@abc") {
		System.out.println("Payment Successfull !");
	}
	else {
		System.out.println("Failed");
	}
}

private static void SBI() {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter Account number:");
	int ac=src.nextInt();
	System.out.println(" Enter ifsc Code:");
	String ifsc=src.next();
	System.out.println("Enter payment Amount:");
	int amount=src.nextInt();
	if(ifsc=="123@abc") {
		System.out.println("Payment Successfull !");
	}
	else {
		System.out.println("Failed");
	}
}

private static void net() {
	System.out.println("Select Your Bank:");
	System.out.println("\t1.SBI");
	System.out.println("\t2.Axis");
	System.out.println("\t3.HDFC");
	
}

private static void Help() {
	Scanner src=new Scanner(System.in);
	System.out.println("If You have any problem,Dial to +9988776655");
	System.out.println("Thank You !");
	
	
}

private static  void Paytm() {
	Scanner src=new Scanner(System.in);
	System.out.println(" Bank Balance:");
	int balance=src.nextInt();
		System.out.println("Enter Payment amount:");
		int amount=src.nextInt();
	System.out.println("Enter upi id:");
	String upi=src.next();
	System.out.println("Enter pinno:");
	int pinno=src.nextInt();
	if(pinno==12345) {
		if(balance>=amount && amount>200) {
			System.out.println("Payment Successfull !");
			
		}
		else {
			System.out.println("Insuffient Balance");
		}
	}
	else {
		System.out.println("Incorrect pinno");
	}
}
	


private static void GPay() {
	Scanner src=new Scanner(System.in);
	System.out.println(" Bank Balance:");
	int balance=src.nextInt();
		System.out.println("Enter Payment amount:");
		int amount=src.nextInt();
	System.out.println("Enter upi id:");
	String upi=src.next();
	System.out.println("Enter pinno:");
	int pinno=src.nextInt();
	if(pinno==12345) {
		if(balance>=amount && amount>200) {
			System.out.println("Payment Successfull !");
			
		}
		else {
			System.out.println("Insuffient Balance");
		}
	}
	else {
		System.out.println("Incorrect pinno");
	}
}
	


private static void phonepay() {
	Scanner src=new Scanner(System.in);
	System.out.println(" Bank Balance:");
	int balance=src.nextInt();
		System.out.println("Enter Payment amount:");
		int amount=src.nextInt();
	System.out.println("Enter upi id:");
	String upi=src.next();
	System.out.println("Enter pinno:");
	int pinno=src.nextInt();
	if(pinno==12345) {
		if(balance>=amount && amount>200) {
			System.out.println("Payment Successfull !");
			
		}
		else {
			System.out.println("Insuffient Balance");
		}
	}
	else {
		System.out.println("Incorrect pinno");
	}
}

private static void display() {
	System.out.println("Select Payment Method:");
	System.out.println("\t1.Phonepay");
	System.out.println("\t2.Gpay");
	System.out.println("\t3.Paytm");
	System.out.println("\t4.Netbanking");
	System.out.println("\t5.Help");
	
}
}
