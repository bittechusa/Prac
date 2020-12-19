package com.bit.test;

import java.util.Arrays;
import java.util.List;

import javax.naming.NotContextException;
import javax.swing.border.SoftBevelBorder;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	//Array is a container which hold more than one value with same type and fixed size.
	int a[]=new int[3];//by default every array is an object
	@Test
	public void verifyArray() {
		a[0]=6;
		a[1]=56;
		a[2]=34;
		int[] c= {3,7,5,61};
		
		System.out.println(" second highest num is "+secomdHighestNum(c));
//		int result[]=test1(a);
//		Arrays.sort(result);
//		for(int t:result)
//		{
//			System.out.println(t);
//		}
		
		
	}
	
	public void getMaxNum(int arr[]) {
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
	public void duplicateNum(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate");
				}
			}
		}
	}
	
	public int secomdHighestNum(int a[]) {
		
		//4,6,5,87,45,67
		int highest=a[0];
		int secondHighest=a[1];
		if(secondHighest>highest)
		{
			highest=secondHighest;
			secondHighest=highest;
		}
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>highest)
			{
				secondHighest=highest;
				highest=a[i];
				
			}
			else if(a[i]<highest&&a[i]>secondHighest)
			{
				secondHighest=a[i];
			}
		}
		return secondHighest;
	}
	
	public int[] test1(int a[]) {
		
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		return b;
	}
	
	public String[] acValue(List<WebElement> elements) {
	
		int i=0;
		String []aV=new String[elements.size()];
		for(WebElement ele:elements)
		{
			String v=ele.getText();
			aV[i]=v;
			i++;
		}
		return aV;
		
	}int x=10;
	
	@Test
	public void test2()  {
		WebDriver dr=new ChromeDriver();
		String exV[]= {"Men","Women"};
		String acV[]=acValue(dr.findElements(By.xpath("")));
		
			
		
		for(int i=0;i<exV.length;i++)
		{
			if(exV[i]==acV[i])
			{
				System.out.println("match");
			}else
			{ 
				
				System.out.println("not");
			}
		}
	
	}
	
	
	
	

}
