import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreciseTimeTests {
	
	//test add method
	public static void testAdd(String a, String b){ 
		System.out.println("\n -------------------------- Test add method --------------------------");
		PreciseTime c = new PreciseTime();
		c = c.add(new PreciseTime(a), new PreciseTime(b));
		System.out.println(c.toString()); 
	}
	
	//test addTo method
	public static void testAddTo(String a, String b){
		System.out.println("\n -------------------------- Test addTo method --------------------------");
		System.out.println(PreciseTime.addTo(new PreciseTime(a), new PreciseTime(b)).toString()); 
	}
	
	//test subtract method
	public static void testSubtract(String a, String b){
		System.out.println("\n -------------------------- Test subtract method --------------------------");
		
		PreciseTime c = new PreciseTime();
		c = c.subtract(new PreciseTime(a), new PreciseTime(b)); 
		System.out.println(c.toString()); 
	}
	
	//test subtractTo method 
	public static void testSubtractTo(String a, String b){
		System.out.println("\n -------------------------- Test subtractTo method --------------------------");
		System.out.println(PreciseTime.subtractTo(new PreciseTime(a), new PreciseTime(b)).toString()); 
	}
	
	//validate time format using regex 
	public static boolean isValidPreciseTime(String time){
		
		//Regex to check valid time in 12-hour format.
        String regexPattern
            = "(1[012]|[1-9]):"
              //+ "[0-5][0-9](\\s)" + ":"
              + "[0-5][0-9]:"
              + "[0-5][0-9](\\s)"
              + "?(?i)(am|pm)";
 
        // Compile the ReGex
        Pattern compiledPattern
            = Pattern.compile(regexPattern);
 
        // If the time is empty
        // return false
        if (time == null) {
            return false;
        }
 
        // Pattern class contains matcher() method
        // to find matching between given time
        // and regular expression.
        Matcher m = compiledPattern.matcher(time.trim());
 
        // Return if the time
        // matched the ReGex
        return m.matches();
	}

	//get input values from console 
	public static String getTime(String title, Scanner myObj){		
		System.out.println(title); 
	
	    String s;
	    s = myObj.nextLine(); 
	    
	    while(!isValidPreciseTime(s)){
	    	 System.out.println("\nInvalid time format. Please enter again : ");  
	    	 s = myObj.nextLine(); 
	    } 
	    
	    if(s.trim().length() == 9){
	    	return "0" + s;
	    }
	     
	    return s;
	}
		
	//test PreciseTime class 
	public static void testPreciseTime(){
		String s1, s2;
		s1 = getTime("Enter the first PreciseTime : ", new Scanner(System.in)); 
		s2 = getTime("Enter the second PreciseTime: ", new Scanner(System.in));
		
		PreciseTime b1 = new PreciseTime(s1); 
		PreciseTime b2 = new PreciseTime(s2); 
		
		System.out.println("\n -------------------------- Precise Time Test Operations Starts --------------------------");
		System.out.println("\nFirst PreciseTime: "  + b1.toString() + "\t || \t" + "Second PreciseTime: " + b2.toString());
	  
		testAdd(s1, s2);
		testAddTo(s1, s2);
		
		testSubtract(s1, s2); 
		testSubtractTo(s1, s2);
		
		System.out.println("\n -------------------------- Precise Time Test Operations Ends --------------------------");
	}

}
