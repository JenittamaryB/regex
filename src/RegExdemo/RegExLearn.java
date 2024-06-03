package RegExdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExLearn //to check the pattern matching regular expresion it means email, alphabet, numbers
{
	public static void main(String[] args) {
		RegExLearn r=new RegExLearn ();
		r.findLetter();

	}
public void findLetter()
{
	 //String input = "9943333720";//in this pattern  compile() is static method so we class by class name in next line
	 //Pattern pat = Pattern.compile(" [0-9]");  // "(0|91)?[5-9][0-9]{9}"
	
	String input="rjmuthu@56.com";//we can use letter, number and email
	//Pattern pat = Pattern.compile("[^ab]");  //to print pattern except the ab 
	//Pattern pat=Pattern.compile("[a-z A-Z 0-9]");//this to print alphabet and numbers
	Pattern pat=Pattern.compile("[^a-z A-Z 0-9]");//this to print special character
	
	Matcher mat =pat.matcher(input);// matcher() return pattern class	
	while(mat.find())
	{
		System.out.println(mat.group()+ " is presnt.."+mat.start());
	}
}
}
