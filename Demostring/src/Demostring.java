public class Demostring {
public static void main(String[] args)  {
        System.out.println("Hello, World!");

         String s5 = "ha,yo,la,po,fd,fd,f,f,f,f,f,f,f,f,f,f,f,f,f,f,f,f)";
         boolean isEmpty = s5.length() == 0;
         System.out.println(isEmpty);
         System.out.println(s5.isEmpty());

         

          s5.substring(0,20);
          System.out.println(s5);
          System.out.println(s5.substring(5,s5.length()));

          for (int i = 0; i < 5; i++) { 
            System.out.println(i);
          }
          for (int i = 0; i < 100; i++) 
            if (i % 25 == 0)  
              System.out.println(i);
            

         }
        }



        
    
 
