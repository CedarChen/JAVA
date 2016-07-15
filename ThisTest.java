public class ThisTest{
	public int foo=3;
	public ThisTest(){
		int foo=4;
		this.foo=6;
		System.out.println(foo);
	}
	public static void main(String[] args){
//		ThisTest test=new Test();
//		new ThisTest();
		System.out.println(new ThisTest().foo);
	}
}
