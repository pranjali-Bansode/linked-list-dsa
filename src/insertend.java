class Node4{
    int data;
    Node4 next;
    Node4(int newdata){
        this.data=newdata;
        this.next=null;
    }
}

public class insertend {
    // function to inser at the end of the linkedlist
    public Node4 insertAtEnd(Node4 head, int x) {
       Node4 newnode=new Node4(x);
       if(head==null){
           return newnode;
       }
       Node4 temp=head;
       while (temp.next!=null){
           temp=temp.next;
       }
       temp.next=newnode;

     return head;
    }
    public static void main(String[] args) {
        insertend obj = new insertend();
        Node4 head = null;

        head = obj.insertAtEnd(head, 10);
        head = obj.insertAtEnd(head, 20);
        head = obj.insertAtEnd(head, 30);

        Node4 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
