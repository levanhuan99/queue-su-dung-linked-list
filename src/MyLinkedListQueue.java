public class MyLinkedListQueue {

    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public MyLinkedListQueue(){

    }
    public void enqueue(int element){
        if (head==null){
            this.head=this.tail=new Node(element);
            return;
        }
        else {
            Node temp=new Node(element);
            this.tail.next=temp;
            this.tail=temp;
        }
    }
    public Node dequeue(){

        if (this.head==null){
            return null;
        }
        else {
            Node temp=this.head;
            this.head=this.head.next;
            if (this.head==null){
                this.tail=null;
            }
            return temp;
        }

    }





    //    public class Node{
//        public Node next;
//        public int key;
//        public Node(int key){
//            this.key=key;
//            this.next=null;
//        }
//    }
//    private Node head;
//    private Node tail;
//    public MyLinkedListQueue(){
//        this.head=null;
//        this.tail=null;
//    }
//    public void enqueue(int key){
//        Node temp=new Node(key);
//        if (this.tail==null){
//            head=tail=temp;
//            return;
//        }
//        this.tail.next=temp;
//        this.tail=temp;
//    }
//    public Node dequeue(){
//        if (this.head==null){
//            return null;
//        }
//        Node temp=this.head;
//        this.head=this.head.next;
//        if (this.head==null){                   //tại sao lại this.head==null?
//            this.tail=null;
//        }
//
//        return temp;
//
//    }

}
