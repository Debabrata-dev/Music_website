class Program72{
public static void main(String[] args){
  String str="Debabarata";
int a=str.indexOf('e');
while(a!=-1){
	System.out.println(a);
	a=str.indexOf('e',a+1);
}

}
}