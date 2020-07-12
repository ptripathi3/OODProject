package pkg;

public class Gear {
	
	//DATA MEMBERS
	private int cog;				//No. of teeth in Cog 
	private double chainring;		//No. of teeth in Chainring 
	private double ratio;			//Ration of Chainring and Cog
	private boolean setratio;		//bool value to know if ratio set or not
	
	//CONSTRUCTOR
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gear g1=new Gear(52,11);				//New object of class gear
		Gear g2=new Gear(30,27);				//New object of class gear
		System.out.println(g1.getRatio());		//print gear_inches for object g1
		System.out.println(g2.getRatio());		//print gear_inches of object g2
	}
}