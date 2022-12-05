public class manualLL {

    public Node head;
    public Node tail;

    public manualLL(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        else {
            return false;
        }
    }
    public void addToIndex(int number, int index){
        Node newNode = new Node(number);
        if (!isEmpty()){
            if (index == 0){
                newNode.next = head;
                head = newNode;
            }
            else {
                Node temp1 = null;
                Node temp2 = head;
                int currentIndex = 0;
                while ((temp2 != null)&&(currentIndex<index)){
                    temp1 = temp2;
                    temp2 = temp2.next;
                    currentIndex++;
                }
                if (temp2 == null){
                    tail.next = newNode;
                    tail = newNode;
                }
                else {
                    newNode.next = temp2;
                    temp1.next = newNode;
                }
            }
        }
        else {
            head = newNode;
            tail = newNode;
        }
    }

    public void addToFirst(int data){
        Node newNode = new Node(data);

        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addToLast(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public String toString() {
        return "FeaturesLL{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public void addSorted(int data){
        Node newNode = new Node(data);
        Node temp;
        //List is empty
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }
        // new data is smaller than head's data
        else if (head.data >= newNode.data){
                newNode.next = head;
                head = newNode;
            }
        else {
            temp = head;

            while ((temp.next != null) && (temp.next.data < newNode.data)){
                temp = temp.next;
            }
            newNode.next = temp.next;

            if (temp.next == null){
                temp.next = newNode;
                tail = newNode;
            }
            else {
                temp.next = newNode;
            }


        }
    }
    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}

