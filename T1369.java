import java.util.Scanner;


public class T1369 {
	
	public static void main(String[] args) {
		
		char[] arr = new char[10];
	    int length;
	    int i;
	    Scanner in  = new Scanner(System.in);
	    
	    while(in.hasNext()){
	    	arr = in.next().toCharArray();
	        length = arr.length;
	        bubbleSort(arr,0,length);
	        Permuration(arr,0,length);
	    }
	}
	
	public static void Permuration(char[] arrays, int k, int length){
		int j;
		if(k == length){
			for (j = 0; j < length; j++) {
				System.out.print(arrays[j]);
			}
			System.out.println("---------------");
		}
		else {
			for (j = k; j < length; j++) {
				if (k != j && arrays[j] == arrays[k]) {
					continue;
				}
				swap(arrays,k,j);
				printArray(arrays);System.out.println();
				bubbleSort(arrays, k+1, length);
				printArray(arrays);System.out.println();
				Permuration(arrays, k+1, length);
				bubbleSort(arrays, k+1, length);
			}
		}
	}
	
	public static void bubbleSort(char[] arrays, int begin, int length){
		
		for (int i = begin; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				if (arrays[i] > arrays[j]) {
					swap(arrays,i,j);
				}
			}
		}
		
	}
	
	public static void swap(char[]tmp, int a, int b){
		char c;
		c = tmp[a];
		tmp[a] = tmp[b];
		tmp[b] = c;
	}
	
	public static void printArray(char[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
	
}
