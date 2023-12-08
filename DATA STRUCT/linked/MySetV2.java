public class MySetV2 extends UnOrderedLinkedList implements Set{

	//public MySetV2 union(MySetV2 set){}
	//public MySetV2 intersection(MySetV2 set){}
	//public MySetV2 difference(MySetV2 set){}
	//public boolean isSubset(MySetV2 set){}
public Set union(Set set){
   MySetV2 union = new MySetV2();
   
  
  for(MyNode p= head;p != null;p=p.getLink()){
       
          union.add(p.getItem());
  fo(MyNode p=  head;p !=null;p.getLink());
          union.add(set.getItem());
         
                 
          }
 return union;
 
 }
 
 
	public static void main(String [] args){     
         MySetV2 setA = new MySetV2();
         MySetV2 setB = new MySetV2();
         
         setA.add(2);
         setA.add(16);
         setA.add(15);
         setA.add(8);
         setA.add(11);
         ////
         setB.add(3);
         setB.add(4);
         setB.add(11);
         setB.add(8);
         setB.add(10);
                  System.out.println("List setA has:"+setA);

         System.out.println("List setB has:"+setB);
         System.out.println("the union is :"+setA.union(setB));

         
         
         
   }
   }      
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         