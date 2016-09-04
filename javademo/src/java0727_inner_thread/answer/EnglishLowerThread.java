package java0727_inner_thread.answer;

public class EnglishLowerThread extends Thread{
	char[] arr=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
            'o','p','q','r','s','t','u','v','w','x','y','z'};
	
	@Override
	public  void run(){
		for(char ch : arr){
			System.out.print(ch);
			try {
				sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
