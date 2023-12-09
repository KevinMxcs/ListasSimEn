
public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        lista.insertaPrimerNodo("H");
		lista.insertaAntesPrimerNodo("O");
		lista.insertaAlFinal("Y");
		lista.insertaEntreNodos("R", "A");
		lista.imprimir();
		System.out.print(lista);
        System.out.println("Buscando el nodo O y entregando su referencia");
            System.out.println(lista.nodoBuscValor("O"));
        System.out.println("Buscando un nodo por su campo clave e insertar un nuevo nodo después de él.");
        lista.insertDespDe("H", "Z");
        System.out.println("Intercambiando un nodo por otro buscado");
    }
}
