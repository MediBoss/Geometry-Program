public class Circle{

  private double radius;
  private static double pi = Math.PI;


  public Circle(double rad){

      radius = rad;

  }

 public double getCircleRadius(){

        return radius;
    }
 public double getCircleArea(){

     double area = pi*Math.pow(radius,2.0);
     return area;
 }

 public double getCircleDiameter(){

     return radius*2;
 }

  public double getCircleCircumference(){

      return 2*(pi*radius);

  }

  
}



