package pkg;

class NewBicycle{
	private Parts parts;
	private String size;
	public NewBicycle(String size,Parts parts) {
		this.size=size;
		this.parts=parts;
	}
	public String getSize() {
		return size;
	}
	public Parts getParts() {
		return parts;
	}
	public void spares() {
		parts.spares();
		
	}
	
	
}

class Parts{
	private Part[] part;
	public Parts(Part... part) {
		this.part=part;
	}
	public void spares() {
		for(int i=0;i<part.length;i++) {
			part[i].spares();
		}
	}
	
}

class Part{
	private String name;
	private String desc;
	private boolean need_spare;
	
	public Part(String name, String desc,boolean need_spare) {
		this.name=name;
		this.desc=desc;
		this.need_spare=need_spare;
	}
	
	public Part(String name,String desc) {
		this(name,desc,true);
	}
	
	public String getName() {
		return name;
		
	}
	
	public String getDesc() {
		return desc;
	}
	public boolean getNeedSpare() {
		return need_spare;
	}
	
	public void spares() {
		if(need_spare==true) {
			System.out.println("Name:"+getName()+" Description:"+getDesc());
		}
	}
	
}

public class CompositionImp {

	public static void main(String[] args) {
		
		Part p1=new Part("chain", "9-speed");
		Part p2=new Part("tire_size","28");
		Part p3=new Part("Flag","tall and orange");
		
		Parts obj=new Parts(p1,p2,p3);
		NewBicycle bi=new NewBicycle("L",obj);
		System.out.println("For RoadBike:");
		bi.spares();
		
		Part q1=new Part("chain","10-speed");
		Part q2=new Part("tire_size","2.1");
		Part q3=new Part("front_shock","Manitou", false);
		Part q4=new Part("rear_shock","Fox");
		
		Parts obj1=new Parts(q1,q2,q3,q4);
		NewBicycle bi1=new NewBicycle("M",obj1);
		System.out.println("For MountainBike:");
		bi1.spares();
		

	}

}
