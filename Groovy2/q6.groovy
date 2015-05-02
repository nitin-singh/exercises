def map = [Aditi:22,Surabhi:23,Abhishek:23,Sonu:23,Sachin:25,Abhilasha:22,Bhumika:22,Aroop:22,Yogesh:22,Rishabh:26]
println map

println '***********method 1*************'
map.each { entry ->
    println "Name: $entry.key Age: $entry.value"
}

println '***********method 2*************'
map.eachWithIndex { entry, i ->
    println "$i - Name: $entry.key Age: $entry.value"
}

println '***********method 3*************'
map.each { key, value ->
    println "Name: $key Age: $value"
}

println '***********method 4*************'
map.eachWithIndex { key, value, i ->
    println "$i - Name: $key Age: $value"
}