
public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        lista.insertaPrimerNodo("H");
		lista.insertaAntesPrimerNodo("O");
		lista.insertaAlFinal("Y");
		lista.insertaEntreNodos("R", "A");
		lista.imprimir();
		System.out.print(lista);
            System.out.println(lista.nodoBuscValor("H"));
        lista.insertDespDe("H", "Z");
        lista.intercambiarNodos("O", "Q");
        	lista.imprimir();
            lista.borrarCualquierNodo("H");
            lista.imprimir();
    }
}
