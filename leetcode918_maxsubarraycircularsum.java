import java.util.*;
public class leetcode918_maxsubarraycircularsum {
}
/* 1. find the normal kadane of the given array.
* 2. find the sum of the given array.
* 3. reverse the signs of all the elements of the array
* 4. fidn the kadane of the reverse array
* 5.find the sum+reversekadane
* 6. if sum+rev==0
* return kadane
* else return the maximum of kadane and reverse of kadane */