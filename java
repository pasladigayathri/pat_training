DATA STRUCTURES::


class Node{
    int data;//to store data
    Node next;//to store next address
    public Node(int value){//automatically executes when obj is creted--constructor
        this.data=value;
        next=null;
    }
}
class Linkedlist{
    public Node addEleAtStart(Node head,int data){
        Node new_node=new Node(data);
        Node temp=head;
        head=new_node;
        head.next=temp;
        return head;
    }
    public void add(Node head,int data){
        Node new_node=new Node(data);
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=new_node;
    }
    public void delete(Node head){
        Node cur=head;
        while(cur.next.next!=null){
            cur=cur.next;
        }
        cur.next=null;
    }
    public void print(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
	    Linkedlist LL=new Linkedlist();
	    Node head=new Node(10);
	    LL.add(head,20);
	    LL.add(head,30);
	    LL.add(head,40);
	    LL.add(head,50);
	    LL.print(head);
	    LL.delete(head);
	    LL.print(head);
	    head=LL.addEleAtStart(head,60);
	    LL.print(head);
	}
}
