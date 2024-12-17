/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
     // Second Max = 230
    int[] nums1 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums2= new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums3 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240



    int[] nums = new int[]{ -10, 5, 100, 240, 230, 80 };; 
    int secondmax= Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++){
      if (nums[4] > secondmax) {
       secondmax = nums[4];
       System.out.println("The second max = " + secondmax ); 




      }
    }
    


    }




      }

    
    // code here ...
  
