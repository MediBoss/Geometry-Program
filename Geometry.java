/*
Coded BY : Medi W. Assumani

Language : Java

Descripption : This program is a geometry-based calculator. A calculator only based on certain geometrical
OBjects such as square,rectangle,cube,sphere,eclipse,etc...
*/

import java.util.Scanner;
public class MyProgram{
  public static void main(String [] args){

  upperBar();//displays the upperbar
  welcome();//displays the welcome message
  displayMenu();// displays the menu
  getUserInput();// gets the user choice
  bottomBox();//displas the bootom box
  //System.out.println("Medi is Updating the program...Check back later");

  }
//Displays the upper bar
  public static void upperBar(){

    System.out.println("____________________________________________________________________________");
  }
  //Displays the welcome message
  public static void welcome(){
    String message = "\n\n\t\tWelcome to The Geometry Program \n\n**Choose a number to pick your choice.\n\n";
    System.out.println(message);
  }
  //Displays the menu
  public static void displayMenu(){
    String menu = "\t1.Square\n\n\t2.Rectangle\n\n\t3.Triangle\n\n\t4.Circle\n\n\t5.Sphere\n\n\t6.Cube\n\n\t7.Cone\n\n\t8.Cylinder\n\n";
    System.out.println(menu);
  }
  // Does the stuff
  public static void getUserInput(){
    Scanner in = new Scanner(System.in); // creates a new input
    System.out.println("Press The corresponding number for a figure : \n");
    int userChoice = in.nextInt();//stores the user input in userChoice
      if(userChoice ==1 || userChoice ==2 || userChoice ==3 || userChoice ==4 || userChoice ==5 || userChoice==6 || userChoice== 7 || userChoice==8){
        Scanner in1 = new Scanner(System.in);
        System.out.println("\nAre you sure ? (enter true or false)\n");//Creates a new input to get the user's choice
        boolean falseChoice = in1.nextBoolean();
          if(falseChoice==true){
            //If user selects true... codes below executes
            if(userChoice==1){//if user selects 1 to create a square
              //create a new square object
              Scanner in2 = new Scanner(System.in);//creates new input to get the choice of the user
              System.out.println("What Would you like to Calculate : \n\t*Perimeter\n\n\t*Area\n");//displays options
              String calcChoice1 = in2.nextLine();//stores the user choice choice
              Scanner in3 = new Scanner(System.in);//gets the square's side lenght
              System.out.println("Enter the side length : \n");
              double squareSideLength = in3.nextDouble();//stores new input
              Square mySquare1 = new Square(squareSideLength); //creates a new square object

                if(calcChoice1.equals("area")){

                  //If the user chooses to find the area
                  System.out.println("The Area of the square is "+mySquare1.getArea());//outputs the area
                }else if(calcChoice1.equals("perimeter")){// if the user chooses the perimeter
                  //code to execute
                  System.out.println("The Perimer of the square is "+mySquare1.getperimeter());
                }else{
                  System.out.println("Invalid Input...Terminating Program...\nProgram Terminated");
                  System.exit(0);
                }
                  //End of The Squares

            }else if(userChoice==2){// if the user chooses the rectangle

              Scanner in5 = new Scanner(System.in);
              System.out.println("What would like to calculate : \n\t*Area\n\n\t*Perimeter\n");//Displays the options
              String calcChoice2 = in5.nextLine();
              Scanner in6 = new Scanner(System.in);// gets rectangle width
              System.out.println("Enter the width : \n");
              double rectWidth = in6.nextDouble();//stores the width
              System.out.println("Enter the Length : \n");
              Scanner in7 = new Scanner(System.in);//gets rectangle height
              double rectLength = in7.nextDouble();//stores the length
   
              //creates a new rectangle object
              Rectangle myRectangle = new Rectangle(rectWidth,rectLength);

                if(calcChoice2.equals("perimeter")){
                      //Prints out the perimeter of the rectanle
                  System.out.println("The Perimeter is "+myRectangle.getRectanglePerimeter());

                }else if(calcChoice2.equals("area")){
                  System.out.println("The Area is : "+myRectangle.getRectangleArea());
                }else{
                  System.out.println("Invalid Input...Terminating Program...\nProgram Terminated");
                  System.exit(0);
                }

                //End of Rectangle

            }else if(userChoice==3){

              Scanner in9 = new Scanner(System.in);//gets the user choice
              System.out.println("What do you  want to calculate : \n\t*Area\n\t*Hypotenuse\n");
              String calcChoice3 = in9.nextLine();// store the user choice
              Scanner in10 = new Scanner(System.in);
              System.out.println("Enter the Height : \n");
              double triLength = in10.nextDouble();
              Scanner in11 = new Scanner(System.in);// gets rectangle width
              System.out.println("\nEnter the base : \n");
              Double triBase = in11.nextDouble();
              
              Triangle myTriangle = new Triangle(triBase,triLength);
                if(calcChoice3.equals("area")){

                  System.out.println("The Area is : "+myTriangle.getTriangleArea());

                }else if(calcChoice3.equals("hypotenuse")){

                  System.out.println("The Hypothenuse is "+myTriangle.getHypotenus());
                }

                //End of triangles

            }else if(userChoice==4){
              Scanner in13 = new Scanner(System.in);
              System.out.println("What would like to calculate : \n\n\t*Diameter\n\n\t*Circumference\n\n\t*Area\n\n\t*Convert Degrees to Radians(Enter DTR)");
              String calcChoice4 = in13.nextLine();
              Scanner in14 = new Scanner(System.in);
              System.out.println("\nEnter the Radius : \n");
              double circleRadius =  in14.nextDouble();
              
              Circle myCircle = new Circle(circleRadius);
                if(calcChoice4.equals("area")){
                  //code to execute for area
                  System.out.println("\nThe Area of the Circle is "+myCircle.getCircleArea());

                }else if(calcChoice4.equals("circumference")){
                  //code to execute for circumference
                  System.out.println("The circumference is : "+myCircle.getCircleCircumference());
                }else if(calcChoice4.equals("DTR")){
                  //convert degree to radians
                  Scanner in16 = new Scanner(System.in);
                  System.out.println("\nEnter the Angle in Degrees: ");
                  double circleAngle = in16.nextDouble();
                  circleAngle = (double)(Math.toRadians(circleAngle));
                  System.out.println("\nDegree to Radian : "+circleAngle);
                }else if(calcChoice4.equals("Diameter")){
                  System.out.println("The diamter is "+myCircle.getCircleDiameter());

                }else{
                    System.out.println("Invalid Input...Terminating Program...\nProgram Terminated");
                    System.exit(0);
                }

              //create a new circle object
            }else if(userChoice==5){
              //create a new Sphere object
              Scanner in17 = new Scanner(System.in);
              System.out.println("What would you like to Calculate : \n\n\t*The Diameter\n\n\t*The Circumference\n\n\t*The Surface Area(Enter SA)\n\n\t*The Volume\n");
              String calcChoice5 = in17.nextLine();
              Scanner in18 = new Scanner(System.in);
              System.out.println("\nEnter the Radius : \n");
              double sphereRadius = in18.nextDouble();
              
              Sphere mySphere = new Sphere(sphereRadius);

                if(calcChoice5.equals("diameter")){
                    //calculate the diameter of the sphere
                    System.out.println("\n The Diameter is : "+mySphere.sphereDiameter());

                }else if(calcChoice5.equals("circumference")){
                    //calculate circumference of the sphere
                    System.out.println("The Circumference is : "+mySphere.sphereCircumference());

                }else if(calcChoice5.equals("sa")){
                    //calculate surface area of the sphere
                    System.out.println("The Surface Area is : "+mySphere.sphereSurfaceArea());
                }else if(calcChoice5.equals("volume")){
                    //calculate the volume of the sphere
                    System.out.println("The Volume of the spherev is : "+mySphere.sphereVolume());

                }else{

                    System.out.println("Invalid Input...Terminating Program...\nProgram Terminated");
                    System.exit(0);
                }



                //end of sphere
            }else if(userChoice==6){
              //create a new cube object
              Scanner in20 = new Scanner(System.in);
              System.out.println("\nWhat would you like to calculate : \n\n\t*Surafce Area(Enter sa)\n\n\t*Volume of the Cube\n");
              String calcChoice6 = in20.nextLine();
              Scanner in21 = new Scanner(System.in);
              System.out.println("\nEnter one edge: \n");
              double cubeEdge = in21.nextDouble();
              
              Cube myCube = new Cube(cubeEdge);
              if(calcChoice6.equals("sa")){

                System.out.println("\nThe Surface Area is : "+myCube.getCubeSurfaceArea());
              }else if(calcChoice6.equals("volume")){

                System.out.println("\nThe Volume is : "+myCube.getCubeVolume());
              }

              // end of cube
            }else if(userChoice==7){
                
                Scanner in23 = new Scanner(System.in);   
                System.out.println("\nWhat would you like to calculate : \n\n\t*Volume\n\n\t*Surface Area\n\n");
                String calcChoice7 = in23.nextLine();
                Scanner in24 = new Scanner(System.in);
                System.out.println("Enter the Radius : \n");
                double coneRadius = in24.nextDouble();
                Scanner in25 = new Scanner(System.in);
                System.out.println("Enter the Height : \n");
                double coneHeight = in25.nextDouble();
                
                Cone myCone = new Cone(coneRadius,coneHeight);
                
                    if(calcChoice7.equals("volume")){
                        System.out.println("The Volume is "+myCone.getVolume());
                        
                    }else if(calcChoice7.equals("surface area")){
                        
                        System.out.println("The Surface Area is "+myCone.getSurfaceArea());
                        
                    }else{
                  System.out.println("Invalid Input...Terminating Program...\nProgram Terminated");
                  System.exit(0);
                         
            }
            
        }else if(userChoice==8){

		//code for a cylinder
		
		Scanner in26 = new Scanner(System.in);   
        System.out.println("\nWhat would you like to solve  : for\n\n\t*Volume\n\n\t*Surface Area\n\n");
        String calcChoice8 = in26.nextLine();
        Scanner in27 = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double rad = in27.nextDouble();
        Scanner in28 = new Scanner(System.in);
        System.out.println("Enter the Height : ");
        double height = in28.nextDouble();
        
        Cylinder myCylinder = new Cylinder(rad,height);
        
			if(calcChoice8.equals("volume")){

				//solve for volume
				System.out.println("\nThe volume is : "+myCylinder.getVolume());
			}else if(calcChoice8.equals("surface area")){
			//solve for surface area
		    System.out.println("\nThe Surface Area is : "+myCylinder.getSurfaceArea());
			}else{
                  		System.out.println("Invalid Input...Terminating Program...\nProgram Terminated");
                  		System.exit(0);
                         
            }


	}//next shape
            //end of true
          }else{
            //if user selects false... the program terminates
            System.out.println("Invalid Input...Terminating Program...\nProgram Terminated");
            System.exit(0);
          }

      }else{
        System.out.println("Invalid Input...Terminating Program...\nProgram Terminated");
        System.exit(0);
      }
  }
  public static void bottomBox(){

        System.out.println("\n\n____________________________________________________________________________");

}


    }
