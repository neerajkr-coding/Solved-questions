 Node removeDuplicates(Node head)
    {
	Node temp = head;
	
	while(temp!=null){
	    
	    //TO check if next node is duplicate and is not NULL
	    if(temp.next!=null && temp.data==temp.next.data){
	        temp.next=temp.next.next;
	    }else{
	        //Finally Moving to next Node as there are no duplicate
	        temp=temp.next;
	    }
	    
	}
	return head;
    }
