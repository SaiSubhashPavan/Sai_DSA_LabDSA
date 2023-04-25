package com.gl.DSA.Lab.BB;

import java.util.Scanner;
import java.util.Stack;

public class BracketBalancing {

	private static boolean balancedBrackets(String str) {
		Stack<Character> stack = new Stack<Character>();

		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			char c = charArray[i];

			if(c=='{'||c=='('||c=='[') {
				stack.push(c);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}

			char popStr;
			switch(c) {
			case')':
				popStr=(char)stack.pop();
				if(popStr=='{'||popStr=='[')
					return false;
				break;

			case'}':
				popStr=(char)stack.pop();
				if(popStr=='('||popStr=='[')
					return false;
				break;

			case']':
				popStr=(char)stack.pop();
				if(popStr=='('||popStr=='{')
					return false;
				break;
			default: 
				return false;

			}
		}
		return (stack.isEmpty());
	}
public static void main(String[] args) {

		String inputString;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Expression to check for balancing brackets");
		inputString=sc.nextLine();


	if(balancedBrackets(inputString))
		System.out.println("The entered Strings"+inputString+" has Balanced Brackets");
	else {
		System.out.println("The entered Strings"+inputString+" do not contain Balanced Brackets");

	}
	sc.close();
}
}