public class MyNode{
	private int Myitem;
	private MyNode link;

	public MyNode(int Myitem, MyNode link){
		this.Myitem = Myitem;
		this.link = link;
		}

	public MyNode(int Myitem){
		this(Myitem,null);
		}

	public MyNode(){
		this(0,null);
		}

	public void setItem(int Myitem){
		this.Myitem = Myitem;
		}

	public int getItem(){
		return Myitem;
		}

	public void setLink(MyNode link){
		 this.link = link;
		}

	public MyNode getLink(){return link;}

	}