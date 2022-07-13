package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesClass {

	public static void main(String[] args) 
	{
		/*
		//First way to use the pattern is matchin or not
		System.out.println("Pattern : "+Pattern.matches(".s", "mk")); // . means sigle character
		System.out.println("Pattern : "+Pattern.matches(".s", "as")); 
		System.out.println("Pattern : "+Pattern.matches("s.s", "sos")); // . represent the character
		System.out.println("Pattern : "+Pattern.matches("..s", "aks"));
		System.out.println("Pattern : "+Pattern.matches(".s.", "asa"));*/
		
	/*	Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("sa");
		boolean b = m.matches();
		System.out.println(b); */
	//	System.out.println("Pattern : "+Pattern.matches("[abcd]", "c"));
		
		/*
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
		System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  
		  
		System.out.println("+ quantifier ....");  
		System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
		System.out.println(Pattern.matches("[amn]+", "xyz"));//true (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
		System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
		  
		System.out.println("* quantifier ....");  
		System.out.println(Pattern.matches("[amn]*", "mmmnz"));//true (a or m or n may come zero or more times)*/  
		
		/*
		//Meta characters
		//[0-9]
		System.out.println(Pattern.matches("\\d+", "123"));//false (non-digit)  
		System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
		  
		System.out.println("metacharacters D....");//D means non-digit  
		  
		System.out.println("---->"+Pattern.matches("\\D", "a"));//false (non-digit but comes more than once)  
		System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
		  
		System.out.println("metacharacters D with quantifier....");  
		System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  */
	/*	String s1 = "Welcome to coding world";
		Pattern p = Pattern.compile(s1);
		Matcher m = p.matcher("to");
		System.out.println(m.find());*/
		/*Scanner sc=new Scanner(System.in);  
        while (true) 
        {    
            System.out.println("Enter regex pattern:");  
            Pattern pattern = Pattern.compile(sc.nextLine());    
            System.out.println("Enter text:");  
            Matcher matcher = pattern.matcher(sc.nextLine());    
            boolean found = false;    
            while (matcher.find())
            {    
                System.out.println("I found the text "+matcher.group()+" starting at index "+matcher.start()+" and ending at index "+matcher.end());    
                found = true;    
            }    
            if(!found)
            {    
                System.out.println("No match found.");    
            }
            
        }*/
	    //System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JA2Uk2"));
		//System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
		//System.out.println(Pattern.matches("[789][0-9]{9}", "5653038949"));
		//System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));
	}
}
