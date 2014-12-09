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
public class Question88SumInSequenceforThree {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int [] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        boolean result=hasTripleWithSumZero(array);
        if(result)
            System.out.println("Has Triple With Sum zero");
        else
            System.out.println("Has Triple With Sum, not equals to zero");
    }
    public static boolean hasTripleWithSumZero(int [] array){
        boolean found=false;
        if(array.length<3)
            return found;
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            int sum=array[i];
            found=hasPairs(array,-sum, i );
            if(found){
                return found;
            }
        }
        return found;
    }

    private static boolean hasPairs(int[] array, int sum, int excludeIndex) {
        boolean found=false;
        int start=0;
        int end=array.length-1;
        while(start<end){
            if(start==excludeIndex){
                start++;
            }
            else if(end==excludeIndex){
                end--;
            }
            int currentSum=array[start]+array[end];
            if(currentSum==sum){
                found=true;
                break;
            }
            else if(currentSum> sum){
                end--;
            }
            else
                start++;
        }
        return found;       
    }
}
