public class Dat1{
 public static void main(String [] args){
	 ArrayList list = new ArrayList();
	 list.addLast(5);
	 list.addLast(7);
	 list.addLast(8);
	 list.addLast(9);
	 System.out.println("List contains:" + list);
	 //list.removeFirst();
	 System.out.println("List contains:" + list);
	  list.addFirst(7);
	  list.addFirst(4);
	  list.addFirst(9);
	 System.out.println("List contains:" + list);
	 //Expected output:  9 4 7 5 7 8 9
	 ///System.out.println("List contains: " + list);
	  list.insertItemAt(10,3);
	 System.out.println("List contains:" + list);
	  list.removeFirst();
	 System.out.println("List contains:" + list);
	  list.removeLast();
	 System.out.println("List contains: " + list);
	   list.removeItemAt(5);
	 System.out.println("List contains: " + list);
	  list.doubleTheValue();
	 System.out.println("List contains: " + list);
	 //System.out.println("is 5 found? " + list.isFound(5));

	 }
    
    }