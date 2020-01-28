public class Lab3
{
  public static void testLightCandles1()
  {
    Robot.load("candles1.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  
  public static void testLightCandles2()
  {
    Robot.load("candles2.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
    
  public static void lightCandles()
  {
    for(int i = 0; i<10; i++){
        while(Robot.frontIsClear() != true){
            Robot.turnLeft();
            Robot.move();
            turnRight();
        }
        Robot.move();
        Robot.makeDark();
        Robot.move();
        turnRight();
        while(Robot.frontIsClear() != false)
        {
            Robot.move();
        }
        Robot.turnLeft();
    }
  }
  
  //Run this method to test completeRoom on map room1.txt
  public static void testCompleteRoom1()
  {
     Robot.load("room1.txt");
     Robot.setDelay(0.05);
     completeRoom();
  }
  
  //Run this method to test completeRoom on map room2.txt
  public static void testCompleteRoom2()
  {
    Robot.load("room2.txt");
    Robot.setDelay(0.05);
    completeRoom();
  }
  
  //Complete this method.  You will need to write additional helper methods.
  public static void completeRoom()
  {
    for(int i = 0; i<4; i++){
        for(int o = 0; o<5;o++){
            Robot.turnLeft();
            if (Robot.frontIsClear() != false){
                Robot.move();
                if(Robot.onDark()){
                    turnAround();
                    Robot.move();
                    Robot.turnLeft();
                } else {
                    Robot.makeDark();
                    turnAround();
                    Robot.move();
                    Robot.turnLeft();
                }
            } else {
                turnRight();
            }
            if(o == 4) {
                turnRight();
            } else {
                Robot.move();
            }
        }
    }
  }
  
  //Run this method to test swapAll on map swap1.txt
  public static void testSwapAll1()
  {
    Robot.load("swap1.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
  
  //Run this method to test swapAll on map swap2.txt
  public static void testSwapAll2()
  {
    Robot.load("swap2.txt");
    Robot.setDelay(0.05);
    swapAll();
  }

  //Complete this method.  You will need to write additional helper methods.
  public static void swapAll()
  {
    for(int i = 0; i<10; i++){
        boolean right = false;
        boolean left = false;
        Robot.turnLeft();
        Robot.move();
        if(Robot.onDark()){
            left = true;
        }
        turnAround();
        Robot.move();
        Robot.move();
        if(Robot.onDark()){
            right = true;
        }
        turnAround();
        Robot.move();
        Robot.move();
        if(right != true){
            if(Robot.onDark()){
            Robot.makeLight();
        }
        } else {
            if (Robot.onDark()){
            } else {
            Robot.makeDark();
        }
        }
        turnAround();
        Robot.move();
        Robot.move();
        if(left != true){
            if(Robot.onDark()){
            Robot.makeLight();
        }
        } else {
            if (Robot.onDark()){
            } else {
            Robot.makeDark();
        }
        }
        turnAround();
        Robot.move();
        turnRight();
        if (i<9){
            Robot.move();
        }
    }
  }
  
  public static void turnRight()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.turnLeft();
  } 
  
  //Don't run these. I will!
  public static void testLightCandles3()
  {
    Robot.load("candles3.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  
  public static void testLightCandles4()
  {
    Robot.load("candles4.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  public static void testCompleteRoom3()
  {
     Robot.load("room3.txt");
     Robot.setDelay(0.05);
     completeRoom();
  }
  
  public static void testCompleteRoom4()
  {
    Robot.load("room4.txt");
    Robot.setDelay(0.05);
    completeRoom();
  }
  
  public static void testSwapAll3()
  {
    Robot.load("swap3.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
  
  //Run this method to test swapAll on map swap2.txt
  public static void testSwapAll4()
  {
    Robot.load("swap4.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
}
