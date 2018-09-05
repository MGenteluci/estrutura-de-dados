package lista1;

/*
 * Problema: Implementar os métodos numa Lista Sequencial:
 * Inserir
 * Remover
 * Buscar
 * Listar
 */
public class Questao1 {

	int[] lista = new int[10];
	int fim = -1;
	
	int[] listaInvertida = new int[lista.length];
	
	void inserir(int n) {
		fim++;
		lista[fim] = n;
	}
	
	void removerUltimo() {
		fim--;
	}
	
	void buscar(int n) {
		
		for(int i = 0; i <= fim; i++) {
			if(n == lista[i]) {
				System.out.println("O número " + n + " está no índice: " + i);
				break;
			}
		}
		
	}
	
	void listar() {
		for(int i = 0; i <= fim; i++)
			System.out.print(lista[i] + " ");
		
		System.out.println("");
	}
	
	public static void main(String[] args) {

		Questao1 ls = new Questao1();
		
		ls.inserir(2);
		ls.inserir(3);
		ls.inserir(8);
		ls.inserir(7);
		ls.listar();
		ls.removerUltimo();
		ls.listar();
		ls.buscar(8);
		
	}
}