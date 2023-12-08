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

	public boolean isEmpty(){
		return count  == 0;
		}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for(MyNode p = head; p != null;p = p.getLink())
		 sb.append(p.getItem()+" ");
		sb.append("}");
		return sb.toString();
		}

	public static void main(String [] args){
		MyLinkedList list = new MyLinkedList();
		list.addFirst(5);
		list.addFirst(10);
		list.addFirst(15);
		list.addFirst(20);
		System.out.println("list contains:" + list);
		}
	}