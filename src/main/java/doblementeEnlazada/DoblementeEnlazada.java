package doblementeEnlazada;

public class DoblementeEnlazada {

	private Nodo head;
	private Nodo tail;
	private int contador = 0;

	public DoblementeEnlazada() {
		this.head = null;
		this.tail = null;
	}

	public void insertAtEnd(int data) {
		Nodo newNode = new Nodo(data);
		if (tail == null) {
			head = tail = newNode;
			contador++;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			contador++;
		}
	}

	public void insertAtBeginning(int data) {
		Nodo newNode = new Nodo(data);
		if (head == null) {
			head = tail = newNode;
			contador++;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			contador++;
		}
	}

	public boolean delete(int data) {
		Nodo current = head;
		while (current != null) {
			if (current.data == data) {
				if (current == head) {
					head = current.next;
					if (head != null)
						head.prev = null;
				} else if (current == tail) {
					tail = current.prev;
					if (tail != null)
						tail.next = null;
				} else {
					current.prev.next = current.next;
					current.next.prev = current.prev;
				}
				contador--;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public boolean search(int data) {
		Nodo current = head;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void displayForward() {
		Nodo current = head;
		while (current != null) {
			System.out.print(current.data + " <-> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public void displayBackward() {
		Nodo current = tail;
		while (current != null) {
			System.out.print(current.data + " <-> ");
			current = current.prev;
		}
		System.out.println("null");
	}
	
	// Método 1: Contar el número de nodos en la lista
	public int tamano() {
	    return contador;
	}

	// Método 2: Insertar un nodo después de un valor específico
	public void insertarEnMedio(int data, int posicion) {
	    Nodo nuevoNodo = new Nodo(data);

	    // Si la lista está vacía o la posición es 0, insertar al inicio
	    if (head == null || posicion == 0) {
	        insertAtBeginning(data);
	        return;
	    }

	    // Si la posición es mayor al tamaño de la lista, insertar al final
	    if (posicion > contador) {
	        insertAtEnd(data);
	        return;
	    }

	    Nodo temporal = head;

	    // Recorrer la lista hasta llegar a la posición deseada
	    for (int i = 0; i < posicion - 1; i++) {
	        temporal = temporal.next;
	    }

	    // Enlazar el nuevo nodo con los nodos adyacentes
	    nuevoNodo.next = temporal.next;
	    nuevoNodo.prev = temporal;

	    // Si el siguiente nodo no es nulo, ajustar su referencia anterior
	    if (temporal.next != null) {
	        temporal.next.prev = nuevoNodo;
	    }

	    // Conectar el nodo anterior al nuevo nodo
	    temporal.next = nuevoNodo;

	    // Incrementar el contador de nodos
	    contador++;
	}

	// Método 3: Revertir la lista doblemente enlazada
	public void revertir() {
	    // Si la lista está vacía o tiene solo un elemento, no hay nada que hacer
	    if (head == null || head.next == null) {
	        return;
	    }

	    Nodo actual = head;
	    Nodo temporal = null;

	    // Recorrer la lista e intercambiar las referencias next y prev de cada nodo
	    while (actual != null) {
	        temporal = actual.prev; // Guardamos la referencia del nodo previo
	        actual.prev = actual.next; // Intercambiamos prev con next
	        actual.next = temporal; // Intercambiamos next con prev
	        actual = actual.prev; // Avanzamos en la lista (que ahora está invertida)
	    }

	    // Ajustar la nueva cabeza de la lista
	    if (temporal != null) {
	        head = temporal.prev;
	    }

	    // Ajustar la nueva cola de la lista recorriendo desde la nueva cabeza
	    tail = head;
	    while (tail != null && tail.next != null) {
	        tail = tail.next;
	    }
	}
}
