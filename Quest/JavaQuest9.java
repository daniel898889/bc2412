package Quest;
/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";
    System.out.println(str.charAt(15));
    System.out.println(str.charAt(1));
    System.out.println(str.indexOf("t"));
    System.out.println(str.indexOf("x"));
    System.out.println(str.indexOf("L"));
    String abc = "ab  c";
    System.out.println(abc);
    System.out.println("venturenixLAB".concat(", Coding"));
    System.out.println("VenturenixLAB,Coding".indexOf("g"));
    System.out.println(str.charAt(5) + "en");
    System.out.println("venturenixLAB".toUpperCase().concat(", JAVA"));
    System.out.println("venturenixLAB".toLowerCase().concat(", java"));
    System.out.println(str.replace("e","*").toUpperCase().concat("!!!"));
    System.out.println(str.concat("coding king =  [vincent gor]!!!!!!!"));

    
    

  }}
