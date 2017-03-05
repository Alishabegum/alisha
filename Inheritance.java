//HIEARICAL INHERITANCE 
class Bank 
{
void bankname()
{
System.out.println("bank name:");
}
}
class Icici extends Bank 
{
void name1()
{ 
System.out.println("ICICI BANK");
}
}
class Sbi extends Bank
{
void name2()
{
System.out.println("SBI bank");
}
}
class Inheritance
{
public static void main(String args[])
{
Icici a=new Icici();
a.bankname();
a.name1();
Sbi b=new Sbi();
b.name();
b.name2();
}}