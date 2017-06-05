import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dbApp {
public static void main(String[] args) {
	ArrayList<Book> ar = new ArrayList<Book>();

	Book a = new Book("Java1001","Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50);	
	Book b = new Book("Java1002","Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00);
	Book c = new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 45.00);
	Book d = new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50);
	Collections.addAll(ar,a,b,c,d);
	/*
	ar.add(a);
	ar.add(b);
	ar.add(c);
	ar.add(d);
	*/
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the book code: ");
	String input = sc.nextLine();
	for (int i=0; i<ar.size(); i++)
	{
		if(input.equals(ar.get(i).getSku()))
		{
			ar.get(i).isAvail(ar.get(i).getSku());
		}
	}
}
}
