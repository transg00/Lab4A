public class Lab4 {
	public static void main (String[] args) {
		int[] arr = {0,1,2,3,4};
      int[] arr2 = {40,30,20,10,0};
      int[] arr3 = {14,50,33,22,-1};
      int[] arr4 = {100,200,300,400,6};
      int[] arr5 = {0,0,0,0,0};
      int[] arrSort = new int[5];
      int[] arr2Sort = new int[5];
      int[] arr3Sort = new int[5];
      int[] arr4Sort = new int[5];
      int[] arr5Sort = new int[5];
  
		arrSort = sortArr(arr);
      arr2Sort = sortArr(arr2);
      arr3Sort = sortArr(arr3);
      arr4Sort = sortArr(arr4);
      arr5Sort = sortArr(arr5);
      for(int i = 0; i < arr.length; i++){
         
         System.out.print(arrSort[i]+ " ");
      }
	}
	
	public static int[] sortArr(int[] arr){
		if(arr.length > 0) {
		//make a copy of the parameter arr
		int [] temp = new int[arr.length];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}
		//sort the copy
		for(int i = 0; i < temp.length-1; i++) {
			int min = i;
			for(int j = i+1; j < temp.length; j++) {
				if(temp[min]>temp[j]) {
					min = j;
				}
			}
			int swap = temp[min];
			temp[min] = temp[i];
			temp[i] = swap;
		}
		//reverse the order of the sorted copy
		int[] result = new int[temp.length];
		int reverse = 0;
		for(int i = temp.length-1; i >=0; i--) {
			result[reverse] = temp[i];
			reverse++;
		}
		//return the reverse
		return result;
		}
		return null;
	}
}
