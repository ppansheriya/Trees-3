class Node  
{ 
    int key; 
    Node left, right; 
   
    Node(int val)  
    { 
        key = val; 
        left = right = null; 
    } 
} 
public class SymmetricTree {
	Node root;
	
    public boolean isSymmetric(Node root) {
       if(root == null){
         return true;
       }
            
       return isSymmetric(root.left, root.right);
            
     }
        
     public boolean isSymmetric(Node left, Node right){
          if(left == null || right == null){
              return left == right;
          }
            
          if(left.key != right.key){
               return false;
          }
            
          return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
     }
        
     public static void main(String args[])  
     { 
         SymmetricTree tree = new SymmetricTree(); 
         tree.root = new Node(1); 
         tree.root.left = new Node(2); 
         tree.root.right = new Node(2); 
         tree.root.left.left = new Node(3); 
         tree.root.left.right = new Node(4); 
         tree.root.right.left = new Node(4); 
         tree.root.right.right = new Node(3); 
         boolean output = tree.isSymmetric(tree.root); 
         if (output == true) 
             System.out.println("1"); 
         else
             System.out.println("0"); 
     } 

}
