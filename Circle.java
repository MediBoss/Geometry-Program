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
     return (int)area +0.5;
 }

 public double getCircleDiameter(){

     return (int)(radius*2) + 0.5;
 }

  public double getCircleCircumference(){

      return (int)(2*(pi*radius))+0.5;

  }

  
}
