package sorters;

public class InsertionSort {
	int[] num;
	
	public InsertionSort(int[] data){
		num = data;
	}

	public void run() {
	    int j;                     // the number of items sorted so far
	    int key;                // the item to be inserted
	    int i;  

	    Display.show("Starting InsertionSort..");
	    for (j = 1; j < num.length; j++){    // Start with 1 (not 0)
	        key = num[j];
	        for (i = j - 1; (i >= 0) && (num[i] < key); i--){  // Smaller values are moving up
                num[i+1] = num[i];
	        }
	        num[i+1] = key;    // Put the key in its proper location
	        
	    }
	    Display.show("Ending InsertionSort");
	}
	
}
