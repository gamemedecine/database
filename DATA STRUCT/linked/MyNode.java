public class MyNode{
	private int item;
	private MyNode link;

	public MyNode(int item, MyNode link){
		this.item = item;
		this.link = link;
		}

	public MyNode(int item){
		this(item,null);
		}

	public MyNode(){
		this(0,null);
		}

	public void setItem(int item){
		this.item = item;
		}

	public int getItem(){
		return item;
		}

	public void setLink(MyNode link){
		 this.link = link;
		}

	public MyNode getLink(){return link;}

	}