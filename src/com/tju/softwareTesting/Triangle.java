package com.tju.softwareTesting;

public class Triangle {
	
	int judgeTriangle(int a, int b, int c){
		if (! ( (a+b>c) && (b+c>a) && (a+c>b) 
				&& Math.abs(a-b)<c && Math.abs(b-c)<a && Math.abs(c-a)<b ) ){
			System.out.println("This is not a triangle!");
			return -1;
		}
		else if( (a == b) && (b == c)){
			System.out.println("The triangle is equilateral.");
			return 0;
		}
		else if ( (a==b) || (b==c) || (a==c)){
			System.out.println("The triangle is isosceles.");
			return 1;
		}
		else {
			System.out.println("The triangle is scalene.");
			return 2;
		}
	}
	
	public static void main(String[] args){
		Triangle t = new Triangle();
		t.judgeTriangle(3, 4, 8);
		t.judgeTriangle(3, 4, 5);
		t.judgeTriangle(2, 2, 2);
		t.judgeTriangle(3, 3, 5);
	}
}
