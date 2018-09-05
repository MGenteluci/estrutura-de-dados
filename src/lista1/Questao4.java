package lista1;

public class Questao4 {

	Elemento[] elementos = new Elemento[10];
	int fim = -1;
	
	void inserir(int n, boolean prioridade) {
		Elemento e = new Elemento(n, prioridade);
		
		fim++;
		elementos[fim] = e;
	}
	
	void listar() {
		for(int i = 0; i <= fim; i++)
			System.out.println(elementos[i].n + ":" + elementos[i].prioridade);
	}
	
	public static void main(String[] args) {

		Questao4 ls = new Questao4();
		
		ls.inserir(3, false);
		ls.inserir(2, true);
		ls.listar();
		
	}
}