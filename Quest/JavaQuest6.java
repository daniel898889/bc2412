public class {
        public int findPermutationDifference(String s, String t) {
            String s = "abc";
            String t = "bac";
            int count = 0;
         
            for (int i = 0; i <s.length(); i++){
               count += Math.abs(i - t.indexOf(s.charAt(i)));
            } return count;
              
              int lucky6 = new int [100];
              int count = 0;
              int number = 0;
              while (count < 100){
                number = new Random().nextInt(49)+1;
                
                    lucky6[count]=number;
                    count++;
                }
                System.out.println(Arrays.toString(lucky6));

             
        }
}