public class NonEmptyIntList implements IntList {
    int head;
    IntList tail;

    public NonEmptyIntList() {
        this.head = head;
        this.tail = tail;
    }

    public int getHead() {
        return head;
    }

    public IntList getTail() {
        return tail;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public IntList cons(int head) {
        new NonEmptyIntList().cons(head);
        return this.tail;
    }

    @Override
    public int length() {
        int length;
        while (tail!=[]){
            length++;
            tail++;
        }
        return length;
    }

    @Override
    public String toString() {
    }

    void addInt(int n){
        while(tail!=[]){
            this.head=head+n;
            tail++;
        }
        return NonEmptyIntList();
    }

    IntList concat(IntList list){
            IntList firstList = new NonEmptyIntList().cons(head);
                    IntList secondList = new NonEmptyIntList().cons(head);
                    IntList thirdList = getTail(firstList).concat(secondList);
                    thirdList.cons(firstList.this.head);
    }

}