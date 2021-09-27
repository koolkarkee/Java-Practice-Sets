
public class PreciseTime {
	//variables 
	private int hour; 
	private int minute; 
	private int seconds;
	private boolean morning; 
	
	//getters 
	public int getHour(){ return this.hour; }
	public int getMinute(){ return this.minute; }
	public int getSeconds(){ return this.seconds; }
	public boolean getMorning(){ return this.morning; }  
	
	//setters 
	public void setHour(int hour){ this.hour = hour;}
	public void setMinute(int minute){ this.minute = minute;}
	public void setSeconds(int seconds){ this.seconds = seconds;}
	public void setMorning(boolean morning){ this.morning = morning;}  
	
	//constructor with individual parameters passed 
	public PreciseTime(int hour, int minute, int seconds, boolean morning){
		//initialize with passed values 
		setHour(hour); 
		setMinute(minute); 
		setSeconds(seconds);
		setMorning(morning); 
	}
	
	//default constructor 
	public PreciseTime(){
		//initialize with midnight value
		this(12, 0, 0, true);   
	}
	
	//constructor with time supplied as String object (HH:MM:SSXX format)
	public PreciseTime(String time){
		this(Integer.parseInt(time.substring(0,2)), Integer.parseInt(time.substring(3,5)), Integer.parseInt(time.substring(6,8)), ((time.substring(8,9).equalsIgnoreCase("A")) ? true : false)); 
	}
	
	//get String format of BasicTime
	public String toString(){ 
		int h = this.getHour();
		String m = (String.valueOf(this.getMinute()).length() ==1 ? "0" + this.getMinute() : this.getMinute() + "").trim();
		String s = (String.valueOf(this.getSeconds()).length() ==1 ? "0" + this.getSeconds() : this.getSeconds() + "").trim();

		return (h + ":" + m + ":" + s + ":" + (this.morning ? "AM" : "PM"));
	} 
	
	//add two PreciseTime objects, static method
    public static PreciseTime addTo(PreciseTime a, PreciseTime b){
    	int hour1 = a.getMorning() ? a.getHour() : (12 + a.getHour()); 
    	int hour2 = b.getMorning() ? b.getHour() : (12 + b.getHour()); 
    	
    	int totalMinute1 = hour1 * 60 + a.getMinute(); 
    	int totalMinute2 = hour2 * 60 + b.getMinute();  
    	
    	int totalMinute = totalMinute1 + totalMinute2; 
    	 
    	int sec = a.getSeconds() + b.getSeconds(); 
    	int minCarry = 0;
    	if(sec >= 60){
    		minCarry = 1;
    		sec -= 60; 
    	} 
    	totalMinute = totalMinute + minCarry;

    	int min = totalMinute%60; 
    	int hour = 12 - (totalMinute/60); 
 
    	boolean morning = (hour < 0) ? true : false; 
    	if(hour < 0){
    		hour *= -1;
    	}  
    	 
    	PreciseTime result = new PreciseTime(hour, min, sec, morning); 
    	return result;
    }
    
    //add two PreciseTime objects, non-static method
    public PreciseTime add(PreciseTime a, PreciseTime b){
    	return PreciseTime.addTo(a, b); 
    }
    
    //subtract two PreciseTime objects, static method
    public static PreciseTime subtractTo(PreciseTime a, PreciseTime b){
    	int hour1 = a.getMorning() ? a.getHour() : (12 + a.getHour()); 
    	int hour2 = b.getMorning() ? b.getHour() : (12 + b.getHour()); 
    	
    	int totalMinute1 = hour1 * 60 + a.getMinute(); 
    	int totalMinute2 = hour2 * 60 + b.getMinute();  
    	
    	int totalMinute = totalMinute1 - totalMinute2; 
    	 
    	int sec = a.getSeconds() - b.getSeconds(); 
    	int minCarry = 0;
    	if(sec < 0){
    		minCarry = 1;
    		sec += 60;
    	} 
    	totalMinute = totalMinute - minCarry;

    	int min = totalMinute%60; 
    	int hour = 12 + (totalMinute/60); 
 
    	boolean morning = (hour < 0) ? true : false; 
    	if(hour < 0){
    		hour *= -1;
    	}  
    	
    	PreciseTime result = new PreciseTime(hour, min, sec, morning); 
    	return result;
    }  
    
    //add two PreciseTime objects, non-static method
    public PreciseTime subtract(PreciseTime a, PreciseTime b){
    	return PreciseTime.subtractTo(a, b); 
    }
	
		
}
