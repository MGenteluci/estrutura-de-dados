package lista4;

public class Fatorial {

	int calcular(int n) {
		
		if(n == 1)
			return 1;
	
		return n * calcular(n-1);
	}
	
	public static void main(String[] args) {
		
		Fatorial fatorial = new Fatorial();
		
		System.out.println(fatorial.calcular(5));
		
	}
}