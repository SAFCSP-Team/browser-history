public class Stack {

    public Node top;

    public Stack() {
        this.top = null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        if (this.top == null) {
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }

    public String pop() {
        if (this.top == null) {
            return null;
        } else {
            String data = this.top.data;
            this.top = this.top.next;
            return data;
        }
    }

    public String peek() {
        if (this.top == null) {
            return null;
        } else {
            return this.top.data;
        }
    }
    
}
