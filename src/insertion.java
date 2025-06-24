class Node3{
    int data;
    Node3 next;
    Node3(int newdata){
        this.data=newdata;
        this.next=null;
    }
}

public class insertion {
    // insertion at beginning
    public Node3 insertAtEnd(Node3 head, int x) {
        Node3 newnode=new Node3(x);
       newnode.next=head;
       head=newnode;
     return head;
    }
    public static void main(String[] args) {
        insertion obj = new insertion();
        Node3 head = null;

        head = obj.insertAtEnd(head, 30);
        head = obj.insertAtEnd(head, 20);
        head = obj.insertAtEnd(head, 10);

        Node3 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
