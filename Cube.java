
  private double edge;

  public Cube(double edge){

      this.edge = edge;

}

  public double getEdge(){

      return edge;

}

  public double getCubeSurfaceArea(){

    return (int)(6*Math.pow(edge,2.0))+0.5;
}

  public double getCubeVolume(){

      return (int)(Math.pow(edge,3.0))+0.5;
  }

  public String toString(){

    return "The Cube with a edge of "+edge;
  }

}

