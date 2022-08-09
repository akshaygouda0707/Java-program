//print age : check whether he/she is audult or not
package conditions;

import java.util.*;

/**
 *
 * @author aksha
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("enter age:");
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
if(age>=18){
    System.out.println("adult");
}
else{
System.out.println("not adult");
}
    }
    
}
