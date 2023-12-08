/*

   - No duplication
   - add()
   - remove(int item)
*/

public class UnOrderedLinkedList extends MyLinkedList
{

		public void add(int number){
		if(!isFound(number))//check if number is not found in the list
			 addLast(number);
			}

	public void remove(int number){
			if(!isEmpty()){
				if(getFirstElement() == number)
				 removeFirst();
				else if(getLastElement() == number)
				 removeLast();
				else{
					MyNode prev = head;
					MyNode p = prev.getLink();
					while(p != null){
						if(p.getItem() == number){
							prev.setLink(p.getLink());
							count--;
							break;
							}
						p = p.getLink();
						prev = prev.getLink();
						}
					}

				}
            }            
         


		public static void main(String [] args){
           UnOrderedLinkedList list = new UnOrderedLinkedList();
           list.add(5);
           list.add(5);
           list.add(6);
           list.add(6);
           list.add(4);
           list.add(3);
           System.out.println("List contains:" + list);
          list.remove(10);
          list.remove(5);
           list.remove(3);
           list.remove(4);
          System.out.println("list contains:" + list);

			}
         } 