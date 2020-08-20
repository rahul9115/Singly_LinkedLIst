import java.io.*;
import java.util.*;
public class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }
    public LinkedList insert(LinkedList list,int d){
        Node n=new Node(d);
        if (head==null){
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
    public LinkedList delete(LinkedList list,int key){
        Node n=list.head;
        Node prev=null;
        while(n!=null){
            if(n.data==key && prev!=null){
                prev.next=n.next;
                
                
            }
            if(n.data!=key && prev!=n ){
                prev=n;
                
                
                
            }    
            
            if (list.head.data==key){
                               
                list.head=n.next;
                return list;
                
            }
            n=n.next;    
                
        }
        return list;
    }
    public void display(LinkedList list){
        Node n=list.head;
        while(n!=null){
        System.out.println(n.data+" ");
        n=n.next;
        
            
        }
    } 
    public static void main(String args[]){
     LinkedList list=new LinkedList();
     list=list.insert(list,4);
     list=list.insert(list,3);
     list=list.insert(list,2);
     list=list.insert(list,2);
     list=list.delete(list,2);
     list.display(list);
     
    }
    
}