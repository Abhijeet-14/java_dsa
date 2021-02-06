package _java._4Dynamic_Programing;

public class _6CountSubsetOfGivenSum_M {
	
		
		//INITIALIZE
	static void initialize(int t[][], int sum, int n) {
		for(int j =0; j< sum+1; j++)
			for(int i =0; i< n+1; i++)
				t[i][j] = -1;
	}
		
	static int countSubsetSum( int t[][], int arr[], int sum, int n) {
		// CODE
		if(n==0 && sum != 0)
			return t[n][sum] = 0;
		
		if(sum == 0)
			
			return t[n][sum] = 1;
		
//		if(t[n][sum] != -1)
//			return t[n][sum];
		
		else {
			if(arr[n-1] <= sum) {
				t[n][sum] = countSubsetSum(t, arr, sum-arr[n-1], n-1) + countSubsetSum(t, arr, sum, n-1);
				return t[n][sum];
			}
			else {
				t[n][sum] = countSubsetSum(t, arr, sum, n-1);
				return t[n][sum];
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,3};
		int sum = 6;
		
		int n = arr.length;
		
		int t[][] = new int[n+1][sum+1];
		
		initialize(t, sum, n);
		
		System.out.println( countSubsetSum( t, arr, sum , n) );
		
		System.out.println("Table:\n");
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++){
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
