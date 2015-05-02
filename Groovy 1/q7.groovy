dir ="groovy"
def f1=new File("file1.txt")
new File(dir).eachFile()
{
   file-> file.eachLine{line->f1<<line<<"\n";}
}