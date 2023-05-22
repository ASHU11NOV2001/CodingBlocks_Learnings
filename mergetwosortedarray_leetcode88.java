import java.util.*;
public class mergetwosortedarray_leetcode88 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int size1=scanner.nextInt();
        int[] arr=new int[size1];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int size2=scanner.nextInt();
        int[] arr2=new int[size2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]= scanner.nextInt();
        }
        merger(arr,arr2);

    }
    public static void merger(int A[], int B[]){
        int[] C=new int[A.length+B.length];
        int i=0;
        int j=0;
        for(int k=0;k<C.length;k++){
            if(i<A.length && j<B.length){
            if(A[i]<B[j]){
                C[k]=A[i];
                i++;
            }
            else{
            C[k]=B[j];
                j++;
            }
            }
        }
        for(int z=0;z<C.length;z++){
            System.out.print(C[z]+" ");
        }
    }
}
