/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author purav
 */

public class BST {
    public static Node root;
    public BST(){
        this.root = null;
    }
    
    public void insert(int id){
        Node newNode = new Node(id);
        if (root == null){
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while(true){
            parent = current;
            if (id < current.data){
                current = current.left;
                if (current.left == null){
                    parent.left = newNode;
                   return;
                }
                else{
                    current = current.right;
                    if (current.right == null){
                        parent.right = newNode;
                        return;
                    }
                }
                
            }
        }
        
    }
    public void display(Node root){
        if(root != null){
            display(root.left);
            System.out.println("Data is: " + root.data);
            display(root.right);
        }
        
    }
    public static void main(String[] args){
    BST b = new BST();
    b.insert(1);
    b.insert(2);
    b.insert(3);
    b.insert(4);
    b.insert(5);
    b.insert(6);
    b.insert(7);
    b.insert(8);
    System.out.println("Original Tree : ");
    b.display(root);
    }
    
}
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}