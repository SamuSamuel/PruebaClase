package Diamante;

import java.util.Scanner;

public class ElEjercicio {

	public static void main(String[] args)
	{
	 
	Scanner sc=new Scanner(System.in);
	System.out.println("Escriba el numero de filas que desea tener : ");
	int n=sc.nextInt(); 
	System.out.print("Escriba el simbolo el cual desea utilizar : ");
	 //MODIFICACION 1 RAMA 1
	char c = sc.next().charAt(0);
	//MODIFICACION 2 RAMA 1
	int i=1;
	//MODIFICACION 3 RAMA 1
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




