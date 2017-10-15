public class Cylinder{

	private double radius;
	private double height;
	
	public Cylinder(double radius, double height){
		
		this.radius = radius;
		this.height = height;

	}

	public double getVolume(){


	return (int)((3.14)*(Math.pow(this.radius,2.0))*(this.height))+5.0;

	}

	public double getSurfaceArea(){

	return (int)((2*3.140)*(this.radius*this.height) + (2*3.14)*(Math.pow(this.radius,2.0)))+5.0;
	

	}
	

	public String toString(){

	return "Cylinder with radius of "+this.radius+" and height of "+this.height;

	}


}
