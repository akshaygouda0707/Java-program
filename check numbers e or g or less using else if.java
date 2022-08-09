//print age : check whether num is  equal/greater/lesser than other number using (else if)
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
        System.out.print("enter number1:");
    Scanner sc=new Scanner(System.in);
    int number1=sc.nextInt();
       System.out.print("enter number2:");
    int number2=sc.nextInt();
if(number1==number2){
    System.out.println("number1 is equal to number2");
}
else if(number1>number2){
    System.out.println("number1 is greater than number2");
}else{
System.out.println("number1 is lesser than number2");
}
    }
 }

