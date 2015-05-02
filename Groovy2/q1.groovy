List l=[1,2,3,4,5,1,2,3,4,5,1,2,3,4,5]
println l
//converting to set
Set s= l as Set
println "After converting to set :"+s
//without converting to a Set
l.unique()   
println "            Using unique:"+l