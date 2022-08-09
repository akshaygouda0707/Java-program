//print greeting using button (switch condition)
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
switch(button){
  case 1:System.out.println("hello");
    break;
     case 2:System.out.println("hola");
    break;
 case 3:System.out.println("bounjur");
    break;
 default:System.out.println("invalid");
 }
}
}

