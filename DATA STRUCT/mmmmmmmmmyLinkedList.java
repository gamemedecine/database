/*
 List Operations:
  - addFirst - done
  - addLast - done
  - removeFirst - done
  - removeLast - to be done
  - insertItemAt(int pos,int item)
  - removeItemAt
  - getPosition
  - isFound - to be done
  - getFirstElement - done
  - getLastElement - to be done
*/

public class mmmmmmmmmyLinkedList{
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
		list.addFirst(10);
		list.addFirst(15);
		list.addFirst(20);
		list.addLast(25);//20 15 10 5 25
		System.out.println("list contains:" + list);
		System.out.println("first element: " + list.getFirstElement());
		System.out.println("get position of 30:" + list.getPosition(30));
		System.out.println("get position of 20:" + list.getPosition(25));
		}
	}