import java.math.BigDecimal;

/**
 * Input: arrivalTime = 15, delayedTime = 5
 * Output: 20 
 * Explanation: Reach at 15+5 = 20 (20:00).
 *
 */
public class Arrivaltimecalcucate{

  private double arrivalTime;
  private double delayedTime;

  public Arrivaltimecalcucate (double arrivalTime , double delayedTime) {
    this.arrivalTime = arrivalTime;
    this.delayedTime = delayedTime;
  }
  
  public static double Arrivaltimecalcucate(double arrivalTime, double delayedTime) {
         return  BigDecimal.valueOf(arrivalTime).add(BigDecimal.valueOf(delayedTime)).doubleValue();

  }
  

  public static void main(String[] args) {
 
    Arrivaltimecalcucate a= new Arrivaltimecalcucate(15.00,5.00);
    Arrivaltimecalcucate b = new Arrivaltimecalcucate(23.00, 5.00); 
    Arrivaltimecalcucate c = new Arrivaltimecalcucate(18.00, 6.00); 
    System.out.println(a.Arrivaltimecalcucatec());
  } }


