public class Cone{

private double radius;

private double height;


	public Cone(double radius, double height){

		this.radius = radius;
		this.height = height;
	}

       
	public double getVolume(){


	return (1/3)*3.14*(Math.pow(this.radius,2.0))*this.height;

	}

	public double getSurfaceArea(){


	double result = 3.14*this.radius*(this.radius + Math.sqrt(Math.pow(this.radius,2.0)+Math.pow(this.height,2.0)));

	return result;

	}

	
	public String toString(){

	return "A cone with Radius "+this.radius+" and height "+this.height;		
		
	}

}
