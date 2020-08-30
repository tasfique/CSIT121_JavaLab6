//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 17/06/2019
package labtask6;

import java.util.Scanner;

public class Q3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y = 1;
        double z;
        
        System.out.println("Enter the value of x");
        x = scan.nextInt();
        
        if( x == 0) {
            do {
            System.out.println("x cannot be 0");
            System.out.println("Enter the value of x");
            x = scan.nextInt();
            
            } while(x == 0 );
            
        }
        
        System.out.println("Enter the value of y");
        y = scan.nextInt();
           
        z = power(x, y);
        System.out.println("");
        System.out.println("The output is " +z);
    }
    
    public static double power(int x, int y) {
        if (y>=0) {
            if(y==0) {
                return 1;
            } else if(y==1) {
                return x;
            } else if(y>1) {
                return x* power(x,y-1);
            } else if(y< 0) {
                y *= -1;
                return 1.0 /(x* power(x,y-1));
            }
            
        } return 0;
        
        }

}
 