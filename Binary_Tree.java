package Lab5;

import java.util.*;

public class Binary_Tree {

	public static void main(String[] args) 
	
	{
		BST a = new BST();
		
		Node root = null;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Nums?");
		int amount = sc.nextInt();
		
		System.out.println("Enter Nums to Insert-");
		
	
		
		for(int i = 0; i < amount; i++)
		{
			
			int num = sc.nextInt();
			root = a.insert(root, num); //root = 8
		}
		
		int levels = a.getLevels(root);
        System.out.println("Number of levels in the binary tree: " + levels);
		
		
			
	}
	
}
	
	class Node {
		int data;
		Node right;
		Node left;
		
	}
	
	class BST
	{
		
		
		public Node createNewNode(int n)
		{
			Node a = new Node();
			
			a.data = n;
			a.right = null;
			a.left = null;
			
			return a;
		}
		
		
		
		
		public Node insert(Node node, int num)
		{
			if(node == null)
			{
				return createNewNode(num);
			}
			
			if(num < node.data)
			{
				node.left = insert(node.left,num);
			}
			else if(num > node.data)
				
			{
				node.right = insert(node.right,num);
			}
			
			return node;
		}
		
		private int maxDepth(Node node) {
	        if (node == null) {
	            return 0;
	        } else {
	            int leftDepth = maxDepth(node.left);
	            int rightDepth = maxDepth(node.right);
	            return Math.max(leftDepth, rightDepth) + 1;
	        }
	    }

	    public int getLevels(Node root) {
	        return maxDepth(root);
	    }
	}
	
	
	
	
	


