/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codinginterview;
import java.util.*;
/**
 *
 * @author Neelabh
 */
public class NumberOf1DigitsAppears {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String number=scan.next();
        System.out.println(NumberOfIinString(number));
        
    }
    public static int NumberOfIinString(String number){
        
        int length=number.length();
        int first=number.charAt(0)-'0';
        if(length==1 && first==0)
            return 0;
        if(length==1 && first>=1)
            return 1;
        
        int numFirstDigit=0, numOtherDigit=0, numRecursive=0;
        if(first>1){
            numFirstDigit=(int)Math.pow(10,length-1);
            
        }
        else if(first==1){
            numFirstDigit=Integer.parseInt(number.substring(1, length))+1;
            
        }  
        numOtherDigit=first*(length-1)*((int)Math.pow(10,length-2));
        System.out.println("Other Digit= "+numOtherDigit);
        numRecursive=NumberOfIinString(number.substring(1, length));
        return numFirstDigit+numOtherDigit+numRecursive;
    }    
}
