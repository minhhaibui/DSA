package LinkedList;

public class RunClass {
    public static void main(String[] args) {
        LinkListManual<String> ll = new LinkListManual<>();
        ll.addFirst("a");
        ll.addFirst("b");
        ll.addFirst("c");
        ll.addFirst("d");
        ll.addFirst("e");
        ll.addFirst("f");
        ll.addFirst("g");

        System.out.println("before_________________\n");
        ll.traverse();

        System.out.println("\nafter_________________\n");
        ll.pushEnd("end");
        ll.traverse();
        System.out.println("\nafter_________________\n");
        ll.popEnd();
        ll.traverse();

    }
}
