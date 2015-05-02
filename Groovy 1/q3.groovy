class Person
{
   private String name;
   private int age;
   private String eid;
   private int salary;
   private String gender;
   private String address; 

	public String toString()
	{
	println(name+" is a man aged "+ age+\
	" who lives in "+ address+". He works for Intelligrape with employee id "\
	+eid+" and draws "+salary+\
	 "lots of money !!!!.")
	}
   public static void main(String...a)
   {
      Person obj=new Person();
      obj.name="Nitin";
      obj.age=22;
      obj.salary=1000000;
      obj.eid="123ABC"
      obj.gender="Male";
      obj.address="Shahdara,Delhi";
      println(obj.toString())
//above code returns null after printing the toString message.why?


 }
}
