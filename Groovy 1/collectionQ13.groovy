String x="count the occurences of t in this text"
def c='t'
def count=0;
x.each{
    if(it==c)
    count++
}
print "occurences of t: "+count