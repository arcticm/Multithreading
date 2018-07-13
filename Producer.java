import java.io.IOException;
import java.util.Scanner;

public class Producer implements Runnable {
    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }
    
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        while (!number.equals("exit")) {
            if (Numbers.isCorrectInput(number)) {
                queue.add(number);
            }
            else {
                System.out.println("Input is incorrect!");
            }
            number = scanner.nextLine();
        }
    }

}