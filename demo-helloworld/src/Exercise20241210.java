public class Exercise20241210 {
  public static void main(String[] args) {
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;

    // ...    
    // System.out.println(totalAmount); // 

    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;

    // System.out.println(averageScore); // 64.66666

    // byte -> short -> int -> long
    byte maxByte = 127;

    // int value -> byte
    maxByte = (byte) (maxByte - 2); // Java: is it safe? Not safe
    // byte value + int value -> int value
    // can we assign int value to byte variable? (downcasting)

    System.out.println(maxByte); // 125, overflow

    int x = maxByte; // Java: is it safe? it is safe



    // ! Java: (1) Compile time + (2) Run time
    // (1) java file (.java) -> class file (.class): java code -> byte code (~machine)
      // (1.1) compile fail. for example (missing ; -> syntax error)
      // (1.2) compile success -> class file
    // (2) Java Virtual Machine (JVM) -> convert class file to machine code -> execute machine code

  }
}