package pkg;

class Bicycle{
	private char size;
	private double tire_size;
	private String chain;
	
	public Bicycle(char size,double tire_size,String chain) {
		this.size=size;
		this.tire_size=tire_size;
		this.chain=chain;

	}
	
	public char getSize() {
		return size;
	}
	
	public double getTireSize() {
		return tire_size;
	}
	
	public String getChain() {
		return chain;
	}
	
	public void spares() {
		System.out.println("Chain:"+chain+"Tire Size:"+tire_size);
		
	}
	
}


class RoadBike extends Bicycle {
	

	private String tape_color;
	
	public RoadBike(char size,double tire_size,String chain,String tape_color) {
		super(size,tire_size,chain);
		this.tape_color=tape_color;
		
		
	}
	
	public String getTapeColor() {
		return tape_color;
	}

	public void spares() {
		super.spares();
		System.out.print("Tape_color:"+getTapeColor());
	}
}

class MountainBike extends Bicycle{

	private String front_shock;
	private String rear_shock;
	
	public MountainBike(char size, double tire_size, String chain,String front_shock,String rear_shock) {
		super(size, tire_size, chain);
		this.front_shock=front_shock;
		this.rear_shock=rear_shock;
	}
	
	public String getFrontShock() {
		return front_shock;
	}
	
	public String getRearShock() {
		return rear_shock;
	}
	
	public void spares() {
		System.out.println("Rear_Shock:"+rear_shock);
	}
	
}

public class AcquiringBehaviorThroughInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
