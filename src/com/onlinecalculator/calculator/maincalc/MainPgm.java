package com.onlinecalculator.calculator.maincalc;
import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.BasicCalc;
import com.onlinecalculator.calculator.calctypes.ScientificCalc;
import com.onlinecalculator.calculator.calctypes.StatisticCalc;

public class MainPgm {
public static void main(String args[]){
       int type;
       type=disp();
       if(type==1)
       {
        	BasicCalc Calc=new BasicCalc();
        	Calc.menu();
        	Calc.userInputs();
        	Calc.performOperation();
        	
        }
        if(type==2)
        {
        	
        	  ScientificCalc scalc=new ScientificCalc();
              scalc.menu();
              scalc.userInputs();
              scalc.performOperation();
   		}
        	
        	if(type==3)
        	{
        		 StatisticCalc scalc=new StatisticCalc();
                 scalc.menu();
                 scalc.userInputs();
                 scalc.performOperation();
      		}
        		
        	}
        
    static int disp(){
    	int ch;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("********Calculator program****");
    	
    	System.out.println("***********enter 1 -BasicCalc********");
    	System.out.println("*********enter 2 -ScientificCalc*********");
    	System.out.println("********enter 3 -StatisticCalc****");
    	System.out.println("********enter  your choice****");
    	ch=sc.nextInt();
    	return(ch);
    
    	
    	
    }
}