public class LinkedList
{
    Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public static LinkedList insert(LinkedList list, int data)
    {
        Node new_node = new Node(data);
        new_node.next=null;
        if(list.head==null)
        {
            list.head=new_node;
        }
        else
        {
            Node cur_node = list.head;
            while(cur_node.next!=null)
            {
                cur_node=cur_node.next;
            }
            cur_node.next=new_node;
        }
        return list;
    }

    public static LinkedList delete(LinkedList list, int element)
    {
        Node cur_node=list.head;
        Node prev_node=cur_node;
        while(cur_node.data!=element)
        {
            prev_node=cur_node;
            cur_node=cur_node.next;
        }
        prev_node.next=cur_node.next;
        return list;
    }

    public static void add(LinkedList list1, LinkedList list2)
    {
        Node cur_node1=list1.head;
        Node cur_node2=list2.head;
        LinkedList list3 = new LinkedList();
        Node res_node= new Node(0);
        list3.head=res_node;
        int c=0;
        int num=0;
        while(cur_node1!=null || cur_node2!=null)
        {
            int x = (cur_node1 != null) ? cur_node1.data : 0;
            int y = (cur_node2 != null) ? cur_node2.data : 0;
            int res=x+y+c;
            num=res%10;
            c=res/10;
            res_node.next=new Node(num);
            res_node=res_node.next;
            if(cur_node1!=null)cur_node1=cur_node1.next;
            if(cur_node2!=null)cur_node2=cur_node2.next;
        }
        if(c>0)
        {
            res_node.next= new Node(c);
        }
        
        Node cur_node = list3.head.next;
        while(cur_node.next!=null)
        {
            System.out.print(cur_node.data+" ");
            cur_node=cur_node.next;
        }
        System.out.print(cur_node.data);
    }

    public static void printlist(LinkedList list)
    {
        Node cur_node = list.head;
        while(cur_node.next!=null)
        {
            System.out.print(cur_node.data+" ");
            cur_node=cur_node.next;
        }
        System.out.print(cur_node.data);
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list=insert(list,1);
        list=insert(list,2);
        list=insert(list,3);
        list=insert(list,4);
        list=insert(list,5);
        list=insert(list,6);
        list=delete(list,3);
        printlist(list);
        System.out.println();   
        add(list,list);
             
    }
}
