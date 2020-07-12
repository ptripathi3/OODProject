package pkg;

interface Diameter{
	public double getDiameter(); 
}


class Wheel implements Diameter{
	private double rim_dia;			//Rim diameter
	private double tire_dia;		//Tire diameter
	private double wheel_dia;		//Wheel diameter
	private boolean setwheel;		//bool value to know if wheel diameter set or not
	
	//CONSTRUCTOR
	public Wheel(double rim_dia,double tire_dia) {
		this.rim_dia=rim_dia;
		this.tire_dia=tire_dia;
		this.setwheel=false;
	}
	
	public double getRim(){			//getter method for rim diameter
		return rim_dia;
	}
	
	public double getTire(){		//getter method for tire diameter
		return tire_dia;
	}
	
	private void setWheel() {		//private method to set wheel diameter
		wheel_dia=getRim()+(2*getTire());
		setwheel=true;
	}
	
	public double circumference() {		//getter method for wheel's circumference
		return getDiameter()*Math.PI;
	}
	
	public double getDiameter() {		//getter method for wheel's diameter
		if(setwheel==false)
			setWheel();
		return wheel_dia;
	}
}

public class Gear {
	
	//DATA MEMBERS
	private int cog;				//No. of teeth in Cog 
	private double chainring;		//No. of teeth in Chainring 
	private double ratio;			//Ration of Chainring and Cog
	private boolean setratio;		//bool value to know if ratio set or not
	private Diameter wheel;			//Interface variable to call diameter function
	
	//CONSTRUCTOR
	public Gear(double chainring,int cog,Diameter wheel) {

		this.chainring=chainring;
		this.cog=cog;
		this.wheel=wheel;
		this.setratio=false;
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
	
	public double getRatio() {		//getter method for ratio
		if(setratio==false)
			setRatio();
		
		return ratio;
		
	}
	
	
	public double getGearInches() {			//getter method for gear inches
		return wheel.getDiameter()*getRatio();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gear g1=new Gear(52,11);				//New object of class gear
		Gear g2=new Gear(30,27);				//New object of class gear
		System.out.println(g1.getRatio());		//print gear_inches for object g1
		System.out.println(g2.getRatio());		//print gear_inches of object g2
		
		Wheel w1=new Wheel(26,1.5);				//New object of class Wheel
		Diameter d1=w1;							//give reference of Wheel class(Subclass) to Diameter variable(Superclass) 
		Diameter d2=new Wheel(24,1.25);			//New objects(Wheel) reference given to Diameter
		Gear g3=new Gear(52,11,d1);				//New object of class gear
		Gear g4=new Gear(52,11,d2);				//New object of class gear
		System.out.println(w1.circumference());		//print circumference for object w1
		System.out.println(g3.getGearInches());		//print gear_inches for object g1
		System.out.println(g4.getGearInches());		//print gear_inches of object g2
		
	}
}