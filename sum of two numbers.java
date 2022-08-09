S//write program to print sum of 2 variables taking from users;
package variable;
import java.util.*;
/**
 *
 * @author akshay
 */
public class Variable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a:");
    int a=sc.nextInt();
System.out.print("enter b:");
    int b=sc.nextInt();
int sum=a+b;
      System.out.println("sum is:"+sum );
    }
}
