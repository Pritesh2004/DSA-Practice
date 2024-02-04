package practice.basics;

public class DS_LinkedList {

    Node head;
    private int size=0;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void deleteFirst(){
        size--;
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        size--;
        if(head==null){
            System.out.println("The list is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;

    }

    public void reverseListIterative(){
        if(head==null || head.next==null){
            return;
        }

        Node prevNode = head;
        Node currentNode = head.next;
        while (currentNode!=null){
            Node nextNode = currentNode.next;
            currentNode.next=prevNode;

            prevNode = currentNode;
            currentNode=nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseListRecursive(Node head){

        if(head==null || head.next==null){
            return head;
        }

        Node newNode = reverseListRecursive(head.next);
        head.next.next = head;
        head.next=null;

        return newNode;
    }

    public void getSize(){
        System.out.println(size);
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode !=null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DS_LinkedList list = new DS_LinkedList();
        list.addFirst("Pritesh");
        list.printList();
        list.addFirst("Patil");
        list.printList();
        list.addLast("Mahadev");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        list.getSize();

        System.out.println("New LinkeList");
        DS_LinkedList newList = new DS_LinkedList();
        newList.addFirst("a");
        newList.addFirst("b");
        newList.addFirst("c");
        newList.addFirst("d");
        newList.addFirst("e");
        newList.addFirst("f");

        newList.printList();
        newList.reverseListIterative();
//        newList.head=  newList.reverseListRecursive(newList.head);
        newList.printList();
        newList.getSize();




    }
}
