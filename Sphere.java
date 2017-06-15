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

      return 2*(radius*pi);
    }

    public double sphereSurfaceArea(){

        double surfArea = 4*(pi*Math.pow(radius,2.0));
        return surfArea;
    }

    public double sphereVolume(){

        double sphereVol = 4/3*pi*Math.pow(radius,3.0);
        return sphereVol;

    }
}
