interface Measure
{  
void draw();  
static int cube(int x)
{
return x*x*x;
}  
}  
class Rectangle implements Measure
{  
public void draw()
{
System.out.println("drawing rectangle");
}  
}  
  
class Interface
{  
public static void main(String args[])
{
Measure d=new Rectangle();  
d.draw();  
System.out.println(Measure.cube(3));  
}}  