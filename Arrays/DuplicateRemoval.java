package Arrays;

public class DuplicateRemoval {
	public static void main(String[] args) {
		
		  int[] a = {2, 4, 6, 2, 7, 4, 9};
	        int n = a.length;


	        int[] temp = new int[n];
	        int k = 0; 

	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;


	            for (int j = 0; j < k; j++) {
	                if (a[i] == temp[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                temp[k] = a[i];
	                k++;
	            }
	        }
	        System.out.println("Array after removing duplicates:");
	        for (int i = 0; i < k; i++) {
	            System.out.print(temp[i] + " ");
	        }
	}

}
