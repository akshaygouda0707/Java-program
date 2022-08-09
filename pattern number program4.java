//print number pattern 
/*
output:
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

      
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
    for(int i=1;i<=n;i++){
//this for loop is for print row
for(int j=1;j<=i;j++){//this part is for print column
int sum=i+j;
if(sum%2==0){
System.out.print("1 ");
}else{
System.out.print("0 ");
}
}
System.out.println();
}
}
}
