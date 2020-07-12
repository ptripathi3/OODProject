package pkg;


public class Gear {
	
	//DATA MEMBERS
	private int cog;				//No. of teeth in Cog 
	private double chainring;		//No. of teeth in Chainring 
	private double ratio;			//Ration of Chainring and Cog
	private boolean setratio;		//bool value to know if ratio set or not
	private double rim_dia;			//Rim diameter
	private double tire_dia;		//Tire diameter
	private double wheel_dia;		//Wheel diameter
	private boolean setwheel;		//bool value to know if wheel diameter set or not
	
	//CONSTRUCTOR
	public Gear(double chainring,int cog,double rim_dia, double tire_dia) {

		this.chainring=chainring;
		this.cog=cog;
		this.rim_dia=rim_dia;
		this.tire_dia=tire_dia;
		this.setratio=false;
		this.setwheel=false;
	}	
	
	public Gear(double chainring,int cog) {

		this.chainring=chainring;
		this.cog=cog;
		this.setratio=false;
	}
	
	//METHODS 
	
	private void setRatio() {		//private method to set ratio
		ratio=getChainring()/getCog();
		setratio=true;
	}
	public double getChainring(){	//getter method for chainring
		return chainring;
	}
	

	public int getCog() {			//getter method for cog
		return cog;
	}
	
	public double getRim(){			//getter method for rim diameter
		return rim_dia;
	}
	
	public double getTire(){		//getter method for tire diameter
		return tire_dia;
	}
	
	public double getRatio() {		//getter method for ratio
		if(setratio==false)
			setRatio();
		
		return ratio;
		
	}
	
	private void setWheel() {		//private method to set wheel diameter
		wheel_dia=getRim()+(2*getTire());
		setwheel=true;
	}
	
	public double getWheel() {		//getter method for wheel diameter
		if(setwheel==false)
			setWheel();
		return wheel_dia;
		
	}
	
	public double getGearInches() {			//getter method for gear inches
		return getWheel()*getRatio();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gear g1=new Gear(52,11);				//New object of class gear
		Gear g2=new Gear(30,27);				//New object of class gear
		System.out.println(g1.getRatio());		//print gear_inches for object g1
		System.out.println(g2.getRatio());		//print gear_inches of object g2
		
		Gear g3=new Gear(52,11,26,1.5);				//New object of class gear
		Gear g4=new Gear(52,11,24,1.25);			//New object of class gear
		System.out.println(g3.getGearInches());		//print gear_inches for object g1
		System.out.println(g4.getGearInches());		//print gear_inches of object g2
	}
}