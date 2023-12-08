public class myFirstnode{
   Node head;
   Node tail;
   
   
   public myFirstnode(){
      head = tail = null;
   }
   


public boolean isEmpty(){
  return head == null;
}
public int getFirst(){
   if(!isEmpty())
   return head.getInfo();
   else
   return 0;
      
}
public int getLast(){
if(!isEmpty())
   return tail.getInfo();
   else
   return 0; 
}

   
   public String toString(){
      StringBuffer sb = new StringBuffer();
    sb.append("{");
     Node p = head;
    while(p != null){
      sb.append(p.getInfo()+"");
      p = p. getNext();
    }
    sb.append("}");
    return sb.toString();
   }
   public static void main(String [] args){
   myFirstnode list= new myFirstnode();
      
   
   System.out.println("print:"+list);
   System.out.println("print:"+list.getFirst());
   System.out.println("print:"+list.getLast());
      
   
      
   }
}