import java.io.*;
import java.util.*;
public class LinkedList{
    Node head;
    
    public class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
           
        }
    }
    public LinkedList add(LinkedList list,int data){
        Node n=new Node(data);
        if (list.head==null){
            list.head=n;
        }else{
            Node n1=list.head;
            while(n1.next!=null){
                n1=n1.next;
            }
            n1.next=n;
        }
        
        return list;    
        
        
    }
    public LinkedList delete(LinkedList list,int value){
        Node n=list.head;
        Node prev=null;
        int k=0;
        while(n!=null){
        if (k==value)
            prev.next=n.next;
        
        if(k!=value)
            prev=n;
        
        if(value==0){
            list.head=n.next;
            break;
        }
        n=n.next;    
        k=k+1;
        }
        return list;
    }
    
        
    public void display(LinkedList list){
        Node n=list.head;
        while (n!=null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String args[]){
     LinkedList list=new LinkedList();
     list=list.add(list,4);
     list=list.add(list,3);
     list=list.add(list,2);
     list=list.add(list,4);
     list=list.delete(list,3);
     list.display(list);
     
    }
}