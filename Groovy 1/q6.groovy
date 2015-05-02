List l=(1..10)
List even=[]
List odd=[];
print l;
print "\n"
println l.groupBy{
   if(l[it-1]%2==0)
   {
     even.add(l[it-1])
   }
   else
   {
    odd.add(l[it-1])
    }
}

println even
println odd