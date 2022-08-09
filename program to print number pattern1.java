//print number pattern 
/*
output:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5

      
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
    for(int j=1;j<=i;j++){//this part is for print column
    System.out.print(j+" ");
}
System.out.println();
}
}
}
