import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	
      static void levelOrder(Node root){
        LinkedList ll = new LinkedList();
        if(root==null)
            return;
        ll.add(root);
        System.out.print(root.data+" ");
        ll.remove();
        ll.add(root.left);
        ll.add(root.right);
        while(!ll.isEmpty()){
            Node temp=(Node)ll.remove();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
                ll.add(temp.left);
            //System.out.print("added "+temp.left.data);
            if(temp.right!=null)
                ll.add(temp.right);
            //System.out.print("added "+temp.right.data);
        }
    }
      
  

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}