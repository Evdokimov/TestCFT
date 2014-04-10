import java.util.Random;

/**
 * @author Sergey Evdokimov (evsese@gmail.com) 10.04.14
 */
public class Adding extends Thread{

    private final int GROUP_COUNT = 50;

    @Override
    public void run() {
        int[] itemsCount = new int[GROUP_COUNT];
        while (!Main.finish){
            int i = new Random().nextInt(GROUP_COUNT);
            itemsCount[i]++;
            Queue.addToQueue(new Element(itemsCount[i], i + 1));
        }
    }
}
