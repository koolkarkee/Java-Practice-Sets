
public class TestInteger {

	//Test isEven 
	public static void testEven(MyInteger m){
		System.out.println(m.getValue() + " is Even is \t\t" + m.isEven());
	}
	
	//Test isOdd
	public static void testOdd(MyInteger m){
		System.out.println(m.getValue() + " is Odd is \t\t" + m.isOdd());
	}
	
	//Test isPrime
	public static void testPrime(MyInteger m){
		System.out.println(m.getValue() + " is Prime is \t\t" + m.isPrime());
	}
	
	//Test isEven static method 
	public static void testEvenStatic(){
		int num = 28;
		
		//test isEvenStatic
		System.out.println(num + " is Even is \t\t" + MyInteger.isEven(num));
	}
	
	//Test isEven static method 
	public static void testOddStatic(){
		int num = 28;
		
		//test isOddStatic
		System.out.println(num + " is Odd is \t\t" + MyInteger.isOdd(num));
	}
	
	//Test isPrime static method 
	public static void testPrimeStatic(){
		int num = 28;
		
		//test isPrimeStatic
		System.out.println(num + " is Prime is \t\t" + MyInteger.isPrime(num));
		
		//change the value of num to 29
		num = 29;
		System.out.println(num + " is Prime is \t\t" + MyInteger.isPrime(num));
	}
	
	//test all non-static methods
	public static void testNonStaticMethods(MyInteger m){
		System.out.println("");
		System.out.println("------------- Testing begins for non-static methods -----------------");
		
		//Test even
		testEven(m);
		
		//Test odd
		testOdd(m);
		
		//Test prime
		testPrime(m); 
		
		System.out.println("------------- Testing ends for non-static methods -----------------");
		System.out.println("");
	}
	
	//test all static methods 
	public static void testStaticMethods(){
		System.out.println("------------- Testing begins for static methods -----------------");
		
		//test even static
		testEvenStatic();
		
		//test odd
		testOddStatic();
		
		//test prime
		testPrimeStatic();
		
		System.out.println("------------- Testing ends for static methods -----------------");
		System.out.println("");
	}
	
	//test isEven with object param 
	public static void testEvenWithObject(MyInteger m){ 
		System.out.println(m.getValue() + " is Even is \t\t" + MyInteger.isEven(m));
	}
	
	//test isEven with object param 
	public static void testOddWithObject(MyInteger m){ 
		System.out.println(m.getValue() + " is Odd is \t\t" + MyInteger.isOdd(m));
	}
	
	//test isEven with object param 
	public static void testPrimeWithObject(MyInteger m){ 
		System.out.println(m.getValue() + " is Prime is \t\t" + MyInteger.isPrime(m));
	}
	
	//test static methods with object parameter 
	public static void testStaticMethodsWithObject(MyInteger m){
		System.out.println("------------- Testing begins for static methods with object param -----------------");
		
		//test even 
		testEvenWithObject(m); 
		
		//test odd
		testOddWithObject(m);
		
		//test prime
		testPrimeWithObject(m);
		
		System.out.println("------------- Testing ends for static methods with object param -----------------");
		System.out.println("");
	}
	
	//test equals 
	public static void testEquals(){
		System.out.println("------------- Testing begins for equals method -----------------");
		MyInteger m = new MyInteger(147); 
		
		//test equals 
		int num = 47;
		System.out.println(m.getValue() + " is Equal to " + num + " is \t\t" + m.equals(num));
		
		//change the value of num
		num = 147;
		System.out.println(m.getValue() + " is Equal to " + num + " is \t\t" + m.equals(num));
		
		//test equals in method with object parameter 
		MyInteger i = new MyInteger(157); 
		System.out.println(i.getValue() + " is Equal to " + num + " is \t\t" + m.equals(i));
		
		System.out.println("------------- Testing ends for equals method -----------------");
		System.out.println("");
	}
	
	public static void testParseInt(){
		System.out.println("------------- Testing begins for parseInt method for char array -----------------");
		 
		char[] arr = {'1', '2', '3', '4'}; 
		System.out.println("Printing our char arr : ");
		for (char c:arr) {
			System.out.println(c);
		}
		
		int result = 1234; 
		System.out.println("Value of expected result is " + result + " is \t\t");
		
		int num = MyInteger.parseInt(arr);
		System.out.println("Value of num after calling parseInt method is " + num + " \t\t");
		
		boolean compare = (result == num) ? true : false;  
		System.out.println("Result is equal to num after comparison is " + compare);
		
		 
		System.out.println("------------- Testing ends for parseInt method char array -----------------");
		System.out.println("");
	}
	
	public static void testParseIntForString(){
		System.out.println("------------- Testing begins for parseInt method for String -----------------");
		 
		String s = new String("12345"); 
		 
		int result = 12345; 
		System.out.println("Value of expected result is " + result + " is \t\t");
		
		int num = MyInteger.parseInt(s);
		System.out.println("Value of num after calling parseInt method is " + num + " \t\t");
		
		boolean compare = (result == num) ? true : false;  
		System.out.println("Result is equal to num after comparison is " + compare);
		
		 
		System.out.println("------------- Testing ends for parseInt method String  -----------------");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		//create MyInteger obj 
		MyInteger m = new MyInteger(37); 
		
		testNonStaticMethods(m);

		testStaticMethods();
		
		//new integer 
		MyInteger i = new MyInteger(49);
		testStaticMethodsWithObject(i);
		
		testEquals();
		
		testParseInt();
		
		testParseIntForString();
	}

}
