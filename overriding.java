//METHOD OVERRIDDING
class Overriding
{  
void Students()
{
System.out.println("Students of 10th");}  
}  

class Tenth extends Overriding
{  
void students()
{
System.out.println("Total students are 100");
}  
public static void main(String args[])
{  
Tenth obj = new Tenth();  
obj.students();  
}  