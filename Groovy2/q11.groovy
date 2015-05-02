class employee
{
String name,departmentName 
int age,salary,employeeNumber 

}
List l=[]
for(i=0;i<20;i++)
l.add(new employee(name:'Employee '+(i+1),departmentName:'DEPT'+i+1,age:30+i,salary: (i+1)*1000,employeeNumber:(i+1)*1000))
println "List of employees with their details:"
l.each{employee e->
println e.name+" "+e.departmentName+" "+e.age+" "+e.salary+" "+e.employeeNumber}



println "*****************Part 1*********************"
Map m1=l.groupBy({
     if((it.salary>=0) && (it.salary<=5000))
     return "less than 5000";
     else if((it.salary>5000) && (it.salary<=10000)) 
     return "less than 10000";
     else
     return "greater than 10000"
})


println m1['less than 5000'];
println m1['less than 10000'];
println m1['greater than 10000'];


println "*****************Part 2*********************"
Map m2=l.groupBy({it.departmentName})
m2.each({
  println "\t"+it.key+" "+it.value.size();
})
print "\n"


println "*****************Part 3*********************"
Map m3=l.groupBy({
if(it.age>18 && it.age<35)
return "Adults"
}
)

println "employee aged between 18 and 35: "+m3['Adults']



println "*****************Part 4*********************"
Map m=l.groupBy{it.name[0]};
println m
m.each{
print "Name Start with:${it.key} and number of Employees with Age >20 are:"
println it.value.countBy({it2->it2.age>20}).get(true)
}

println "*****************Part 5*********************"
Map m5=l.groupBy({it.departmentName})
println m5
