package sorters;

public class BubbleSort{
	int [] num;
	
	public BubbleSort(int [] data){
		num = data;
	}

	public void run() {
	    int j;
	    boolean flag = true;   // set flag to true to begin first pass
	    int temp;   //holding variable
	    
	    Display.show("Starting BubbleSort..");
	    while ( flag ){
           flag= false;    //set flag to false awaiting a possible swap
           for (j=0;  j < num.length -1;  j++){
              if ( num[j] < num[j+1] ){   // change to > for ascending sort
                  temp = num[j];                //swap elements
                  num[j] = num[j+1];
                  num[j+1] = temp;
                  flag = true;              //shows a swap occurred 
                  
              } 
           }
        }
	    Display.show("Ending BubbleSort");
	    
	}
}
