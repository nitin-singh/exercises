String s = "this string needs to be split"
println s.tokenize(" ")
println s.tokenize()
println "*********************************"
String s2 = "this string needs to be split"
println s2.split(" ")
println s2.split(/\s/)

println "*********************************"
String s3 = "are.you.trying.to.split.me.sir?"
println s3.tokenize(".")
println s3.split(".")