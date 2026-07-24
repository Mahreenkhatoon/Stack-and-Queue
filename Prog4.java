//Determine kth largest element in given araay of integers without sorting the array
//so the solution is using min heap concept.
//logic -Add 1 by 1 element from array to priority queue as log as size of priority queue <=k
//when the size of priority queue exceeds k, remove the root and again continue to add.
//After all element of array are added to priority queue,peek to get kth largest element
//EX: i/p {12,0,-67,100,244,17,90,28} k=3 o/p=90

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        int nos[]= {12,0,-67,100,244,17,90,28};
        System.out.println("Given  nos[] contain"+Arrays.toString(nos));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for k i.e to get kth largest element: ");
        int k=sc.nextInt();

        System.out.println(k+"th largest element in nos[] is "+getKthLargestElement(nos,k));
    }
    static int getKthLargestElement(int []nos,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //iterate in nos[] and add 1 by 1 element in pq
        for(int no:nos){
            pq.offer(no);
             if(pq.size()>k)
                pq.poll();
        }
        return pq.peek();

    }
    
}
