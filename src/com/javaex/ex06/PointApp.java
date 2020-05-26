package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); //false
		System.out.println(p2 == p3); //false
		System.out.println(p3 == p4); //false
		System.out.println(p4 == p1); //true
		System.out.println(p1.equals(p2)); //false true로 변환하기 위해선 메소드 재정의가 필요
		System.out.println(p4.equals(p1)); //false
		
		// == 는 참조값을 비교하는 연산자
		// equals()는 정의된 값을 비교하는 메소드
		
		
	}

}


