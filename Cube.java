public class Cube{

  private double edge;

  public Cube(double edge){

      this.edge = edge;

}

  public double getEdge(){

      return edge;

}

  public double getCubeSurfaceArea(){

    return (6*Math.pow(edge,2.0));
}

  public double getCubeVolume(){

      return (Math.pow(edge,3.0));
  }

  public String toString(){

    return "The Cube with a edge of "+edge;
  }

}

