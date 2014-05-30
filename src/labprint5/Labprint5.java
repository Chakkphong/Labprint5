/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labprint5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Labprint5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keybord=new Scanner(System.in);
        System.out.print("A = ");
        int A = keybord.nextInt();
        System.out.print("B = ");
        int B = keybord.nextInt();
        if (B<A) {
            for (int i = B; i <= A; i++) {
            System.out.print("  "+i);
        }
        }
        else if(A<B){
            for (int i = A; i <= B; i++) {
            System.out.print("  "+i);
        }
        }
        
    }
    
}
