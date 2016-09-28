    public static Node removeDuplicates(Node head) {
      //Write your code here
        if(head==null) return head;
        
        Node current = head;
                
        while(current.next!=null){
            if(current.next.data == current.data){
                current.next = current.next.next;
            } else current = current.next;
        }
        return head;

    }