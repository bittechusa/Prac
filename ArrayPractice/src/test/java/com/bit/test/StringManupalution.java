package com.bit.test;

import org.junit.Test;

public class StringManupalution {
String s="how are u";
StringBuffer sb=new StringBuffer("how are u do");
@Test	
public void m1(){
		String s1=s.concat(" doing");
		sb.append(" doing");
		System.out.println(s);
		s.charAt(1);
		System.out.println("gow".compareTo("gox"));
		s.contains("how");
		s.concat(" ");
		s.endsWith("u");
		s.equals("how");
		"how".equalsIgnoreCase("How");
		int x=s.hashCode();
		int y=s1.hashCode();
		//int c=s.indexOf('o');
		int c1=s.indexOf('o',s.indexOf('o')+1 );
		int c2=s.indexOf('o', c1+1);
		s.charAt(c2);
		
		s.isEmpty();
		s.lastIndexOf('o');
		s.length();
		s.replace("u", "you");
		
		String st[]=s.split(" ");
		for( String a:st) {
			System.out.println(a);
		}
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
		//reverse a string by word
		String st1[]=s.split(" ");
		for(int i=st1.length-1;i>=0;i--)
		{
			System.out.println(st1[i]);
		}
		
		//reverse a string by character
				
				for(int i=s.length()-1;i>=0;i--)
				{
					System.out.println(s.charAt(i));
				}
				
//reverse a string by character
				String s2=s.replace(" ", "");//remove space
				char []c=s2.toCharArray();//convert as char array
				StringBuffer sb=new StringBuffer();
				
				for(int i=c.length-1;i>=0;i--)
				{
					sb.append(c[i]);//print as reverse string as character
				}
				System.out.println(sb);
				
				//reverse a string by word character
				//how are you--->woh era uoy
				String words[]=s.split(" ");
				StringBuffer sb1=new StringBuffer();
				for(String word:words) {
					for(int i=word.length()-1;i>=0;i--) {
						sb1.append(word.charAt(i));
					}
					sb1.append(" ");
			

				System.out.println(sb1.toString().trim());
				
				
				}
				}
@Test
public void findDuplicateCharacter() {
	String s="united state of americat";
	char[] arrs=s.toCharArray();
		for(int i=0;i<arrs.length;i++) {
			for(int j=i+1;j<arrs.length;j++) {
				if(arrs[i]==arrs[j]) {
					System.out.println(arrs[i]+" is duplicate character");
				}
			}
		}
			
}

int currentCharCount=1;
int maxCount=1;
char c;
@Test
public void highestOccuredCharacter() {
	String s="united state of americat";
	char[] arrs=s.toCharArray();
		for(int i=0;i<arrs.length;i++) {
			for(int j=i+1;j<arrs.length;j++) {
				if(arrs[i]==arrs[j]) {
					currentCharCount++;
				}
			}
			System.out.println(arrs[i]+" occured "+currentCharCount);
			if(currentCharCount>maxCount) {
				maxCount=currentCharCount;
				c=arrs[i];
			}
			currentCharCount=1;
		}
		System.out.println(c+" occured "+maxCount+" times");	
}
public void playWithString() {
	String s="12abc32";
	String s1=s.replace("abc",",");//12,32
	String [] words=s1.split(",");
	int i=Integer.parseInt(words[0]);
	int i1=Integer.parseInt(words[1]);
	int j=i+i1;
	System.out.println(j);
}
@Test
public void isPolindrom() {
	String word="dad";
	boolean flag=false;
	int j=word.length()-1;
	if(word.equals(" ")||word.length()<2||word.matches(".*\\d.*")) {
		System.out.println("wrong entry");
	}else {
	for(int i=0;i<word.length();i++,j--) {
		if(word.charAt(i)!=word.charAt(j)) {
			System.out.println(word+" is not polindrom");
			flag=true;
			break;
		}
	}
	if(flag==false) {
		System.out.println(word+" is polinrom");
	}
	}
	
	
}



}

















