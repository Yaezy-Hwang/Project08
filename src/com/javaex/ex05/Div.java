package com.javaex.ex05;

public class Div {

    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    	if((a != 0) && (b != 0)) {
    		this.a = a;
    		this.b = b;
    	}
    }

    public int calculate() {
    	return a/b;
    }

}
