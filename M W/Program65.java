class Program65{
public static void main(String[] args){
	int[] arr={12,15,14,13,17,18};
	int large=arr[0];
	for(int i=1;i<arr.length;i++){
		if(arr[i]<large){
			large=arr[i];
		}
	}
	System.out.println("the smallest value is: "+large);
}
}