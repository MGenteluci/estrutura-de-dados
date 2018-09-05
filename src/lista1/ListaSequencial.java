package lista1;

public class ListaSequencial {

	int[] lista = {1, 5, 8, 2, 3};
	int[] listaInvertida = new int[lista.length];
	
	void inverterLista() {
		int j = 0;
		
		for(int i = lista.length-1; i >= 0; i--) {
			this.listaInvertida[j] = lista[i];
			j++;
		}
		
	}
	
	void mostrarListaInvertida() {
		for(int i = 0; i < listaInvertida.length; i++)
			System.out.print(listaInvertida[i] + " ");
	}
	
	public static void main(String[] args) {

		ListaSequencial ls = new ListaSequencial();
		
		ls.inverterLista();
		ls.mostrarListaInvertida();
		
	}
}