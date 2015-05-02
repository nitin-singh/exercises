Map map=['Computing':['Computing':600,'InformationSystems':300],
'Engineering':['Civil':200,'Mechanical':100],
'Management':['Management':800]
]

println '***********Part 1***********'
List list=map.keySet() as List
println "Number of Departments= "+ list.size()
println '***********Part 2***********'
Map map2=map."Computing"
println "Number of Programs by Computing Department:"+map2.size()
println '***********Part 3***********'
println "Students in Civil Engineering Program= "+ map.'Engineering'.'Civil'