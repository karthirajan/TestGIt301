package testpack;


import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseClass();

		arraysorting_siva();
		Nithya_ArrayAsc();
		ArraySortBasha();

	}

	public static void baseClass() {
		System.out.println("this is my base class");
	}

	public static void ArraySortBasha() {
		int n, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n - 1]);

	}

	public static void Nithya_ArrayAsc() {

		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ",");

		}

	}

public static void arraysorting_siva() {
	
		int n , temp;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter all the elements:");
    for (int i = 0; i < n; i++) 
    {
        a[i] = s.nextInt();
    }
    for (int i = 0; i < n; i++) 
    {
        for (int j = i + 1; j < n; j++) 
        {
            if (a[i] > a[j]) 
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    System.out.print("Ascending Order:");
    for (int i = 0; i < n ; i++) 
    {
        System.out.print(a[i]+",");
       
    }
    
}

}