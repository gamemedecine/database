/*
 List Operations:
  - addFirst - done
  - addLast - done
  - removeFirst - done
  - removeLast -  done
  - insertItemAt(int pos,int item)
  - removeItemAt
  - getPosition
  - isFound -  done
  - getFirstElement - done
  - getLastElement -  done
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
         count++;
      }
   }



   public boolean isEmpty(){
      return count  == 0;
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
public void removelast(){
      if(!isEmpty()){
         if(count == 1)
            tail = head = null;
         else
         {
            MyNode temp = tail;
            tail = tail.getLink();
            temp.setLink(null);
         }
         count--;
      }
   
   }
//------------------insertItemAt(int pos,int item)----------------------
public void insertItemAt(int pos,int item){
   pos= pos;
   if(isEmpty()){
      tail =head = new MyNode(item);
   }
   else{
         if(pos == 1)
         addFirst(item);
         else if(pos == getCount())
         addLast(item);
        else{
     MyNode prev = head;
				MyNode p = prev.getLink();
				int index = 1;
				while(p != null){
					index++;
					 if(index == pos){
                MyNode nw = new MyNode(item,p.getLink());
						p.setLink(nw);
						nw.setLink(nw.getLink());
						//count++;
//break;
     
     
     
        /* MyNode p=head;
         MyNode p1= p.getLink();
         int index =1;
         while(p!=null){
       index++; 
        if(index == pos){
        MyNode nw =new MyNode(item);
         nw.setLink(p1.getLink());
        p1.setLink(nw);
         */
        }
        
        prev=prev.getLink();
       p=p.getLink();
        
              
    }     
    
    
    }   
    
         
   }
   }


      
    


//-----------------------removeItemAt------------------
public void removeItemAt(int pos){
/*  if(!isEmpty()){
		if(pos > 0 && pos <= getCount()){
			if(pos == 1)
			 removeFirst();
			else if(pos == getCount())
			 removelast();
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

*/
 
   if(!isEmpty()){
       if(pos > 0 && pos <= getCount()){  
         if(pos == 1)
            removeFirst();
            
         else if(pos == getCount())
               removelast();
   }
         else {
           MyNode prev=head;
            MyNode p=prev.getLink();
            int index =1 ;
          while(p !=null){
            index++;
            if(index == pos)
            {
            prev.setLink(p.getLink());
            p.setLink(null);
             count--;
               break;
             }
            prev=prev.getLink();  
            p=p.getLink();
           
          } 
         }
      }


}
   

//-----------------------------------------------------------------
   public boolean isFound(int item){
      boolean flag=true;
      boolean chck = false ;
      MyNode p= head;
      while(p!=null){
         flag = true;
         break;
      }
      return flag;
   
   }
           

   public int getCount(){
      return count;}

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
         System.out.println("List is Empty!");
         return 1;
      }
   }
//------------------------------------------------


   public String toString(){
      StringBuffer sb = new StringBuffer();
      sb.append("{");
      for(MyNode p = head; p != null;p = p.getLink())
         sb.append(p.getItem()+" ");
      sb.append("}");
      return sb.toString();
   }

   public int getPosition(int item){
      int pos = -1;
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
   }

    
   public static void main(String [] args){
  

      MyLinkedList list = new MyLinkedList();
      list.addFirst(5);
      list.addFirst(16);
      list.addFirst(15);
      list.addFirst(20);
      list.addFirst(15);
      list.addFirst(10);
      System.out.println("list contains:" + list);
       list.insertItemAt(2,88);
        System.out.println("list contains:" + list);
      list.removeItemAt(6);
        System.out.println("list contains(removed):" + list);
       

      
       
 
      System.out.println("first element: " + list.getFirstElement());
     System.out.println("Last element " + list.getLastElement());        
      System.out.println("get position  :" + list.getPosition(15));
      System.out.println("get position :" + list.getPosition(88));
      System.out.println("Check number if found:" + list.isFound(18));
      
      
   
     
   
      
   }
}