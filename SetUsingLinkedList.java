public class SetUsingLinkedList<T> implements SetInterface<T> {
    int numberOfElement;
    Node head;
    public class Node{
        T value;
        Node next;
        Node(){
            next = null;
        }
    }
    
    SetUsingLinkedList(){
       numberOfElement = 0;
       head = null;
    }
    
    @Override
    public int getCurrentSize(){
       return numberOfElement;
    };
    
    @Override
    public boolean isEmpty(){
        if(numberOfElement == 0){
            return true;
        }
        return false;
    }
    
    @Override
    public boolean add(T newEntry){
        Node NewNode = new Node();
        NewNode.value = newEntry;
        if(isEmpty()){
            head = NewNode;
            numberOfElement++;
            return true;
        }
        Node tmp = head;
        while (tmp.next != null) {
            if(tmp.value == newEntry){
                return false;
            }
            tmp = tmp.next;
        }
        if(tmp.value == newEntry){
            return false;
        }else{
            tmp.next = NewNode;
            numberOfElement++;
            return true;
        }
        
    }
    
    @Override
    public boolean remove(T anEntry){
        
        if(numberOfElement == 1){
            if(head.value == anEntry){
                head = null;
                numberOfElement--;
                return true;
            }
            return false;
        }
        if(numberOfElement == 0){
            return false;
        }
        Node tmp = head;
        if(anEntry == head.value){
            head = head.next;
            tmp.next = null;
            numberOfElement--;
            return true;
        }
        Node nextTmp = tmp.next;
        while (nextTmp != null) {
            if(nextTmp.value == anEntry){
                tmp.next = nextTmp.next;
                nextTmp.next = null;
                numberOfElement--;
                return true;
            }
            tmp = tmp.next;
            nextTmp = nextTmp.next;
        }
        return false;
    }
    
    @Override
    public void clear(){
        head = null;
        numberOfElement = 0;
    }
    
    @Override
    public boolean contains(T anEntry){
        Node tmp = head;
        while (tmp != null) {
            if(tmp.value == anEntry){
                return true;
            }
           tmp = tmp.next;
        }
        return false;
    }
    
    @Override
    public T[] toArray(){
        @SuppressWarnings("unchecked") T[] myarr = (T[]) new Object[numberOfElement];
        Node tmp = head;
        int num = 0;
        while (tmp != null) {
            myarr[num] = tmp.value;
            tmp = tmp.next;
            num++;
        }
        return myarr;
        
    }
}