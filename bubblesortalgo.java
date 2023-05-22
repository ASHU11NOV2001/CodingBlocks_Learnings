import java.util.*;
public class bubblesortalgo {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the size of array");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= scanner.nextInt();
        }
        algo(arr);
    }
    public static void algo(int A[]){
        for(int i=0;i<A.length-1;i++){
            for(int j=0;j<A.length-1-i;j++){
                if(A[j]>A[j+1])
                  swap(A,j,j+1);
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
    }
    public static void swap(int A[], int B, int C){
        int temp=A[B];
        A[B]=A[C];
        A[C]=temp;
    }

}
