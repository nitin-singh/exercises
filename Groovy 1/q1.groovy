class Person
{
   private String name;
   private int age;
   private String gender;
   private String address; 
   public String getname()
   {
    return name;
   }
   public int getage()
   {
    return age;
   }
   public String getgender()
   {
    return gender;
   }
   public String getaddress()
   {
    return address;
   }
   public static void main(String...a)
   {
      Person obj=new Person();
      obj.name="Nitin";
      obj.age=22;
      obj.gender="Male";
      obj.address="Shahdara,Delhi";
	println("Through getter:");
      println("NAME: "+obj.getname());
      println("AGE: "+obj.getage());
      println("GENDER: "+obj.getgender());
      println("ADDRESS: "+obj.getaddress());
  
      println("\n\nThrough dot operator:");
      println("NAME: "+obj.name);
      println("AGE: "+obj.age);
      println("GENDER: "+obj.gender);
      println("ADDRESS: "+obj.address);




 }
}
