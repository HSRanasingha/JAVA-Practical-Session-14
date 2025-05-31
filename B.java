class C{
	
	C(){		
	}
	
	C(String s){
		System.out.println(s);
	}
	
	public void print(String s){
		System.out.println(s);
	}
	
	String messageFromC(){
		return "Hi from C";
	}
}

class A{
	A(){
		new C("This is from constructor").print("Hi from A");
		//C obC=new C();
		//obC.print("Hi from A ");		
	}
}

public class B{
	
	void print (String str){
		System.out.println("from B: "+str);
	}
	
	public static void main(String[] ar){
		B objectOfB= new B();
		objectOfB.print("Hi");
		//print("Hi"):
		C prt=new C();
		//A obA=new A();
		//prt.print("Hello");
		//new C ("Hello World");
		objectOfB.print(prt.messageFromC());
		new C(new C().messageFromC());
	}
}