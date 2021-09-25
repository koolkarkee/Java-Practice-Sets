import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BasicTimeTests {

	//test add method
	public static void testAdd(String a, String b){ 
		System.out.println("\n -------------------------- Test add method --------------------------");
		BasicTime c = new BasicTime();
		c = c.add(new BasicTime(a), new BasicTime(b));
		System.out.println(c.toString()); 
	}
	
	//test addTo method
	public static void testAddTo(String a, String b){
		System.out.println("\n -------------------------- Test addTo method --------------------------");
		System.out.println(BasicTime.addTo(new BasicTime(a), new BasicTime(b)).toString()); 
	}
	
	//test subtract method
	public static void testSubtract(String a, String b){
		System.out.println("\n -------------------------- Test subtract method --------------------------");
		
		BasicTime c = new BasicTime();
		c = c.subtract(new BasicTime(a), new BasicTime(b)); 
		System.out.println(c.toString()); 
	}
	
	//test subtractTo method 
	public static void testSubtractTo(String a, String b){
		System.out.println("\n -------------------------- Test subtractTo method --------------------------");
		System.out.println(BasicTime.subtractTo(new BasicTime(a), new BasicTime(b)).toString()); 
	}
	
	//validate time format using regex 
	public static boolean isValidBasicTime(String time){
		
		//Regex to check valid time in 12-hour format.
        String regexPattern
            = "(1[012]|[1-9]):"
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
	    
	    while(!isValidBasicTime(s)){
	    	 System.out.println("\nInvalid time format. Please enter again : ");  
	    	 s = myObj.nextLine(); 
	    } 
	     
	    return s;
	}

	//test BasicTime class 
	public static void testBasicTime(){
		String s1, s2;		
		s1 = getTime("Enter the first BasicTime : ", new Scanner(System.in)); 
		s2 = getTime("Enter the second BasicTime : ", new Scanner(System.in));
		
		BasicTime b1 = new BasicTime(s1); 
		BasicTime b2 = new BasicTime(s2); 
		
		System.out.println("\n -------------------------- Basic Time Test Operations Starts --------------------------");
		System.out.println("\nFirst BasicTime: "  + b1.toString() + "\t || \t" + "Second BasicTime: " + b2.toString());
	  
		testAdd(s1, s2);
		testAddTo(s1, s2);
		
		testSubtract(s1, s2); 
		testSubtractTo(s1, s2);
		
		System.out.println("\n -------------------------- Basic Time Test Operations Ends --------------------------");
	}
	
}
