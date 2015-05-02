if("Test"){println "1. Test evaluated to TRUE inside if"}
else {println "1. Test evaluated to FALSE inside if"}

if('null'){println "2. null evaluated to TRUE inside if"}
else {println "2. null evaluated to FALSE inside if"}

if(null){println "3. null evaluated to TRUE inside if"}
else {println "3. null evaluated to FALSE inside if"}

if(100){println "4. 100 evaluated to TRUE inside if"}
else {println "4. 100 evaluated to FALSE inside if"}

if(0){println "5. 0 evaluated to TRUE inside if"}
else {println "5. 0 evaluated to FALSE inside if"}

List list=[]
if(list)
{println "6. empty list evaluated to TRUE inside if"}
else {println "6. empty list evaluated to FALSE inside if"}

List list2=new ArrayList();

if(list2)
{println "7. Arraylist evaluated to TRUE inside if"}
else 
{println "7. Arraylist evaluated to FALSE inside if"}

