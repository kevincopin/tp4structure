public interface IntList {


    boolean isEmpty();

    IntList cons (int n);

    int length();

    String toString();

    void addInt(int n);

    IntList concat(IntList list);
}
