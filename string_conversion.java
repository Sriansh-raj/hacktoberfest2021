// Java Program to Convert Array of Strings to A String
// Using toString() method

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
class ABC {

	// Main driver method
	public static void main(String[] args)
	{

		// Random array of string as input
		String abc[] = { "Are", "You", "A", "Programmer" };

		// Creating object of StringBuilder class
		StringBuilder obj = new StringBuilder();

		// Adding above arrays of strings to
		// Stringbuilder object
		obj.append(abc[0]);
		obj.append(" " + abc[1]);
		obj.append(" " + abc[2]);
		obj.append(" " + abc[3]);

		// Note if elements are more then
		// we will be using loops to append(add)

		// Creating a single string
		String str = obj.toString();

		// Print and display the above string
		// containing all strings as a single string
		// using toString() method
		System.out.println(
			"Single string generated using toString() method is --> "
			+ str);
	}
}
