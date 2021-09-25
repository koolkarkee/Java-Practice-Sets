
public class MyInteger {
	//data field
	private int value; 
	
	//constructor with parameter
	public MyInteger(int value){
		System.out.println("constructor called .. ");
		this.value = value;
		System.out.println("Value is set to " + this.value);
	}
	
	//getter method
	public int getValue(){ return this.value; } 
	
	//isEven method 
	public boolean isEven(){
		return (this.value%2 == 0) ? true : false;
	}
	
	//isOdd method
	public boolean isOdd(){
		return (this.value%2 == 0) ? false : true;
	}
	
	//isPrime method 
	public boolean isPrime(){
		boolean flag = true; 
		int temp; 
		for(int i=2; i <= this.value/2; i++){
			temp = this.value%i; 
			if(temp == 0){
				flag = false; 
				break; 
			} 
		}
		return flag;
	}
	
	//static method isEven
	public static boolean isEven(int num){
		return (num%2 == 0) ? true : false;
	}
	
	//static method isOdd
	public static boolean isOdd(int num){
		return (num%2 == 0) ? false : true;
	}
	
	//static method isPrime
	public static boolean isPrime(int num){
		boolean flag = true; 
		int temp; 
		for(int i=2; i <= num/2; i++){
			temp = num%i; 
			if(temp == 0){
				flag = false; 
				break; 
			} 
		}
		return flag;
	}
	
	//static methods with object parameter
	public static boolean isEven(MyInteger obj){
		return MyInteger.isEven(obj.getValue());
	}
	
	public static boolean isOdd(MyInteger obj){
		return MyInteger.isOdd(obj.getValue());
	}
	
	public static boolean isPrime(MyInteger obj){
		return MyInteger.isPrime(obj.getValue());
	}
	
	//equals method 
	public boolean equals(int num){
		return this.value == num ? true : false;
	}
	
	//equals method with object parameter 
	public boolean equals(MyInteger obj){
		return this.value == obj.getValue() ? true : false;
	}
	
	//static method parseInt 
	public static int parseInt(char[] arr){
		int output = 0; 
		for(int i=0;i<arr.length;i++){
	        output = output*10+(arr[i]-'0');
	    }
		
		return output;
	}
	
	//static method parseInt with string parameter
	public static int parseInt(String s){
		char[] c = new char[s.length()]; 
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);  
		}
		
		return parseInt(c);
	}
	
}
