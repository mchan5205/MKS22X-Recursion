import java.util.ArrayList;
public class recursion{
  public static void main(String args[]){
    System.out.println(sqrt(100, 0.01));
    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(5));
    System.out.println(makeAllSums(3));
  }
  public static double sqrt(double n, double tolerance){
    return sqrth(n, tolerance, 1);
  }
  private static double sqrth(double n, double tolerance, double guess){
    if (Math.abs((guess * guess - n) / n) > tolerance){
      return sqrth(n, tolerance, (n / guess + guess) / 2);
    }
    else{
      return guess;
    }
  }
  public static int fib(int n){
    return fibh(n,0,1);
  }
  private static int fibh(int n, int old, int newnum){
    int temp = old + newnum;
    if (n == 0){
      return old;
    }
    else{
      return fibh(n - 1, newnum, temp);
    }
  }
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> newary = new ArrayList<>();
    sumsh(n, 0, newary);
    return newary;
  }
  private static void sumsh(int n, int count, ArrayList<Integer> ary){
    if (n == 0){
      ary.add(count);
    }
    else{
      sumsh(n - 1, count + n, ary);
      sumsh(n - 1, count, ary);
    }
  }
}
