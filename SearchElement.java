//To search the element in the Linked List
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

class LinkedList {
    private static Node convertLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int search(Node head, int k) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == k) {
                return temp.data;
            }
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        Node head = convertLL(arr);
        System.out.print(search(head, 4));
    }
}
