import java.util.*;
import java.lang.*;
import java.io.*;
class ncount
{
	public static void main(String[] args) 
	{
        Scanner ob = new Scanner(System.in);
  		  int n= ob.nextInt(); 
  		  int count = 0;
        while(n!= 0)
        {           
            n =n/10;
            ++count;
        }

        System.out.println(+ count);
    }
}
