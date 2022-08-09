//write program to print the parameter of rectangle by taking input from user;
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
int parameter=a+b;
    System.out.println("paremeter of the rectangle is:"+parameter);
    }
}
