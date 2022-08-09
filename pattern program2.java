//print pattern 
/*
output:
******
*    *
*    *
******
      
*/
package star;

/**
 *
 * @author akshay
 */
public class Star {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for(int i=1;i<=4;i++){
          for(int j=1;j<=5;j++){
         if(i==1||j==1||i==4||j==5){
        System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}
}
}