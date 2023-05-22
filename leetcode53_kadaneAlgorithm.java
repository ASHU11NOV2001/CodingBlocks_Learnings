import java.util.*;
public class leetcode53_kadaneAlgorithm {
public static void main(String args[]){
  Scanner scanner=new Scanner(System.in);
  int size=scanner.nextInt();
  int[] arr=new int[size];
  for(int i=0;i<arr.length;i++){
      arr[i]=scanner.nextInt();
  }
  int maximumsum=Maximum_Subarray_sum(arr);
  System.out.print(maximumsum);
}
public static int Maximum_Subarray_sum(int A[]){
    int maxsum=Integer.MIN_VALUE;
    int currsum=0;
    for(int i=0;i<A.length;i++){
        if(currsum<0)
            currsum=0;
        currsum+=A[i];
        maxsum=Math.max(currsum,maxsum);
    }
    return maxsum;
}
}
