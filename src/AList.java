public class AList {
    //Create a class that resembles a list. A list is a data structure that is composed of Nodes which contain data.
    // The AList class needs to support these operations:
    // ● Head : Returns the first element in the list or the head --DONE??
    // ● Tail : Returns the last element of the list or the tail --DONE??
    // ● Get (int index) : Returns the element at position index
    // ● Remove (int index) : Removes the element at position index
    // ● Add (element) : Adds the element at the end of the list   --> DONE
    // ● Clear : Clears the list and leaves it empty  --> DONE

    // The AList must have these attributes:
    // ● Size | getter  --> DONE
    // ● Head : Node | getter  --> DONE
    // ● Tail : Node | getter  --> DONE

    private Node head;
    private Node tail;
    private int size;


    public AList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Head : Returns the first element in the list or the head --DONE??
    public Node head() {
        return head;
    }

    //Tail : Returns the last element of the list or the tail --DONE??
    public Node tail() {
        return tail;
    }
    public boolean add(String addme) {
        Node node = new Node(addme);
        if (size == 0) {
            this.head = this.tail = node;
        } else {
            this.tail.setNext(node);  //setNext recomendation, because of class Node.java where public void setNext????
            this.tail = node;

        }
        this.size++;
        return true;
    }

    // use the getter of element in the Node class (public String getElement)
    // use the index which is given (public boolean get(int index))
    // in order to return the element that will be in the position the index indicates
    public String get(int index) {
        if (this.size == 0)
            return null;
        //Need to start at the first element
        Node wanted = this.head();

        for (int local_index = 0; local_index < index; local_index++){
            wanted = wanted.getNext();
        }

        return wanted.getElement();
    }

    /**
     * Searching function, returns index of element found in list
     * @param toFind : String to find
     * @return index : int, place of string, -1 if not found
     */
    public int find(String toFind){
        if (this.size == 0)
            return -1;
        Node wanted = this.head();

        int index;
        for (index = 0; index < size; index++) {
            if (wanted.getElement() == toFind)
                return index;
            wanted = wanted.getNext();
        }
        return -1;
    }

    //Clear : Clears the list and leaves it empty
    public void clear() {
        this.head = this.tail = null;
    }

}
