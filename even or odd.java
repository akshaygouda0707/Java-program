//print age : check whether number is even or odd
package conditions;

import java.util.*;

/**
 *
 * @author akshay
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("enter number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
if(number%2==0){
    System.out.println("even number");
}
else{
System.out.println("odd number");
}
    }
    
}
