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
public class Question83 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int [] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        int number=scan.nextInt();
        Arrays.sort(array);
        int totalNumberofOccurance=numberOfOccurance(array,number);
        System.out.println("totalNumberofOccurace="+totalNumberofOccurance);
    }   
    public static int numberOfOccurance(int [] array, int mumber){
        int start=0;
        int end=array.length-1;
        int firstIndex=getFirst(array, start, end, mumber);
        int lastIndex=getLast(array, start, end, mumber);
        int count=-1;
        if(firstIndex>-1 && firstIndex>-1 ){
            count=lastIndex-firstIndex+1;
        }
        return count;
    }
    public static int getFirst(int [] array, int start,int end, int number){
        if(start>end)
            return -1;
        int middle=start+(end-start)/2;
        if(array[middle]==number){
            if(middle==0 || array[middle-1]!=number){
                return middle;
            }
            end=middle-1;
        }
        else if(array[middle]>number)
            end=middle-1;
        else
            start=middle+1;
        return getFirst(array, start,end, number);
    }
    public static int getLast(int [] array, int start, int end, int number){
        if(start>end)
            return -1;
        int middle=start+(end-start)/2;
        if(array[middle]==number){
            if(middle<array.length-1 && array[middle+1]!=number || middle==array.length-1){
                return middle;
            }
            start=middle+1;
        }
        else if(array[middle]<number)
            start=middle+1;
        else
            end=middle-1;
        return getLast(array,start,end, number);
    }
}
