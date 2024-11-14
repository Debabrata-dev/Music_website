class Program63{
public static void main(String[] args){
	int[] arr={12,15,14,13,17,18};
	int sum=0;
	
	for(int i=0;i<arr.length;i++){
		sum=sum+arr[i];
		
	}
	int avarage=sum/arr.length;	
	System.out.println(avarage);
	
}
}