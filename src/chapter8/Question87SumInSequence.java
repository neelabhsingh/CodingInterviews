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
public class Question87SumInSequence {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int [] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        int sum=scan.nextInt();
        boolean result=hasPairWithSum(array, sum);
        if(result){
            System.out.println("For given sum pairs are present");
        }
        else
            System.out.println("For given sum parys are not present");
    }
    public static boolean hasPairWithSum(int [] array, int sum){
        boolean found=false;
        int start=0;
        int end=array.length-1;
        int currentSum=0;
        while(start<end){
            currentSum=array[start]+array[end];
            if(currentSum==sum){
                found=true;
                break;
            }
            if(currentSum>sum)
                end--;
            else
                start++;
        }
        return found;
    }
}

