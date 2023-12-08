public class DoublyLinkedList{
	DNode head;
	DNode tail;
	int count = 0;
	//addFirst
	//addLast
	//removeFirst
	//removeLast
	//remove(int item)
   
	public boolean isEmpty(){
		return head == null;
		}
	public void addFirst(int item){
		if(isEmpty()){
		 //tail and head should hold the new node
			tail = head =  new DNode(item);
			 }
		else{
			DNode newNode = new DNode(item,null,head);
			head.setLeft(newNode);
			head = newNode;
			}
		count++;
		}

	public void addLast(int item){
		if(isEmpty())
		 addFirst(item);
		else{
			DNode newNode  = new DNode(item,tail,null);
			tail.setRight(newNode);
			tail = newNode;
			}
		count++;
		}
      
//-------------------------------------
public void AddItemAt(int item,int pos){
   pos=pos;
   if (isEmpty()){
          tail = head =new DNode(item);
    }
    else{
        if(pos ==1)
        addFirst(item);
        else if(pos==getCount())
        addLast(item);
        else{
         DNode prev =head;
         DNode p = prev.getRight();
         DNode p1 = p.getRight();
         int index =1;
         while(p != null){
         index++;
          if(index == pos){
            DNode nw =new DNode(item,p,p.getRight());
            p.setRight(nw);
            nw.setLeft(nw.getLeft());
            nw.setRight(nw.getRight());
            p1.setLeft(nw);
            break;
          }  
           prev=prev.getRight();
         p = p.getRight();


         }  
                 
        }
    }
}
//------------------------------------
public void Remove(int pos){
  if(!isEmpty()){
       if(pos > 0 && pos <= getCount()){
         if(pos ==1 )
         removeFirst();
         else if(pos == getCount())
          removeLast();
        else{
         DNode prev= head;
         DNode p = prev.getRight();
         DNode p1 = p.getRight();
         int index =1;
         while(p != null){
         index++;
         if(index == pos){
            prev.setRight(p.getRight());
            p1.setLeft(p.getLeft());
            p.setRight(null);
            p.setLeft(null);
          break;
         }
         prev=prev.getRight();
         p = p.getRight();
         
         }
        } 
       } 
   }
}




	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for(DNode p = head; p != null; p = p.getRight())
		 sb.append(p.getItem()+" ");
		sb.append("}");
		return sb.toString();
		}
      public int getCount(){return count;}

       public String reversetoString(){
		   StringBuffer sb = new StringBuffer();
		   sb.append("{");
		   for(DNode p = tail; p != null; p = p.getLeft())
		   	sb.append(p.getItem()+" ");
		    sb.append("}");
		   return sb.toString();
		   }

		public void removeFirst(){
			if(!isEmpty()){
					 if(count == 1)
					  head = tail = null;
					 else
					  {
						DNode temp = head;
						head = head.getRight();
						head.setLeft(null);
						temp.setRight(null);
						  }
						  count--;
					  }

			}

		public void removeLast(){
			if(!isEmpty()){
				if(count == 1)
				 tail = head = null;
				else{
					DNode temp = tail;
					tail = tail.getLeft();
					tail.setRight(null);
					temp.setLeft(null);
					}
				count--;
				}
			}
        // public void remove(int item)

	public static void main(String [] args){
		DoublyLinkedList list = new DoublyLinkedList();
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(8);
      list.addFirst(2);
		System.out.println("list contains:" + list);
		list.addLast(7);
      list.addLast(5);
		list.addLast(6);
		System.out.println("list contains:" + list);
		//list.removeFirst();
       list.Remove(5);
		System.out.println("Removed :" + list);
        list.AddItemAt(44,3);
      System.out.println("Added in specific positon :" + list);
		System.out.println("list contains (in reverse order):" + list.reversetoString());
		}
	}