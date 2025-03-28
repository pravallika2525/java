package datatype;

import java.util.Scanner;

public class Dyanamicapplication {
public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	int ch;
	do {
		displymenu();
		ch=Integer.parseInt(src.next());
		switch(ch){
		case 1:
			add();
			break;
		case 2:
			sub();
			break;
		case 3:
			mult();
			break;
		case 4:
			div();
			break;
		case 5:
			System.exit(0);
			break;
			default:
				System.out.println("invalid");
				break;
		}
	}
	while(ch>0);
}

private static void div() {
	Scanner src=new Scanner(System.in);
	
	System.out.println("enter a value:");
	int a =src.nextInt();
	
	System.out.println("enter b value:");
	int b=src.nextInt();
	System.out.println(a/b);
	
}
private static void mult() {
	
	Scanner src=new Scanner(System.in);
	
	System.out.println("enter a value:");
	int a =src.nextInt();
	
	System.out.println("enter b value:");
	int b=src.nextInt();
	System.out.println(a*b);
}

private static void sub() {
	Scanner src=new Scanner(System.in);
	
	System.out.println("enter a value:");
	int a =src.nextInt();
	
	System.out.println("enter b value:");
	int b =src.nextInt();
	System.out.println(a-b);
	
}

private static void add() {
	Scanner src=new Scanner(System.in);
	
	System.out.println("enter a value:");
	int a =src.nextInt();
	
	System.out.println("enter b value:");
	int b =src.nextInt();
	System.out.println(a+b);
	
}

private static void displymenu() {
	System.out.println("\t1.add");
	System.out.println("\t2.sub");
	System.out.println("\t3.mult");
	System.out.println("\t4.div");
	System.out.println("\t5.exit");
	
	
}
}
