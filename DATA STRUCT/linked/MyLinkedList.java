/*
 List Operations:
  - addFirst - done
  - addLast - done
  - removeFirst - done
  - removeLast - to be done
  - insertItemAt(int pos,int item)
  - removeItemAt(int pos);
  - getPosition - done
  - isFound - to be done
  - getFirstElement - done
  - getLastElement - to be done
*/

public class MyLinkedList{
	MyNode head;
	MyNode tail;
	int count = 0;

	public void addFirst(int item){
		if(isEmpty())
		 tail = head = new MyNode(item);
		else
		   {
			 MyNode temp = new MyNode(item,head);
			 head = temp;
			 }
		count++;
		}

	public void addLast(int item){
		if(isEmpty())
		 tail = head = new MyNode(item);
		else{
			MyNode temp = new MyNode(item);
			tail.setLink(temp);
			tail = temp;

			}
		 count++;
		}

/*/--------------Sort---------------
   public void Sort(int Item){
     if(isEmpty()){
      tail = head = new MyNode(Item);
     }
     else{
         MyNode p = head;
         MyNode p1 = p.getLink();
         
         
               for(MyNode po=head;po != null;po=po.getLink()){
            if(p.getItem()>p1.getItem()){
                         p.setLink(p1.getLink());
                         p1.setLink(null);                                           
                 }
      }   
     }
       }*/

	public boolean isEmpty(){
		return count  == 0;
		}


	public int getPosition(int item){
		int pos = -1;
		int index = 0;
		MyNode p = head;
		while(p!= null){
			index++;
			if(p.getItem() == item){
				pos = index;
				break;
				}
			p = p.getLink();
			}
		 return pos;
		}

	public void removeFirst(){
		if(!isEmpty()){
		 if(count == 1)
		  head = tail = null;
		 else
		  {
			MyNode temp = head;
			head = head.getLink();
			temp.setLink(null);
			  }
			  count--;
		  }

		}
 //--------------------- inseet
 public void InsertAt(int pos ,int Item){
   pos = pos;
   if(!isEmpty()){
      if(pos > 0  && pos <= getCount()){
         if (pos == 1)
            addFirst(Item);
            else if(pos == getCount())
            addLast(Item);
      }
   }
 }

	public void removeItemAt(int pos){
	 if(!isEmpty()){
		if(pos > 0 && pos <= getCount()){
			if(pos == 1)
			 removeFirst();
			else if(pos == getCount())
			 removeLast();
			else{
				MyNode prev = head;
				MyNode p = prev.getLink();
				int index = 1;
				while(p != null){
					index++;
					 if(index == pos){
						prev.setLink(p.getLink());
						p.setLink(null);//free p
						count--;
						break;
						}
					  prev = prev.getLink();
					  p = p.getLink();
					} 
			      }
				}
			}

		}

	public boolean isFound(int item){
		boolean found = false;
		for(MyNode p = head; p!= null; p = p.getLink()){
			if(p.getItem() == item){
				found = true;
				break;
				}
			}
		 return found;
		}

	public int getCount(){return count;}

	public int getFirstElement(){
		try{
			return head.getItem();
			}
		catch(Exception e){
			System.out.println("List is empty!");
			return -1;
			}
		}

   public int getLastElement(){
   		try{
   			return tail.getItem();
   			}
   		catch(Exception e){
   			System.out.println("List is empty!");
   			return -1;
   			}
		}

    public void removeLast(){
		 MyNode prev = head;
		 MyNode p = head.getLink();
		 while(p.getLink() != null){
			 prev = prev.getLink();
			 p = p.getLink();
			 }
		prev.setLink(null);
		count--;
		}


	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for(MyNode p = head; p != null;p = p.getLink())
		 sb.append(p.getItem()+" ");
		sb.append("}");
		return sb.toString();
		}

/*		int pos = -1;
		int count = 0;
		for(MyNode p = head; p != null; p = p.getLink()){
		 count++;
		 if(p.getItem() == item)
		 {
			 pos = count;
			 break;
			 }
	     }
		 return pos;
		} */

	public static void main(String [] args){
		MyLinkedList list = new MyLinkedList();
		list.addFirst(2);
		list.addFirst(1);
		list.addFirst(3);
		list.addFirst(20);
		list.addLast(25);//20 15 10 5 25
		list.addLast(30);
      list.InsertAt(2,4);
		System.out.println("list contains:" + list);
		System.out.println("first element: " + list.getFirstElement());
		System.out.println("get position of 30:" + list.getPosition(30));
		System.out.println("get position of 20:" + list.getPosition(20));
		 System.out.println("list contains: " + list);
       list.removeLast();
        list.removeItemAt(4);
        System.out.println("list contains: " + list);
       list.removeItemAt(4);
	System.out.println("list contains: " + list);
	//	list.removeItemAt(3);
		////System.out.println("list contains: " + list);
		}
	}