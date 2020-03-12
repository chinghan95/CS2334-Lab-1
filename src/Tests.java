/**
 * The main method of this class contains test cases for the Course class. The 
 * tests are similar to the hidden tests used to evaluate your code on zyLabs. 
 * If your code fails the zyLab tests, try writing additional tests here to 
 * find the problem.
 */
import java.util.Arrays;

public class Tests
{
	public static void main(String[] args)
	{
		
		// Construct a Course object with information about our course.
		String information = "CS 2334,Programming Structures and Abstractions,148";
		Course course = new Course(information);
		
		// Test that toString() returns all of the course information
		String info = course.toString();
		if (!info.contentEquals("CODE: CS 2334, NAME: Programming Structures and Abstractions, STUDENTS: 148, SECTIONS: 3"))
		{
			System.out.println("Test failed!");
		}
		else
		{
			System.out.println("Test passed!");
		}
		
		// Test that getCode() returns the correct course name.
		String[] code = course.getCode();
		System.out.println(Arrays.toString(code));
		
		// Test that getName() returns the course name.
		String name = course.getName();
		if (!name.equals("Programming Structures and Abstractions"))
		{
			System.out.println("getName() test failed");
		}
		else
		{
			System.out.println(name);
		}
		
		// Test that getNumStudents() returns the correct number of sections.
		int numStudents = course.getNumStudents();
		if (numStudents != 148)
		{
			System.out.println("getNumStudents() test failed");
		}
		else
		{
			System.out.println(numStudents);
		}
				
		// Test that getNumSections() returns the correct number of sections.
		int numSections = course.getNumSections();
		if (numSections != 3)
		{
			System.out.println("getNumSections() test failed");
		}
		else
		{
			System.out.println(numSections);
		}
	
	}
	
}