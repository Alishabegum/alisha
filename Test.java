	import java.io.*;  
	class Test{  
	 /* public static void main(String args[]){  
	   try{  
	     FileOutputStream fout=new FileOutputStream("abc.txt");  
	     String s="Sachin Tendulkar is my favourite player";  
	     byte b[]=s.getBytes();//converting string into byte array  
	     fout.write(b);  
	     fout.close();  
	     System.out.println("success...");  
	    }catch(Exception e){System.out.println(e);}  
	  }  */

public static void main(String args[]){  
	  try{  
	    FileInputStream fin=new FileInputStream("abc.txt");  
	    int i=0;  
	    while((i=fin.read())!=-1){  
	     System.out.print((char)i);  
	    }  
	    fin.close();  
	  }catch(Exception e){System.out.println(e);}  
	 }  



	}  
