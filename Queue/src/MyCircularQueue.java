class MyCircularQueue {
    
    int size;
    List<Integer> data;
    int head, tail;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        size = k;
        head = 0; 
        tail = 0;
        data = new ArrayList<Integer>();
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(tail == size-1){
            tail = 0;
            data[tail] = value;
        }
        else{
            tail += 1;
            data[tail] = value;
        }
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) return false;
        data[head] = null;
        if(head == size-1){
            head = 0;
        }
        else{
            head += 1;
        }
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return data[head];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        return data[tail];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(head == tail) return true;
        return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if((head > 0 && head-1 == tail)||(head == 0 & tail == size-1)) 
            return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */