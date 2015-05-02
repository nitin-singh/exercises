class employee
{
private String name
private int salary,age
 employee(String n,int a,int s)
    {
    name=n
    salary=s
    age=a
    }
    
public static void main(String...args)
{
List<employee> l=[]
int i
for(i=0;i<10;i++)
{l.add(new employee("employee "+(i+1),i+30,i+1*100))
println l[i].name+"  "+l[i].age+"  "+l[i].salary
}



println '*********** Solution of Part-1***************'

List l2=l.findAll{employee temp -> temp.salary<5000}
l2.each{println it.name+" "+it.age+" "+it.salary}

println '*********** Solution of Part-2***************'
println "Youngest employee = "+l.min({it.age}).name
println "Eldest employee = "+l.max({it.age}).name
println '*********** Solution of Part-3***************'
println "Employee is highest salary= "+l.max({it.salary}).name
println '*********** Solution of Part-2***************'
List l3=l.findAll
{
  it.name
}
print l3*.name




}
}
