package pkg;


import java.util.Arrays;

public class ObscuringReferences {
	private int [][] data;				//2D array for rim and tire sizes
	
	//CONSTRUCTOR
	public ObscuringReferences(int[][] data) {
		this.data=data;
	}
	
	public int [] getData(int i) {		//just hiding the instance variable is not enough
		return data[i];
	}
	
	public int[] diameters() {			//Calculate wheel diameter
		int [] dia=new int[data.length];
		int[] cell;
		for(int i=0;i<data.length;i++)
		{	cell=getData(i);
			dia[i]=cell[0]+(2*cell[1]);
		}
		return dia;
		
	}
	
	public static void main(String[] args) {
		
		int [][] data = {{622, 20}, {622, 23}, {559, 30}, {559, 40}};
		ObscuringReferences obj=new ObscuringReferences(data);
		System.out.println(Arrays.toString(obj.diameters()));
	}

}
