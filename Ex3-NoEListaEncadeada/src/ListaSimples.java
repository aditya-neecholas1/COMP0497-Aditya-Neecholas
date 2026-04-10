public class ListaSimples {
    private Node head;

    public ListaSimples() {
        this.head = null;
    }

    /** Insere 'item' no INICIO da lista (O(1)). */
    public void insertFirst(Object item) {
        // TODO: crie um novo Node cujo 'next' aponta para o head atual
        Node newNode = new Node(item, head);
        // TODO: atualize head para apontar para o novo Node
        head = newNode;
    }

    /** Percorre a lista e imprime todos os elementos. */
    public void imprimir() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.item + " -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.insertFirst("C");
        lista.insertFirst("B");
        lista.insertFirst("A");
        lista.imprimir(); // A -> B -> C -> null
    }
}