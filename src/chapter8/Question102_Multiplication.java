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
public class Question102_Multiplication {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);   
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int result=0;
        int i=1;
        while(num1!=0){
            if((num1&1)!=0){
                result+=num2;
            }
            num2<<=1;
            num1>>=1;
        }
        System.out.println("result="+result);
    }
}
