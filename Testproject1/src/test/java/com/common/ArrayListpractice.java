package com.common;

import java.util.ArrayList;

public class ArrayListpractice {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
   a.add("test1");
   a.add("test2");
   a.add("test3");
   a.add("test4");
   a.add("test5");
   for(int i=0;i<a.size();i++) {
   System.out.println(a.get(i));
   
   System.out.println(a);
   System.out.println(a.size());

	}
	}
}
