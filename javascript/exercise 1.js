var d;
function display()
{
d = new Date();
document.write(d.toUTCString());
}

function format(d)
{
dd=d.getDate();
month=d.getMonth();
yyyy=d.getFullYear();
hh=d.getHours();
mm=d.getMinutes();
ss=d.getSeconds();

document.write(dd+"  "+ month+","+yyyy+"  "+ hh+":"+mm+":"+ss);
}

display();
format(d);

