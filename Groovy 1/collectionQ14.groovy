List l=(1..100)
l.each({
   if(it%15==0)
   println " "+"FizzBuzz"
   else if(it%3==0)
   println " "+"Fizz"
   else if(it%5==0)
   print " "+"Buzz"
   else
   println " "+it
})