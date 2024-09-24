package rohh;

public class SinglyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;


    public void printLL(){
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void insertBegin(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node tempNode = head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    public void deleteBegin(){
        if(head == null){
            System.out.println("LL is Empty >< ");
            return;
        }
        head = head.next;
    }

    public void deleteEnd(){
        if(head == null){
            System.out.println("LL is Empty ><");
            return;
        }
        if(head.next ==null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertBegin(89);
        ll.insertBegin(67);
        ll.insertEnd(56);
        ll.insertEnd(78);
        ll.insertBegin(222);
        ll.deleteBegin();
        ll.deleteEnd();
        ll.printLL();
    }
}
