import java.util.PriorityQueue;
import java.util.*;

public class BlockingQueue {

    Comparator<String> comparator = Comparator.comparingInt(Numbers::parsingToInt);
    private PriorityQueue<String> numbers = new PriorityQueue<String>(comparator);

    public int size() {
        return numbers.size();
    }

    public synchronized void add(String stringOfNumbers){
        numbers.add(stringOfNumbers);
        notifyAll();
    }

    public synchronized String getMin() throws InterruptedException {
        return numbers.poll();
    }
    

}