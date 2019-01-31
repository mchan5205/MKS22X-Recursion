public class recursion{
  public static double sqrt(double n, double tolerance){
    return sqrth(n, tolerance, n / 2);
  }
  private static double sqrth(double n, double tolerance, double guess){
    if ((n - guess * guess) / n < tolerance){
      return sqrth(n, tolerance, (n / guess + guess) / 2);
    }
    else{
      return guess;
    }
  }
}
