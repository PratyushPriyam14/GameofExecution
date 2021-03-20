import java.io.*;
import java.util.*;
public class GameOfExecution{
  public static void main(String []args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    System.out.println(killing(n,k));
  }
  public static int  Killing(int n,int k){
    if(n==1){
      return 0;
    }
    int sonm1 = killing(n-1,k); //here sonm1 is surviveing number of n-1 ; recursion have faith that it will give result then we have to transform that (y=(x+k)%n)
    int y=(sonm1+k)%n;
    return y;
  }
}
    
