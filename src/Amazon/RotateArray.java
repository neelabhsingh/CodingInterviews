/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon;

/**
 * please check all code
 * @author Neelabh
 */
// This rotate matrix by 90 degree clock wise, 
import java.util.*;
public class RotateArray {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int M=scan.nextInt();
        int N=scan.nextInt();
        int [][] arr=new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        printMatrix(arr); 
        int [][] result=rotateMatrix(arr);
        printMatrix(result);
    }
    public static int [][] rotateMatrix(int [][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        int [][]newMatrix=new int[col][row];// This is very important to note tha
        // if matrix is not square then we require make new matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               newMatrix[j][row-1-i]=matrix[i][j];
            }
        }
        return newMatrix;
    }
    public static void printMatrix(int [][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
