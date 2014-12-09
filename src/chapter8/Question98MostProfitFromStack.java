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
/*
    Stock prices are stored in an array in order of date. How do you get the 
    most profit from a stack prices.
*/
import java.util.*;
public class Question98MostProfitFromStack {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int [] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        if(array.length<2)
            System.out.println("Not possible");
        int min=array[0];
        if(array[1]<min)
            min=array[1];
        int maxDiff=array[1]-min;
        for(int i=2;i<size;i++){
            if(array[i]<min)
                min=array[i];
            if(array[i]-min>maxDiff){
                maxDiff=array[i]-min;
            }
        }
        System.out.println("Maximum profit="+maxDiff);
    }
}
