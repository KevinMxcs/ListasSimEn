
public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        lista.insertaPrimerNodo("H");
		lista.insertaAntesPrimerNodo("O");
		lista.insertaAlFinal("Y");
		lista.insertaEntreNodos("R", "A");
		lista.imprimir();
		System.out.print(lista);
            System.out.println(lista.nodoBuscValor("O"));
        lista.insertDespDe("H", "Z");
        lista.intercambiarNodos("O", "H");
        	lista.imprimir();
    }
}
