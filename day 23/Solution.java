static void levelOrder(Node root){
      //Write your code here
    Queue<Node> queue = new LinkedList<Node>();
    
    queue.add(root);
    
    while(queue !=null){
        Node curr = queue.remove();
        System.out.print(curr.data + " ");
        
        if(curr.left != null){
            queue.add(curr.left);
        }
        if(curr.right !=null){
            queue.add(curr.right);
        }
    }  
}