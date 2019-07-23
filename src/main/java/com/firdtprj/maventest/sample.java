package com.firdtprj.maventest;


import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class sample {
	 void removeDuplicates(String str) 
	    { 
	        LinkedHashSet<Character> lhs = new LinkedHashSet<>(); 
	        for(int i=0;i<str.length();i++) 
	            lhs.add(str.charAt(i)); 
	          
	        // print string after deleting duplicate elements 
	        for(Character ch : lhs) 
	            System.out.print(ch); 
	    } 
	 public static void main(String[]args)
	 {
		 sample obj=new sample();
		 obj.removeDuplicates("aabbcc");
	 }
	 
}
