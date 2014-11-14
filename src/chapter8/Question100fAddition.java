/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public class Question100fAddition {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int carry=0;
        int sum=0;
        while(num2!=0){
            sum=num1^num2;
            carry=(num1&num2)<<1;// Parenthesis is important because  priority of shift operation is greater than &,^,!
            num1=sum;
            num2=carry;
        }
        System.out.println("Sum of num1 and num2="+sum);
    }
}
