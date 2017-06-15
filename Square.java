public class Square{

  private double sideLength;
  /*
  *@param length is the length of the square's side
  */
  public Square(double length){
    sideLength = length;
  }

  public double getperimeter(){
    return (sideLength+sideLength)*2;
  }
  public double getArea(){
    return sideLength*4;
  }
  public String toString(){
    return "Circle of Side Length "+sideLength;
  }
}

