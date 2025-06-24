class  ListNode{
    int data;
    ListNode next;
    ListNode(int newdata){
        this.data=newdata;
        this.next=null;
    }
}


public class middle {
    public ListNode middleNode(ListNode head) {
    ListNode fast=head;
    ListNode slow=head;
    while(fast !=null && fast.next !=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow;
    }
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4); node4.next = node5;
        ListNode node3 = new ListNode(3); node3.next = node4;
        ListNode node2 = new ListNode(2); node2.next = node3;
        ListNode node1 = new ListNode(1); node1.next = node2;

        middle obj = new middle();
        ListNode middleNode = obj.middleNode(node1);

        System.out.println("Middle Node Value: " + middleNode.data);
    }
}
