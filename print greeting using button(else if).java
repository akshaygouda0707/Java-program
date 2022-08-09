//print greeting using button (else if)
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
        System.out.print("enter button number:");
    Scanner sc=new Scanner(System.in);
    int button=sc.nextInt();
if(button==1){
    System.out.println("hello");
}
else if(button==2){
    System.out.println("hola");
}else if(button==3){
System.out.println("Bounjur");
}else{
System.out.println("invalid");
}
    }
 }

