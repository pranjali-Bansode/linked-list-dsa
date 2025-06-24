class Node6 {
    int data;
    Node6 next;
    Node6(int d) {
        data = d;
        next = null;
    }
}

public class newmerge {

    Node6 sortedMerge(Node6 head1, Node6 head2) {
        Node6 dummy = new Node6(-1);
        Node6 curr = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        // Attach remaining nodes
        if (head1 != null) {
            curr.next = head1;
        } else {
            curr.next = head2;
        }

        return dummy.next;
    }

    //  Utility to print linked list
    void printList(Node6 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    //  Main method
    public static void main(String[] args) {
        // First sorted list: 1 -> 3 -> 5
        Node6 l1 = new Node6(1);
        l1.next = new Node6(3);
        l1.next.next = new Node6(5);

        // Second sorted list: 2 -> 4 -> 6
        Node6 l2 = new Node6(2);
        l2.next = new Node6(4);
        l2.next.next = new Node6(6);

        newmerge obj = new newmerge();
        Node6 mergedHead = obj.sortedMerge(l1, l2);

        System.out.print("Merged Sorted List: ");
        obj.printList(mergedHead);
    }
}
