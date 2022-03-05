package homework;

public class Node <Key extends Comparable<Key>, Value> {
	private Key id;
	private Value name;
	private Node<Key, Value> left, right;
	
	public Node(Key newId, Value newName) { //³ëµå »ý¼ºÀÚ
		id = newId;
		name = newName;
		left = right = null;
	}
	//get°ú set ¸Þ¼Òµåµé
	public Key getKey() { return id;}
	public Value getValue() { return name;}
	public Node<Key, Value> getLeft() {return left;}
	public Node<Key, Value> getRight() {return right;}
	public void setKey(Key newId) {id = newId;}
	public void setValue(Value newName) {name = newName;}
	public void setLeft(Node<Key, Value> newLeft) {left = newLeft;}
	public void setRight(Node<Key, Value> newRight) {right = newRight;}
}