public class Node {
  private int info; 
  private Node next;
  
  
public Node(int info,Node next){
  this.info = info;
  this.next = next;
}
public Node(int info){
   this(info,null);
 }  
 // setters 
 public void setinfo(int info){
   this.info = info;
 }
 public void setNext(Node next){
   this.next= next;
 }
 
 public int  getInfo(){
  return info; 
 }
 public Node getNext(){
   return next;
 }
}
