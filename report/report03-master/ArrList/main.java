package report03;

public class main {

	public static void main(String[] args) {
		
		ArrList<String> s = new ArrList<String>();
		
		//배열 끝에 요소 추
		
		s.insertLast("apple"); s.print();
		s.insertLast("orange"); s.print();
		s.insertLast("cherry"); s.print();
		s.insertLast("pear"); s.print();
		s.insert("grape", 1); s.print();
		s.insert("lemon", 4); s.print();
		s.insertLast("kiwi"); s.print();
		
		//지정한 번째의 요소를 읽기
		
		s.delete(4); s.print();
		s.delete(0); s.print();
		s.delete(0); s.print();
		s.delete(3); s.print();
		s.delete(0); s.print();
		
		
		
		System.out.println("첫번째 항복은  " + s.peek(1) + " 이다.");
		
		System.out.println();
		
		ArrList<Integer> t = new ArrList<Integer>();
		t.insertLast(100);
		t.insertLast(200);
		t.insertLast(300);
		t.insertLast(400);
		t.print();
		
		//배열 중간에 요소 삽입
		
		t.insert(350, 3); t.print();
		t.insert(250, 2); t.print();
		t.insertLast(500); t.print();


	
		

	}

}