public class Triangle{

private double base;
private double height;


public Triangle(double triangleBase, double triangleHeight){
  base = triangleBase;
  height = triangleHeight;


}

public double  getTriangleBase(){

  return base;

}

public double getTriangleHeight(){

  return height;

}

public double getTriangleArea(){

  double area = (base*height)/2;
  return area;
}

public double getHypotenus(){
  double y = 2.0;
  double stepOne = Math.pow(height, y);
  double stepTwo = Math.pow(base,y);
  double stepThree = stepOne + stepTwo;
  double finalStep = Math.sqrt(stepThree);
  return finalStep;
}

public String toString(){

  return "Triangle with base "+base+" height "+height;
}
  }

