/*This is binarysearch algorithm used in sorted array to find a specific number index or the number itself from the array
the time complexity of the binary search algorithm is log(n) . */

import java.util.*;
public class binarysearchalgorithm {
  public static void main(String args[]){
  Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter the size of array");
    int size=scanner.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
     arr[i]=scanner.nextInt();
    }
    System.out.println("please enter the number you want to search in a sorted array");
    int num=scanner.nextInt();
    algorithm(arr,num);
  }
  public static void algorithm(int A[],int B){
   int start=0;
    int end=A.length;
    while(start<=end){
     mid=start+(end-start)/2;
      if(A[mid]==B)
        System.out.println("number is at index "+mid);
      else if(A[mid]<B)
        start=mid+1;
      else
        end=mid-1;
    }
  }
}
