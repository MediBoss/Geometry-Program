public class Rectangle {
  
  private double width;
  private double length;

/*
*@param theWidth is the parameter of the rectangle's width
@param theLength is the parameter of the rectangle's length
*/
public Rectangle(double theWidth, double theLength){
  
    this.lengh = theLength;
    this.width = theWidth;
  
}

public double getRectangleWidth(){

  return width;
}

public double getRectangleLength(){

  return length;
}

public double getRectanglePerimeter(){

  return 2*width+2*length;
}

public double getRectangleArea(){

  double rectArea = width*length;
  return  rectArea;
}

public String toString(){
  return "Rectangle width : "+width+" and length "+length;
}

  }
