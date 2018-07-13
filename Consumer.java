public class Consumer extends Thread {
    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            while (true) {
                if (queue.size() != 0) {
                    System.out.println(queue.getMin());
                }
                Thread.sleep(5000);
            }
        }catch (InterruptedException e) {
            System.out.println("Extracting the elements is interrupted!");
        }
    }
}