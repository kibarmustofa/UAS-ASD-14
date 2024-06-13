class Node {
    Kendaraan kendaraan;
    Node next;

    public Node(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    
    public void append(Kendaraan kendaraan) {
        Node newNode = new Node(kendaraan);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.kendaraan);
            current = current.next;
        }
    }
}
