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
		arraysortbysehkar();
		arraySortGobi();
		sortArray_Abi();
		ArraySort_Seetha();
		ascArraySortByRamya();
		ascSort_Archana();
		
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

		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
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

	public void arraySortBySiva() {

		int a[] = { 20, 10, 12, 35, 25 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public void bubbleShortBalaji() {
		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
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
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n - 1]);
	}

	public static void arraysortbysehkar() {
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

	public static void arraySortGobi() {
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size = s.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = s.nextInt();

		}
		Arrays.sort(a);
		for (int j : a) {
			System.out.print(j + " ");

		}

	}

	public static void sortArray_Abi() {
		int a[] = { 10, 90, 40, 20, 50, 30 }, temp;
		System.out.println("Before Sorting:");
		for (int x : a) {
			System.out.println(x);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After Sorting:");
		for (int x : a) {
			System.out.println(x);
		}
	}

	public static void ArraySort_Seetha() {
		int a[] = { 50, 10, 25, 55, 80, 20 }, temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After Sorting:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void ascArraySortByRamya() {

		int a[] = { 50, 10, 25, 55, 80, 20 }, temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

			System.out.println(a[i] + ",");

		}
	}
	
	public static void ascSort_Archana() {
		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no.of elements in your array: ");
		n = s.nextInt();
		int num[] = new int[n];

		System.out.println("Enter the elements in your array: ");
		for (int i = 0; i < n; i++) 
			num[i] = s.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j=i; j<n; j++) {
				if (num[i] > num[j]) {
				temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				}
			}
		}
		System.out.println("New Sorted Array is: ");
		for (int v:num)
			System.out.println(v);
		
	}
}
