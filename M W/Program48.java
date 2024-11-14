class Program48{
static void display(int a){
	System.out.println(a);
	if(a<10){
		a++;
		display(a);
	}
}
public static void main (String[] args){
	display(1);
}
}