import java.util.*;
public class leetcode75_DutchNationalFlagAlgorithm {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        sort(arr);

    }
    public static void sort(int A[]){
        int i=0;
        int k=0;
        int j=A.length-1;
        while(k<=j){
            if(A[k]==0){
                int temp=A[i];
                A[i]=A[k];
                A[k]=temp;
                i++;
                k++;
            }
            else if(A[k]==1)
                k++;
            else{
                int temp=A[k];
                A[k]=A[j];
                A[j]=temp;
                j--;
            }
        }
        for(int l=0;l<A.length;l++){
            System.out.print(A[l]+" ");
        }
    }
}
