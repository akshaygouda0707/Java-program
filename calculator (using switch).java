//calculator using button (switch and if-else condition)
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
        System.out.print("enter a:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
System.out.print("enter b:");
int b=sc.nextInt();
System.out.print("enter operator:");
int operator=sc.nextInt();

switch(operator){
  case 1:System.out.println(a+b);
    break;
     case 2:System.out.println(a-b);
    break;
 case 3:System.out.println(a*b);
    break;
case 4:if(b==0){
System.out.println("invalid divisoin");
}else{
System.out.println(a/b);
}
break;
case 5:if(b==0){
System.out.println("invalid divisoin");
}else{
System.out.println(a%b);
}
break;
 default:System.out.println("invalid operator");
 }
}
}

