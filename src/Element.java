/**
 * @author Sergey Evdokimov (evsese@gmail.com) 08.04.14
 */

public class Element {
    private int itemId;
    private int groupId;

    public Element(int itemId, int groupId) {
        this.itemId = itemId;
        this.groupId = groupId;
    }

    public int getItemId() {
        return itemId;
    }

    public int getGroupId() {
        return groupId;
    }
}