package Quest;
/**
 * Expected Output:
 * 
 * I am going to add two numbers together:
 * The first one: 31
 * The second one: 42
 * The sum is 73
 * The subtraction reuslt is 11
 * The another sum result is 130
 * The variable varB is false
 * The variable varC is true
 * The variable fnumber is -130.2
 * The variable dnumber is -20.5
 * The variable reminder is 1
 * The variable result is 3
 */
// Primitive types and operators
public class JavaQuest1 {

  public static void main(String[] args) {

    System.out.println("I am going to add two numbers together:");

    int first = 31;
    int second =42;
    int sum =73;


    System.out.println("The first one: " + 31);
    System.out.println("The second one: " + 42);
    System.out.println("The sum is " + 73);

    int x1 = 5;
    int x2 = 6;
    int x3 = 11;

    System.out.println("The subtraction reuslt is " + 11);

    byte b1 = 60;
    byte b2 = 70;
    
    int b3 = 60;
    int b4 =70;
   
    System.out.println("The another sum reuslt is " + 130);

    boolean varB = false;
    boolean varC = true;

    boolean isSmoker = false;
    int age = 66;
    boolean isElderly = age > 65; 
    

    int age2 = 18;
    boolean isAdult = age2 >= 18;
    
    System.out.println("The variable varB is " + false);
    System.out.println("The variable varC is " + true);

   double f1 = -130.20;
    float f2 = -130.20f;
    double d1 = -20.50;

    System.out.println("The variable fnumber is " + -130.20f);
    System.out.println("The variable dnumber is " + -20.50);

    
    int a = 7;
    int b = 3;
    int reminder = 1;
    System.out.println("The variable reminder is " + 1);

    
    int e = 7;
    int o = 8;
    int y = 4;
    int x = 2;
    int result = 3;
    
    double result1 = e - o * x / y;
    
    System.out.println("The variable result is " + 3);
  }
}
