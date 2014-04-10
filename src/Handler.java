/**
 * @author Sergey Evdokimov (evsese@gmail.com) 08.04.14
 */

public class Handler extends Thread{

    @Override
    public void run() {
        while (!Main.finish){
            int groupId = Queue.getGroup() ;
            if (!Queue.queue.get(groupId).isEmpty()){
                Element element = Queue.queue.get(groupId).poll();
                handler(element.getItemId(), element.getGroupId());
            }
        }
    }

    public static void handler(int itemId, int groupId){
        System.out.println("itemId = " + itemId + " ," + "groupId = " + groupId);
    }
}
