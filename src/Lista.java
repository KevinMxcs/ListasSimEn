
public class Lista {
	Nodo top;

	//Métodos para los casos de inserción de nodos
	public boolean insertaPrimerNodo(String dato){
		if (top == null) { //La lista no está vacía
			top = new Nodo();
			top.name = dato;
			top.next = null;

			return true;
		}
		else {
			return false;
		}
	}

	public void insertaAntesPrimerNodo(String nombre){
		Nodo temp; 
		temp = new Nodo ();
		temp.name = nombre;
		temp.next = this.top;
		this.top = temp;
		temp = null;
	}

	public void insertaAlFinal(String nombre){
		Nodo temp = new Nodo ();
		temp.name = nombre;
		temp.next = null;
		//Node temp2;
		Nodo temp2 = this.top;

		while (temp2.next != null)
			temp2 = temp2.next;

		temp2.next = temp;
		temp = null;
		temp2 = null;
	}

	public boolean insertaEntreNodos(String nombre, String buscado){
		Nodo temp = new Nodo();
		temp.name = nombre;
		Nodo temp2 = this.top;

		//boolean NodoNoEncontrado = true;

		while ( (temp2 != null) 
				&& temp2.name.equals(buscado) == false ) {	
		         temp2 = temp2.next;
		}

		if (temp2 != null){  //Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
		}
		else return false;
	} 

	public void imprimir(){
		for (Nodo temp = this.top; temp != null; temp = temp.next){
			System.out.print("[ " + temp.name + " ] -> ");
		}

		System.out.print("[X]\n"); 
	}

	public String toString(){
		String cadAux = "";
		for (Nodo temp = this.top; temp != null; temp = temp.next){
			cadAux += "[ " + temp.name + " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}

	
	//Métodos de borrado
	public void borrarPrimerNodo(){
		this.top = this.top.next;
	}

	//Borrar cualquier nodo que no sea el primero
	public boolean borrarCualquierNodo(String buscado){
		Nodo temp = this.top;

		while ( (temp != null) 
				&& temp.name.equals(buscado) == false ) {	
		         temp = temp.next;
		}

		if (temp != null){  //Nodo buscado se encontró
			temp.next = temp.next.next;
			temp = null;
			
			return true;
		}
		else return false;
	}
    //Buscar por su valor de campo y devolver una referencia
    public Nodo nodoBuscValor (String valor){
        Nodo actual = top;
        while (actual != null ){
            if (actual.name.equals(valor)){
                return actual;
            
            }
            actual = actual.next;
        }
        return null;
    }
    //Buscar un nodo por su campo e insertar despues de el.
    public void insertDespDe(String valor, String newNodo) {
        Nodo actual = top;

        while (actual != null) {
            if (actual.name.equals(valor)) {
                // Nodo encontrado, insertar después de este nodo
                Nodo nuevoNodo = new Nodo();
                nuevoNodo.name = newNodo;
                nuevoNodo.next = actual.next;
                actual.next = nuevoNodo;
                return;
            }
            actual = actual.next;
        }
    }
        // Método para intercambiar un nodo por otro buscado
        public void intercambiarNodos(String valor, String newvalor) {
            if (top == null) {
                // La lista está vacía
                return;
            }
    
            // Buscar el nodo a intercambiar
            Nodo actual = top;
            Nodo nodoAnt = null;
    
            while (actual != null && !actual.name.equals(valor)) {
                nodoAnt = actual;
                actual = actual.next;
            }
    
            // Si no se encuentra el nodo a intercambiar, salir
            if (actual == null) {
                return;
            }
    
            // Crear el nuevo nodo con el valor deseado
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.name = newvalor;
    
            // Intercambiar el nodo encontrado con el nuevo nodo
            if (nodoAnt == null) {
                // El nodo a intercambiar es el primer nodo (cabeza)
                nuevoNodo.next = actual.next;
                top = nuevoNodo;
            } else {
                // El nodo a intercambiar no es el primer nodo
                nuevoNodo.next = actual.next;
                nodoAnt.next = nuevoNodo;
            }
        }
        
    }


