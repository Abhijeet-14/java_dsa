package _java._4Dynamic_Programing.CodeForces;

import java.util.Scanner;
import java.util.Stack;

// Problem Statement: Kefa and First Steps
/*
 Kefa decided to make some money doing business on the Internet for exactly n days. 
 He knows that on the i-th day (1 <= i <= n) he makes a i money. Kefa loves progress, 
 that's why he wants to know the length of the maximum non-decreasing subsegment in sequence a i. 
 Let us remind you that the subsegment of the sequence is its continuous fragment. 
 A subsegment of numbers is called non-decreasing if all numbers in it follow in the non-decreasing order.

Help Kefa cope with this task!

Input
	The first line contains integer n (1 ≤ n ≤ 105).
	The second line contains n integers a 1,  a 2,  ...,  a n (1 ≤ a i ≤ 109).

Output
	Print a single integer — the length of the maximum non-decreasing subsegment of sequence a.
*/


public class _1A_Kefa_and_First_Steps {
	
	static int kefa( int arr[], int n) {
		int t[] = new int[n];
		t[0]  = 1;
		
		for(int i=1; i<n; i++) {
			t[i]  = 1;
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j] &&	t[i] < t[j] + 1)
						t[i] = t[j] + 1;
			}
		}
		
		int mx = 0;
		for(int i=0; i<n; i++) {
			mx = Math.max(mx, t[i]);
		}
		
//		return mx;
		// O(n^2)
		
		// Find Max Index:
		int max_i=0, index = 0;
		for(int i=n-1; i>=0; i--) {
			if(t[i]>max_i) {
				max_i = t[i];
				index = i;
			}
		}
		
		Stack<Integer> s = new Stack<>();
		s.push(arr[index]);
		
		for(int i= index -1; i>=0; i--)
		{
			if(t[i] + 1 == t[index] && arr[i] < arr[index])
			{
				index = i;
				s.push(arr[index]);
			}
		}
		
		
		while(!s.isEmpty())
		{
			System.out.print(s.pop() + " ");
		}
		
		System.out.println();
		
		return mx;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(kefa( arr, n));
	}

}
