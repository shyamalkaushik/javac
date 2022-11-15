package java_basics;

import java.util.Arrays;

public class anagram {





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Cat";
		String s2="Bat";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] ss1=s1.toCharArray();
		char[] ss2=s2.toCharArray();
		if(Arrays.equals(ss1, ss2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
}
}

