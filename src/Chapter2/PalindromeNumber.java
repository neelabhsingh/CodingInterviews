/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public class PalindromeNumber {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        boolean result=isPalindromeNumber(number);
        if(result)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }
    public static boolean isPalindromeNumber(int number){
        int reverseNumber=0;
        int temp=number;
        while(temp!=0){
            reverseNumber=reverseNumber*10+temp%10;
            reverseNumber=reverseNumber/10;
        }
        return (number==reverseNumber)? true:false;
    }
}
