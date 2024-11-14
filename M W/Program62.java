class Program62{
public static void main(String[] args){
	int[] arr={12,15,14,13,17,18};
	int sum=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0){
		   sum=sum+arr[i];
		}	
	}
	System.out.println("Sum of the even Number"+sum);
}
}