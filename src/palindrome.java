class ListNode6 {
    int val;
    ListNode6 next;
    ListNode6() {}
    ListNode6(int val) { this.val = val; }
    ListNode6(int val, ListNode6 next) { this.val = val; this.next = next; }
}

public class palindrome {
// function to find middle of the list
    private ListNode6 findMiddle(ListNode6 head) {
        ListNode6 slow = head;
        ListNode6 fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
 // function to reverse the list
    private ListNode6 reverseList(ListNode6 head) {
        ListNode6 prev = null;
        while (head != null) {
            ListNode6 next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
 // function to check whether the list is palindrome or not
    public boolean isPalindrome(ListNode6 head) {
        if (head == null || head.next == null) return true;

        ListNode6 middle = findMiddle(head);
        ListNode6 secondHalf = reverseList(middle.next);

        ListNode6 p1 = head;
        ListNode6 p2 = secondHalf;

        while (p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a palindrome list: 1 -> 2 -> 2 -> 1
        ListNode6 node4 = new ListNode6(1);
        ListNode6 node3 = new ListNode6(2, node4);
        ListNode6 node2 = new ListNode6(2, node3);
        ListNode6 node1 = new ListNode6(1, node2);

        palindrome obj = new palindrome();
        boolean result = obj.isPalindrome(node1);
        System.out.println("Is Palindrome? " + result);
    }
}
