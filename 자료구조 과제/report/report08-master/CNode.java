public class CNode <E> {
	private E item;
	private CNode next;
	public CNode (E newItem, CNode p) {//노드 생성자
		item = newItem;
		next = p;
	}
    //get 메소드와 set메소드
	public E getItem() {return item;}
	public CNode getNext() {return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(CNode newNext) {next = newNext;}
}