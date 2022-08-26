public class Node {
    private Node next;
    private String element;


    public Node() {
    }


    //Next : Returns the next Node or null if it doesn’t exist
    // ● Element : Returns the element inside

    //this element is last in the list
    public Node(String element) {
        this.element = element;
        next = null;
    }

    //this element is not the last since it has Node next
    public Node(String element, Node next) {
        this.element = element;
        this.next = next;
    }
    //Assume that the Node class’ elements are always STRINGS
    // The class must have these attributes:
    // ● next : Node | getter     ZITAEI KAI SETTER?????   <----- ?
    // ● element: String | getter / setter

    /**
     *
     * @return next node in line, null if doesn't exist
     */
    public Node getNext() {
        return next;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {  // Why setElement not blue like setNext??
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}