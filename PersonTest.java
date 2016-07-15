public class PersonTest{
	public static void main(String[] args){
		Person p1=new Person();
		Person p2=new Person();
		p1.name="chen";
		p2.name="zhi";
		Person.year=11;
		p1.year=21;
		p2.year=31;
		System.out.println("p1.name="+p1.name+"p2.name="+p2.name+"p1.enum="+p1.year+"p2.enum="+p2.year+"Person.enum="+Person.year);
	}


}
class Person{
	public static int year;
	public String name;

}
