import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Sergey Evdokimov (evsese@gmail.com) 10.04.14
 */
public class Queue {

    public static ConcurrentHashMap<Integer, ConcurrentLinkedQueue<Element>> queue = new ConcurrentHashMap<Integer, ConcurrentLinkedQueue<Element>>();
    public static ConcurrentLinkedQueue<Integer> groupsQueue = new ConcurrentLinkedQueue<Integer>();

    public static void addToQueue(Element element){
        queue.putIfAbsent(element.getGroupId(), new ConcurrentLinkedQueue<Element>());
        queue.get(element.getGroupId()).add(element);
    }

    public static synchronized int getGroup() {
        if (groupsQueue.isEmpty()){
            synchronized (Queue.class){
                groupsQueue.addAll(queue.keySet());
            }
        }
        return groupsQueue.poll();
    }
}