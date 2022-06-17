package com.practice.program.interview;

public class PrintRemainingChar {
	public static void main(String[] args) {
		char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char n = 'e';
		//int i = Arrays.binarySearch(ch,n);
		/*String[] s = {"div","Nav","Sri"};
		String s1 = "div";
		//
		List<String> strings = Arrays.asList(s);
		System.out.println(strings.indexOf(s1));
		for(int j=i+1;j<ch.length;j++){
			System.out.print(ch[j]);
		}*/

		for(int x=0;x<ch.length;x++){
			if(ch[x]==n){
				for(int j=x+1;j<ch.length;j++){
					System.out.print(ch[j]);
				}
			}
		}
	}
}
