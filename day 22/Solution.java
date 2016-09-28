	public static int getHeight(Node root){
      //Write your code here
        int left =0;
        int right =0;
        
        if(root.left != null){
            left = getHeight(root.left) +1;
        }
        if(root.right != null){
            right = getHeight(root.right) +1;
        }
        
        return (left > right ? left : right);
      
        
    }
