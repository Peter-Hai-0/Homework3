




public class Fibonacci {
	
	
	public static void main (String [] args){
	int i=1;
	int k=0;
	for(;;i++){
		k=Fibonacci.of(i);
		if(k>200) break;
		System.out.printf("Fibonacci(%d)=%d\n", i,k);
	}
	
	
	
	
	}
	
	
	
	public static int of(int num){
	if(num<0) return -1;	
	else if(num==0) return 0;
	else if(num<=2) return 1;	
	else return Fibonacci.of(num-1)+Fibonacci.of(num-2);
}
}

