package ques3.p2;

import java.util.Scanner;
import ques3.p1.Shape;

public class Rectangle extends Shape{
	public int l;
	public int b;
	public void area ()
	{
		System.out.println("Area : "+l*b+" sq units");
	}
	public void inp (){
		Scanner i = new Scanner(System.in);
		System.out.print("Enter Length : ");
		l = i.nextInt();
		System.out.print("Breadth Length : ");
		b = i.nextInt();
	}
}