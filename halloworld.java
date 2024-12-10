public class halloworld {
    public static void main(string[] args) {
    // commant. welcome to bootcamp! @(*!@(#)!@)
    // !1. date type (primitive)
    // int (date type) -> integer
    // x, dayOfweek -> variable 
    // int -> integar 
    int x =3; // from roght to left
    int dayOfweek = 7;
    //int y = 3.2 // ! not ok , y is a variable yaht can  store integar only.
    double y2 = 3.2;
    // double 2w = 10.0; // ! not ok 

    // variable java naming covension 
    // caml case; dayOfweek, y2

   //  int = x100 


    //re-assigmentg 
    x = 101; // re-assign 101 to x
    x = x + 10; // right 101 + 10, left assign 111 to x
    x = x - 40; // 111 - 40 - 71
    x = x * 3; // 71 * 3 ->213
    x = x / 213 ; // 213 / 213

    // print out 
    System.out.println(x); // 1
    x = x + 8 * 2 / 4 + 1;
    // 8 * 2 / 4 -> 4
    // 1 + 4 + 1 
    // 6
    System.out.println(x); // 6


    x = (x + 2) * 2 / (3 + 1);
    System.out.println(x); // 4

    x = ((x + 3) / (6 + 1)) * (x + 1 );
    System.out.println(x); // 5

    // drivide
    int x2 = 3 / 2;
    // step 1: 3 -> int value, 2 -> int value 
    // step 2: int value / int value  -> int value
    // step 3: 3 / 2 = 1
    // step 4: assign 1 (int value) to int type variable (ok!)
    System.out.println(x2); //1

    double x3 = 3 / 2;
    //step 1: 3 -> int value  2 -> int value 
    //step 2: int value / int value = int value 
    //step 3: 3 / 2  = 1
    //step 4: assign 1 (int value) to double type varible (covert 1 to 1.0)
    System.out.println(x3); // 1.0 

    double x4 =  3.0 / 2.0;
    // step 1: 3.0 -> double value, 2 -> double value
    // step 2: double value / double value  = double value 
    // step 3: 3.0 / 2  = 1.5
    // step 4:  assign 1.5 (double value) to double type variable
    System.out.println(x4); // 1.5

    double x5 = 3.0  /  2;
    // step 1: 3.0 -> double value, 2 -> int value 
    // step 2: double value / int value = double value 
    // step 3: 3.0 / 2.0 -> 1.5
    // step 4: assign 1.5 (double value) to int type variable (down case)
    // ! not allow assisgn a higer level value to a lower level type of variable 
    
    // int > double = upcase
    // double > int = downcase 

    // ! sotre integar. Jave: int, byte, short, short, long 
    int value = 10000000;
    int value2 = 1_000_000;
    // int maxIntegar = 2_200_000_000;
    // int miniIntegar = 

    // !byte -128 to 127 
    byte b1 = -128;
    byte b2 = 127;

    // !short -32768 to 32767
    short s1 = -32768;
    short s2 = 32767;

    // !long  
    // 2_147_483_648 -> int value 
    // int value to double value 

    // long l1 = 2147483648
     long l1 = 2147483648L;

    // ! declare a hardcode long value, you should always add L

    // float = double 
    double d1 = 10.2; // 10.2 = double value 
    double d2 = 10.2d; // 10.2d = double value 
    float f1 = 10.2f;// 10.2f = float value 
    
      char c = '!';
      char c2 = '1';
      char c3 = ' '; // atleast 1 character


      // boolean 
     boolean b = true;
     boolean b10 = false;

     boolean isSmoker = false;
     int age = 68;
     boolean isElderly = age > 67; 
     System.out.println(true);

     int age2 = 18;
     boolean isadult = age >= 18;
     System.out.println(isadult);










} 
}



   
    
    