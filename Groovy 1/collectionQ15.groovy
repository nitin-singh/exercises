class Stack
{
  List l=[];
  int top=-1
  void push(String x)
  {
    top++;
    l[top]=x;
    println x+" pushed"
  }
  void pop()
  {
    println l[top]+" popped"
    l=l.dropRight(1)
    top--
  }
  void top()
  {
     println "TOP= "+l.last()
  }
}
Stack obj=new Stack();
obj.push("1")
obj.push("2")
obj.push("3");
obj.pop();
obj.top();