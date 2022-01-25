package sorters;

public class TcaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data1 = new int[50000];
		for (int i=0; i < data1.length; i++){
			data1[i] = (int) (Math.random() * 65536);
		}
		int[] data2 = data1.clone();
		int[] data3 = data1.clone();
		int[] data4 = data1.clone();
		
		BubbleSort bs =    new BubbleSort(data1);
		InsertionSort is = new InsertionSort(data2);
		QuickSort qs =     new QuickSort(data3);
		SelectionSort ss = new SelectionSort(data4);
		
		long start = System.nanoTime();
		bs.run();
		is.run();
		qs.run();
		ss.run();
		long duration = System.nanoTime() - start;
		Display.show("running time = " + duration * 1e-9 + " seconds");
	}
}
