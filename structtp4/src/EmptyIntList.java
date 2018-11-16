public class EmptyIntList implements IntList{

    public EmptyIntList(){

    }
    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public IntList cons(int head) {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }
    @Override
    public String toString() {
    }

    @Override
    public void addInt(int n) {

    }

    @Override
    public IntList concat(IntList list) {
        return null;
    }
}
