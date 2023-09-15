package controlstatement;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
System.out.println("Enter a grade:");
int x = 30;
int y = 10;
int n = scan.nextInt();
System.out.println(n);

if(n >= 90 && n <= 100) { // if statement
	System.out.println("A");
	} else if(n >= 80 && n < 90) { // elseif statement
		System.out.println("B");
	} else if(n >= 70 && n < 80) {
		System.out.println("C");
	} else if(n >= 65 && n < 70) {
		System.out.println("D");
	} else if(n >= 0 && n < 65) {
		System.out.println("F");
	}else { // else statement
		System.out.println("the number entered is not in range");
	}  if(true) { // if else if statement
		System.out.println("A");
		
	}if( x == 30 ) { // nested if statement
		if(y == 10) {
			System.out.println("x = 30 and y = 10");
}}}}
