l=[1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]

for(i=0;i<l.size();i++)
println l[i].getClass()

/*
println list.get(6).get(9)
throwing exception
*/

/*
OUTPUT
class java.lang.Integer
class java.lang.Integer
class java.lang.Integer
class java.lang.String
class java.math.BigDecimal
class java.util.ArrayList
class groovy.lang.IntRange
*/