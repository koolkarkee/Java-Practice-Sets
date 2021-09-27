
public class BasicTime {
	//variables 
	private int hour; 
	private int minute; 
	private boolean morning; 
	
	//getters 
	public int getHour(){ return this.hour; }
	public int getMinute(){ return this.minute; }
	public boolean getMorning(){ return this.morning; } 
	
	//setters 
	public void setHour(int hour){ this.hour = hour;}
	public void setMinute(int minute){ this.minute = minute;}
	public void setMorning(boolean morning){ this.morning = morning;} 
	
	//constructor with individual parameters passed 
	public BasicTime(int hour, int minute, boolean morning){
		//initialize with passed values 
		setHour(hour); 
		setMinute(minute); 
		setMorning(morning); 
	}
		
	//default constructor 
	public BasicTime(){
		//initialize with midnight value
		this(12, 0, true);   
	}
	 
	//constructor with time supplied as String object (HH:MMXX format)
	public BasicTime(String time){   
		this(Integer.parseInt(time.split(":",2)[0]), Integer.parseInt(time.split(":", 2)[1].substring(0,2)), ((time.split(":", 2)[1].substring(2,3).equalsIgnoreCase("A")) ? true : false)); 
	}
	
	//get String format of BasicTime
	public String toString(){ 
		return ((String.valueOf(this.getHour()).length() == 1 ? "0" + this.getHour() : this.getHour()) + ":" + (String.valueOf(this.getMinute()).length() ==1 ? ("0" + this.getMinute()) : this.getMinute()) + (this.morning ? "AM" : "PM"));
	} 

	//add two BasicTime objects, static method
    public static BasicTime addTo(BasicTime a, BasicTime b){
    	int hour1 = a.getMorning() ? a.getHour() : (12 + a.getHour()); 
    	int hour2 = b.getMorning() ? b.getHour() : (12 + b.getHour()); 
    	
    	int totalMinute1 = hour1 * 60 + a.getMinute(); 
    	int totalMinute2 = hour2 * 60 + b.getMinute();  
    	
    	int totalMinute = totalMinute1 + totalMinute2; 
    	
    	int min = totalMinute%60; 
    	int hour = 12 - totalMinute/60; 
    	
    	boolean morning = (hour < 0) ? true : false; 
    	if(hour < 0){
    		hour *= -1;
    	} 
    	 
    	BasicTime result = new BasicTime(hour, min, morning); 
    	return result;
    }
    
    //add two BasicTime objects, non-static method
    public BasicTime add(BasicTime a, BasicTime b){
    	return BasicTime.addTo(a, b); 
    }
    
    //subtract two BasicTime objects, static method
    public static BasicTime subtractTo(BasicTime a, BasicTime b){
    	int hour1 = a.getMorning() ? a.getHour() : (12 + a.getHour()); 
    	int hour2 = b.getMorning() ? b.getHour() : (12 + b.getHour()); 
    	
    	int totalMinute1 = hour1 * 60 + a.getMinute(); 
    	int totalMinute2 = hour2 * 60 + b.getMinute();  
    	
    	int totalMinute = totalMinute1 - totalMinute2; 
    	
    	int min = totalMinute%60; 
    	int hour = 12 + totalMinute/60; 
    	
    	boolean morning = (hour < 0) ? true : false; 
    	if(hour < 0){
    		hour *= -1;
    	} 
    	 
    	BasicTime result = new BasicTime(hour, min, morning); 
    	return result;
    }
    
    //add two BasicTime objects, non-static method
    public BasicTime subtract(BasicTime a, BasicTime b){
    	return BasicTime.subtractTo(a, b); 
    }

}
