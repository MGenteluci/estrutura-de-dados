package lista4;

public class Fibonacci {

	int calcular(int n) {
		
		if(n == 0)
			return 0;
		
		if(n <= 2)
			return 1;
		
		return calcular(n-1)+calcular(n-2);
	}
	
	public static void main(String[] args) {

		Fibonacci f = new Fibonacci();
		
		System.out.println(f.calcular(6));
		
	}
}