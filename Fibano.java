# Fibano
import java.io.*;
import java.util.*;
public class Fibano
{  
public static void main(String args[])
 {
 Scanner s=new Scanner(System.in);
 int n,first=0,second=1,next;
 System.out.println("Enter the number");
 n=s.nextInt();
 System.out.println("Fibonacci series is :");
 for(int i=0;i<=n;i++)
 {
  System.out.println(first);
  next=first+second;
  first=second;
  second=next;
  }
 }
} 
 
    
