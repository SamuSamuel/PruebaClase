package Diamante;

import java.util.Scanner;

public class ElEjercicio {

	public static void main(String[] args)
	{
	 
	Scanner sc=new Scanner(System.in);
	System.out.println("Escriba el numero de filas : ");
	int n=sc.nextInt(); 
	System.out.print("Escriba el simbolo que desea utilizar : ");
	 
	char c = sc.next().charAt(0);
	int i=1;
	int j; 
	do 
	{
	j=1;
	do
	{
	System.out.print(" ");
	 
	}while(++j<=n-i+1); 
	j=1;
	do
	{
	System.out.print(c);
	 
	}while(++j<=i*2-1); 
	System.out.println();
	} while(++i<=n); 
	i=n-1; 
	do 
	{
	j=1;
	do
	{
	System.out.print(" ");
	 
	}while(++j<=n-i+1); 
	j=1;
	do
	{
	System.out.print(c);
	 
	}while(++j<=i*2-1); 
	 
	System.out.println(); 
	 
	} while(--i>0);
	 
	 
	}	
	
	
	
	
}




