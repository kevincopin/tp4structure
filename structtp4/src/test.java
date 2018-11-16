public class test {

    public static void main(String [] args){
        IntList myList = new EmptyIntList().cons(3).cons(2).cons(1);
        IntList myList2 = new EmptyIntList().cons(3).cons(2).cons(0);
        IntList myList3 = myList.concat(myList2);
        System.out.println(myList3);
        myList2.addInt(3);
        System.out.println(myList3);
    }
}
