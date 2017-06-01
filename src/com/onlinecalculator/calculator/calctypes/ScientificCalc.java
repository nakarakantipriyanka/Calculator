package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

import java.lang.Math;
import java.lang.Character;
public class ScientificCalc extends BasicCalc{
	public int menu(){
		System.out.println("select option");	
		
		 System.out.println("1.additoin");
		 System.out.println("2.subtraction ");
		 System.out.println( "3.multyplication");
		 System.out.println("4.division ");
		 System.out.println("5.powerof");
		 System.out.println("6.squarerootof");
		 System.out.println("7.signof");
		 System.out.println("**************");
		 System.out.println("enter your choice");
		 Scanner s=new Scanner(System.in);
		 ch=s.nextInt();
		 return ch;
		     
	}

  public void userInputs()
  {
		     Scanner s=new Scanner(System.in);
		     System.out.println("enter the 1st number ");
		     a=s.nextInt();
		     if(ch!=6&&ch!=7)
		     {
		     System.out.println("enter the 2nd number ");
		     b=s.nextInt();
		     }
		    	
  }

  public void performOperation(){
  		switch(ch)
  	    {
  		case 1:
  		
  		case 2:
  			
  		case 3:
  			
  		case 4:
  			
  		super.performOperation();
  		break;
  	    case 5:System.out.println(pwrof());
  	    break;
  	    case 6: System.out.println(sqrtof());
  	    break;
  	    case 7: System.out.println(sineof());
  	    break;
  	    default:System.out.println("wrong choice");
  	    break;
  	    }
  	    System.out.println("\n.............\n");
  	   
  		}
  
  
	double pwrof()
	{
		System.out.println("pwrof");
		return(Math.pow(a, b));
	}
	
	double sqrtof()
	{
	return(Math.sqrt(a));	
	}

	double sineof()
	{
	double rad=Math.toRadians(a);
	return(Math.sin(rad));
	}
	
}

