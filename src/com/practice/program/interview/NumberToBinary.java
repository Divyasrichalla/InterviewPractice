package com.practice.program.interview;

public class NumberToBinary {
	public static void main(String[] args) {
		int i = 12;
		String s = "";
		while (i > 0) {
			int i1 = i % 2;
			s = i1 + s;
			i = i / 2;
			System.out.println(s);
		}
	}
}




		/*


		//take a number
		//divide by 2 and store the reminder untill it gets 1 as divident
		//add the reminder to a string
		//print from the last number
		int i = 10;
		//System.out.println(Integer.toBinaryString(i));
		String s = "";
		while(i>0){
			//s = String.valueOf(i%2);
			int j = i%2;
			s = j+s;
			System.out.println(s);
			i = i/2;
		}
		System.out.println(s);
		convertToBinary();
	}
	public static void convertToBinary(){
		int n, m;
		String x = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Decimal Number:");
		n = s.nextInt();
		while(n > 0)
		{
			int a = n % 2;
			x = a + x;
			n = n / 2;
		}
		System.out.println(x);
	}
}*/

/*import java.util.Scanner;
public class Decimal_Binary
{
    public static void main(String[] args)
    {
        int n, m;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Decimal Number:");
        n = s.nextInt();
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.println(x);
    }
}*/