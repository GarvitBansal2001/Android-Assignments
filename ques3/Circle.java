package ques3.p3;

import java.util.Scanner;
import ques3.p1.Shape;

public class Circle extends Shape {
	public int r;
	public void area ()
	{
		System.out.println("area of circle = " + (3.14*r*r) + " unit^2");
	}
	public void inp ()
	{
		Scanner i = new Scanner(System.in);
		System.out.print("Enter radius : ");
		r = i.nextInt();
	}
}