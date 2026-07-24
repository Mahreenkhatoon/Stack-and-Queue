//To prove that Priority Queue by deafult implement Min Heap 
//In min heap, element are not ordered in ASC order bot if removed, will
//display the element in ASC order
//Also note that PriorityQueue is not an interface but a container classs and can store elements
import java.util.PriorityQueue;

public class Prog3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(5);
        pq.offer(3);
        pq.offer(8);
        pq.offer(2);
        pq.offer(4);
        System.out.println("pq contain"+pq);
        //start deleting one by one element
        System.out.println("Deleting element from pq");

        while(!pq.isEmpty())
            System.out.print(pq.poll() +" ");  //ASC order

    }
    
}
