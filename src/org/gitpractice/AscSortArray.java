package org.gitpractice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AscSortArray {
	public void ascSort() {
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

	public static void main(String[] args) {
		AscSortArray ob = new AscSortArray();
		ob.ascSort();
	}

}
