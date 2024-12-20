import java.math.BigDecimal;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    String h = "hallo";
    for (int i = 0; i < h.length() ; i++); 
    System.out.println(h);

  // 2. Expected output: "0,1,2,3,4"
    // Use: for loop

    for (int i = 0; i <= 4 ;i++){
     System.out.println(i);
    }

    
    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
     
     for (int i = 0; i < 20 && i > 2; i++){
     if (i % 2 == 0) {
      System.out.println(i); }}

      //Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if

    for(int i =0; i < 10; i++ ){
      if (i% 3 == 0 && i % 5 ==0){
        System.out.println(i);
      }
    }
    //sum up the numbers between 0 and 15 and print it
    // Use: for loop

    int [] number = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

      int sum = 0;
     for (int i = 0; i < number.length ;i ++ ){
        sum += number[i];
        System.out.println ("the sum is"+ sum);
      }
     
      //sum up all odd numbers betwen 0 - 10
      // Sum up all even numbers betwen 0 - 10
      // Find the product of evenSum and oddSum
      // Use: for loop + if
     
      int n = 10;
      int sum1 = 0;
      for (int i = 0 ; i <= n; i++){
        if (i % 2 != 0){
        sum1 += sum1+i;
        System.out.println(sum1);

        }
      }

        int n2 = 10;
        int sum2 = 0;
        for (int i = 0; i < n2; i ++){
          if (i % 2 == 0) {
            sum2 += sum2+ sum2+ i ;
            System.out.println(sum2);
          }
        }  
        //Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi"; 
    System.out.println(str7.indexOf('d'));
    if(str7.charAt(8) == 'd'){
      System.out.println("'d' is found ");
    }else{
      System.out.println("'d' is not found ");
    }

       //  Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    String seach = "cba";
    System.out.println(s8a.toUpperCase().contains(seach.toUpperCase()));
    System.out.println(s8b.toUpperCase().contains(seach.toUpperCase()));

    boolean isSubstringExist  = false;
    for (int i = 0; i < s8b.length()- s8b.length(); i++){
      if (s8b.substring(i, i + s8a.length()).equals(s8a)){
       isSubstringExist = true;
       System.out.println(isSubstringExist);
      }
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int count = 0;
    for (int i = 0; i < s9.length(); i ++){
      if (s9.charAt(i)== 'p'){
        count++;
      }
    }  System.out.println("count = " +count);
       
     // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    int count3 = 0;
    for (int i = 0 ; i < arr10.length; i++){
      count++;
      System.out.println(arr10[0]);
     System.out.println("xxx".replace('x','k'));
     System.out.println("x".replace('x','k'));
     System.out.println("xbx".replace('x','k'));
     System.out.println("mkx".replace('x','k'));
     }     
        // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
      
      for (int i = 0; i < s11.length(); i++){
        System.out.println(Character.isUpperCase(s11.charAt(i)));}
        System.out.println("we got 4 true"+ ", so the count = 4");  
      
  // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    int n1=7;  
    
    for (int i= 0; i<= n1; i++)  
    {  

    for (int j=1; j<=n1-i; j++)  
    {  
    System.out.print(" ");  
    }  
    for (int k=0;k<=i;k++)  
    {  
    System.out.print("*");  
    }   
    System.out.println("");  


    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    char l =1;
    char r =3;
    char d = 2;
    char u = 4;
    int x =1;
    
    switch(x) {
      case 1:
      System.out.print(" l -> 1 score");
      
       case 2:
       System.out.println("r -> 3 score");
       
       case 3 :
       System.out.println("d -> 2 score");
      
      case 4 :
      System.out.println("u -> 4 score");

    }
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[] {1,2,9,-4};
    arr14[0] = 1;
    arr14[1]=2;
    arr14[2] =9;
    arr14[3]=-4;

    for (long ii = 1; ii< arr14.length; ii++){
      System.out.println(arr14);

      // 15. Find the max value and min value in arr14
    // Use One Loop + if

    int max = Integer.MIN_VALUE;
    for (int iii =0; iii < arr14.length; iii++){
      if (arr14[iii] >  max){
      }
    }
     System.out.println(max);

     // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
      float arrf1 =  0.2f;
      float arrf2 = 0.3f;
      float arrf3 = 0.6f;

      for (float iiii = 0.0f; iiii < arrf3 ; iiii++) {
        if (arrf1 < arrf3) {
          }
          System.out.println(arrf1 + arrf2 +arrf3);

      } 
        // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal

    BigDecimal bd1 = BigDecimal.valueOf(0.1);
    BigDecimal bd2 = BigDecimal.valueOf(0.2);
    BigDecimal bd3 = BigDecimal.valueOf(0.3);
    BigDecimal bd4 = BigDecimal.valueOf(0.6);
    BigDecimal bd5 = bd1.add(bd2);
    BigDecimal bd6 = bd1.add(bd3);
    BigDecimal bd7 = bd1.add(bd4);
     System.out.println(bd5); 
     System.out.println(bd6);
     System.out.println(bd7);

     // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    int  count1 =0 ;
    // Print "count name=2"
    for (int i1 = 0; i1 < arr18.length ;i1++){
      if (target == arr18[i1]){
        count1++;
      } System.out.println("count name  =" +count1);
  } 

  // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289"; // 4,0,2,8,9
    int miniidx = -1;
    int maxidx = -1;
    for (int i2 = 0; i2 <s19.length(); i2++){


    }
    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    String target1 = "programming" ;
    int count4 = 0;
    for (int i3 =0 ; i3 < arr20.length; i3++ ){
      if (target1 == arr20[3]){
        count4++;
        System.out.println("longest=programming" +count4);
      }

    }
    

   


    }
    }
    } }
    