class RecurBubbleSort{
	void sort(int arr[], int n){

		//base case
		if(n == 1)
			return;


		for(int i=0; i<n-1 ; i++){
			if(arr[i] > arr[i+1]){
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
			}
			
		}

		//you can put his before the loop.
		sort(arr, n-1);

	}

	//prints the arrays
	void printArray(int arr[]){
		int n = arr.length;

		for(int i=0; i<n; i++)
			System.out.println(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {60,32,4,34,20,100};

		RecurBubbleSort obj = new RecurBubbleSort();

		obj.sort(arr, 6);
		System.out.println("Sorted array");
		obj.printArray(arr);
	}

}