def file=new File('file3.java')
def file2=new File('erasedspaces.txt')
def x
file.eachLine{
line ->
print line
   x=line.replaceAll("\\s","")
   file2<<x;
}
