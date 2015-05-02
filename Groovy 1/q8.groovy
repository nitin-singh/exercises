File file=new File('file3.java')
File file2=new File('odd.txt')
int count=1;
file.each{
if(count%2!=0)
file2.append("\n"+count+". "+it)
count++
}
 
 