//INNER CLASS
class OuterClass
{
private 
int num= 1;
public void inner()
{
InnerClass i = new InnerClass();
i.seeOuter();
}
public static void main(String args[]){
OuterClass obj = new OuterClass();
obj.inner();
}
class InnerClass
{
public void seeOuter () {
System.out.println("Value of num is :"+x);
}
} 
}