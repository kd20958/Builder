import java.util.Scanner;
public class Builder {
	
	public static void main(String[] args) { 
		System.out.println("Enter String -Java Is Fun!-"); //prompts user to enter
		Scanner keyboard = new Scanner(System.in); 
		String input = keyboard.nextLine(); // allows input 
		StringBuilder builder = new StringBuilder(input); //sets string builder
		
		builder.append("I Love It!"); //prints second string
		builder.insert(input.length(), " Yes, "); // insert "yes:
		System.out.println("Length of first string: " + input.length()); //prints input length
		System.out.println("Builder capacity: " + builder.capacity()); //prints builder capacity
		System.out.println(builder); //prints builder
		
	}

}