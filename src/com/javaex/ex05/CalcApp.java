package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print(">> ");
    		String num = sc.nextLine();
    		String[] strArray = num.split(" ");
    		
    		if(strArray[0].equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}
    		
    		int numA = Integer.parseInt(strArray[0]);
    		int numB = Integer.parseInt(strArray[2]);
    		
    		
    		switch(strArray[1]) {
    		case "+":
    			Add add = new Add();
    			add.setValue(numA, numB);
    			System.out.println(">> "+add.calculate());
    			break;
    			
    		case "-":
    			Sub sub = new Sub();
    			sub.setValue(numA, numB);
    			System.out.println(">> "+sub.calculate());
    			break;
    			
    		case "*":
    			Mul mul = new Mul();
    			mul.setValue(numA, numB);
    			System.out.println(">> "+mul.calculate());
    			break;
    		
    		case "/":
    			Div div = new Div();
    			div.setValue(numA, numB);
    			System.out.println(">> "+div.calculate());
    			break;
    			
    		default:
    			System.out.println("알 수 없는 연산입니다");
    			break;
    		
    		} //switch
    	} //while
    	
    	
    	sc.close();
    }
}
