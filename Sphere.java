public class Sphere{

  private double radius;
  private static final double pi = Math.PI;

  public Sphere(double rad){

      radius = rad;
  }
    public double sphereDiameter(){

      return radius*2;
    }

    public double sphereCircumference(){

      return (int)2*(radius*pi)+0.5;
    }

    public double sphereSurfaceArea(){

        double surfArea = 4*(pi*Math.pow(radius,2.0));
        return (int)surfArea +5.0;
    }

    public double sphereVolume(){

        double sphereVol = 4/3*pi*Math.pow(radius,3.0);
        return (int)sphereVol +0.5;

    }
}
