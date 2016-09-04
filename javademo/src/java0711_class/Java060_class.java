package java0711_class;

class Person {
	String name; // 맴버변수
	int age;
	char gen;

	// 메소드
	void eat() {
		System.out.println("eat");
	}

	void run() {
		System.out.println("run");
	}

	void stop() {
		System.out.println("stop");
	}
}// end class

public class Java060_class {

	public static void main(String[] args) {
		Person ps = new Person();  //힙메모리에 Person공간 확보.  ps(참조)는  스택 메모리에 저장.
		//객체참조변수.맴버변수
		ps.name = "홍길동";
		ps.age=30;
		ps.gen='남';
		System.out.printf("%s %d %c\n",ps.name,ps.age,ps.gen);
		
		//객체참조변수.메소드()
		ps.eat();
		ps.run();
		ps.stop();
		
		Person pp=new Person();
		pp.name="이영희";
		pp.age=25;
		pp.gen='여';
		System.out.printf("%s %d %c\n",pp.name,pp.age,pp.gen);
		pp.eat();
		pp.run();
		pp.stop();
	}// end main()

}// end class()
