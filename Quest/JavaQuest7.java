package Quest;
/**
 * The sum is 55
 */
public class JavaQuest7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    // code here
  int sum = 0;
    
  int[] array = {1,2,3,4,5,6,7,8,9,10};
  int  length = array.length;
  for (int i = 0; i < length; i++) { 
      if (array[i] <= 55) {
        sum = sum + array[i];
      }}
    
    System.out.println("The sum is " + sum);
  }
}