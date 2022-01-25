package sorters;

public class SelectionSort {
	int[] num;
	
	public SelectionSort(int[] data){
		num = data;
	}

	public void run() {
        int i, j, first, temp;
        
	    Display.show("Starting SelectionSort..");
	    for ( i = num.length - 1; i > 0; i--){
            first = 0;   //initialise to subscript of first element
	        for (j = 1; j <= i; j ++){   //locate smallest element between positions 1 and i.
               if( num[ j ] < num[ first ] )         
                   first = j;
            }
            temp = num[ first ];   //swap smallest found with element in position i.
            num[ first ] = num[ i ];
            num[ i ] = temp; 
        }           
	    Display.show("Ending SelectionSort");
	}
}
