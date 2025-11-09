package LinkedList;

public class RunClass {
    public static void main(String[] args) {
        Person p1 = new Person("le nhat tung1","ba lan");
        Person p2 = new Person("le nhat tung2","duc");
        Person p3 = new Person("le nhat tung3","nga");
        Person p4 = new Person("le nhat tung4","nhat ban");
        Person p5 = new Person("le nhat tung5","han quoc");

        Node<Person> node1 = new Node<>();
        node1.setValue(p1);

        Node<Person> node2 = new Node<>();
        node2.setValue(p2);


        Node<Person> node3 = new Node<>();
        node3.setValue(p3);

        Node<Person> node4 = new Node<>();
        node4.setValue(p4);

        Node<Person> node5 = new Node<>();
        node5.setValue(p5);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);



        Node<Person> head = node1;
        while (head.getNext() != null){
            System.out.println(head.getValue());
            head= head.getNext();
        }
    }
}
