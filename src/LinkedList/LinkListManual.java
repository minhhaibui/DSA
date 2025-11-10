package LinkedList;

public class LinkListManual <T> {
    private Node<T> head;

    public LinkListManual() {
        this.head = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
    public void traverse() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNext();
        }
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<>();
        newNode.setValue(value);
        newNode.setNext(head);
        head = newNode;
    }
    public void popFirst() {
        if (head != null) {
            head = head.getNext();
        }
    }
    public void pushEnd(T value) {
        Node<T> newNode = new Node<>();
        newNode.setValue(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (true) {
            temp = temp.getNext();
            if(temp.getNext() == null){
                temp.setNext(newNode);
                   break;
            }
        }
    }
    public void popEnd() {
        if (head == null) {
            return;
        }

        Node<T> temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);
    }
}
