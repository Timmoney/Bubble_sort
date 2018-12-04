class BubbleSort{
	void sort(int arr[]){
		int n = arr.length;

		//you increment here is because the last element is already the largest
		for(int i=0; i<n ; i++){
			//the swap until the last one is the biggest, but you only do once here
			for(int j=0; j<n-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
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

		SelectionSort obj = new SelectionSort();

		obj.sort(arr);
		System.out.println("Sorted array");
		obj.printArray(arr);
	}

}