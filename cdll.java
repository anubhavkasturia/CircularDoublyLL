public class cdll{
    private class Node{
        int data;
        Node next;
        Node prev;
    }
    private Node head;
    
    private int size;


public int size(){
    return size;
}
public boolean isEmpty(){
 return size == 0;
}
public void insertAtLastorBeforeHead(int data){
    Node node=new Node();
    node.data=data;
    if(head==null){
        head=node;
        head.next=head;
        head.prev=head;
        size++;
    }else{
    node.next=head;
    
    Node temp=head;
    while(temp.next!=head){
        temp=temp.next;
    }
    temp.next=node;
    node.prev=temp;
    head.prev=node;
    size++;
}

}
public void display(){
    if(head==null){
        System.out.println("List is Empty");
    }else{
        Node temp=head;
    
    do{
        System.out.println(temp.data);
        temp=temp.next;

    }while(temp!=head);
}
}
public void reversedisplay(){
    Node holder=head.prev;
    Node temp=holder;
    do{
        System.out.println(temp.data);
        temp=temp.prev;

    }while(temp!=holder);
    
    }
    public int getAt(int i)throws Exception{
        if(i>=this.size || i<0){
            throw new Exception("Index out of bounds");
    
        }else if(this.size==0){
            throw new Exception("Linked List is empty");
        }
            Node node=this.head;
            for(int j=0;j<i;j++){
                node=node.next;
            }
            return node.data;
        
    
       }
       public Node getNodeAt(int i)throws Exception{
        if(i>=this.size || i<0){
            throw new Exception("Index out of bounds");
    
        }else if(this.size==0){
            throw new Exception("Linked List is empty");
        }
            Node node=this.head;
            for(int j=0;j<i;j++){
                node=node.next;
            }
            return node;
        
    
}


}