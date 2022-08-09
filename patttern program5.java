//print half inverted pattern 
/*
output:
    *
   **
  ***
*****

      
*/
package star;
import java.util.*;
/**
 *
 * @author akshay
 */
public class Star {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter number:");
int n=sc.nextInt();
    for(int i=1;i<=n;i++){//this for loop is for print row
        for(int j=1;j<=n-i;j++){//this part is for print space
           System.out.print(" ");
}
    for(int j=1;j<=i;j++){//this part is for print column
         System.out.print("*");
}
System.out.println();
}
}
}
