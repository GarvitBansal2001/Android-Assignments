package ques3.p4;

import ques3.p2.Rectangle;
import ques3.p3.Circle;
import java.util.Scanner;

public class main {
	static void menu ()
	{
		System.out.println("Main menu");
		System.out.println("Press 1 : for rectangle");
		System.out.println("Press 2 : for Circle");
		System.out.println("Press 3 : to exit");
		System.out.print("Enter your choice : ");
	}
	public static void main (String [] args)
	{
		char ch;
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Scanner i = new Scanner(System.in);
		do
		{
			menu();
			ch = i.next().charAt(0);
			switch(ch)
			{
				case'1':r.inp();
						r.area();
						break;
				case'2':c.inp();
						c.area();
						break;
				case'3':System.out.print("good bye!!");
						break;
				default:System.out.println("invalid choice!!");
			}
		}
		while(ch != '3');
	}
}