//To simulate a ticking window where customers are served on first come first serve basis
import java.util.Queue;
import java.util.LinkedList;

public class Prog2 {
    public static void main(String[] args) {
        Queue<String> tq=new LinkedList<>();
        //enqueue
        tq.offer("Vinay");
        tq.offer("Farhan");
        tq.offer("Amit");
        tq.offer("Manisha");
        tq.offer("Joseph");
        System.out.println("person in queue are : "+tq);
        System.out.println("No of person in queue are : "+tq.size());

        //issue ticket to each person
        while(!tq.isEmpty()) {
            System.out.println("Person "+tq.peek()+"is being issued the ticket");
            tq.poll();  //[person leaves the queue
            System.out.println("Person in queue are : "+tq);
        }
        System.out.println("No of person in queue are : "+tq.size());

    }
}      
