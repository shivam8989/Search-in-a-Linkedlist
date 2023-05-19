package LinkedList;

public class AddMiddle {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addMiddle(int idx , int data){
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;
        while(i<idx-1){
            temp = temp.next;
            i++;

        }
       newNode.next= temp.next ;
        temp.next = newNode;

    }
    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args []){
        AddMiddle l1 = new AddMiddle();
        l1.addMiddle(1,10);
        l1.addMiddle(3,8);
        l1.print();
    }
}
