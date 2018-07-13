public class Main {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue = new BlockingQueue();
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}