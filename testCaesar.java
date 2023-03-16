package thuattoanmahoa;

import java.util.Scanner;

public class testCaesar {
	
	public static StringBuffer encrypt (String text , int k) {
		
		StringBuffer result = new StringBuffer();
		for(int i = 0; i<text.length();i++)
		{
			if(Character.isUpperCase(text.charAt(i))) {
				char ch = (char)(((int)text.charAt(i)+ k-65)%26+65);
				result.append(ch);
			}
			else
			{
				char ch = (char)(((int)text.charAt(i)+ k-97)%26+97);
				result.append(ch);
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Nhap vao thong tin can ma hoa:");
		String text = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao khoa k:");
		int k = new Scanner(System.in).nextInt();
		System.out.println("Ban ro:" + text);
		System.out.println("Ban ma:" +encrypt(text, k));
		System.out.println();
	}

}
