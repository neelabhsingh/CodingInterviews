/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public class NumbersOccurringOnlyOnce {
    public static void main(String [] args){
        Numbers num=new Numbers();
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int [] array=new int[size];
        for(int i=0;i<size;i++){
            int data=scan.nextInt();
            array[i]=data;
        }
        getOnce(array,num);
        System.out.println("num1="+num.num1+", num2="+num.num2);
    }
    public static void getOnce(int [] array, Numbers num){
        int n=array.length;
        int resultXor=0;
        for(int i=0;i<n;i++){
            resultXor^=array[i];
        }
       
        int index1=findIndexofFirstSetBitfromRight(resultXor);
        
        for(int i=0;i<n;i++){
            boolean result=isSetBitSamePosition(array[i], index1);
            
            if(isSetBitSamePosition(array[i], index1))           
                num.num1=num.num1^array[i];
            else
                num.num2=num.num2^array[i];
        }
        
    }
    public static boolean isSetBitSamePosition(int num, int index){
        num=num>>index;
        return (num&1)==1;
    }
    public static int findIndexofFirstSetBitfromRight(int num){
        int index=0;
        int mask=1;
       
        while(index<32 && (num&mask)==0){
            index++;
            mask=1<<index;
        }
        return index;
    }
}
class Numbers{
    int num1;
    int num2;
}
