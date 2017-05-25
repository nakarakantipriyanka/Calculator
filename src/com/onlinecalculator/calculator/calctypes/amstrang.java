package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class amstrang {
	public static void main(String args[]){
		int temp,n,x,sum=0;
		System.out.println("enter the num");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0){
			x=n%10;
			n=n/10;
			sum=sum+(x*x*x);
			
		}
		if(temp==sum)
			System.out.println("this is amstrong num");	
		else
			System.out.println("this is not amstrong num");
		
		
	}

}
