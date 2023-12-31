public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //step 1:-create new node
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2:-newNode next=head
        newNode.next=head; //link

        //step 3:- head=newNode
        head=newNode;

    }
    //addLast
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //Add in middle
    public void add(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;

        while(i<idx-1) {
            temp = temp.next;
            i++;
        }
       // i=idx-1; temp->prev;
        newNode.next=temp.next;
        temp.next=newNode;
    }
    //remove in a linked list
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
           return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public void print(){
        if(head==null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
           while(temp!=null){
               System.out.print(temp.data+"->");
               temp=temp.next;
           }
        System.out.println("null");
        }


    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(2,9);
        ll.print();
        ll.removeFirst();
        ll.print();

        System.out.println(ll.size);


    }

}
