package com.onlinecalculator.calculator.calctypes;
import java.util.*;
public class factorial { 
	public static void main(String args[]){
		int i, n, fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("factorial of given number:"+fact);
	}
			

}
