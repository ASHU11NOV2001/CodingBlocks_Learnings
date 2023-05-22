import java.util.*;
public class selection_sort_Algo {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the size of array");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        algo(arr);
    }
  /* In selectionsort we take the number of the smallest index then compare it with all the elements to its right the smallest
     possible number is swaped at the smallest index... then we take the second smallest index number and then we compare it
     with all  the number to its right this continues till the second max index after which all the numbers are sorted in
     ascending order ...if we want to order them in descending order we can do it by reversing the array after it is sorted in

    */

    public static void algo(int A[]){
        for(int i=0;i<A.length-1;i++){
            int min=i;
            for(int j=i+1;j<A.length;j++){
                if(A[j]<A[min])
                    swap(A,j,min);
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
    }
    public static void swap(int A[],int a,int b){
        int temp=A[b];
        A[b]=A[a];
        A[a]=temp;
    }
}
