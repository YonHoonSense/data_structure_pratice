package Algo_practice;

public class IntQueue {
    private int max; // 큐 용량
    private int front; // 큐의 첫 번째 요소 위치
    private int rear;  // 큐의 마지막 요소 위치
    private int datanum;  // 큐에 있는 데이터 수
    private int[] que; 

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    public IntQueue(int capacity) {
        
        datanum = front = rear = 0;
        max = capacity;

        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }

    }

    public int enque(int x) throws OverflowIntQueueException {
        if (datanum >= max) 
            throw new OverflowIntQueueException();
        
        que[rear++] = x;
        datanum++;

        if (rear == max)
            rear = 0;
        
        return x;
    }

    public int deque() throws EmptyIntQueueException {
        if (datanum <= 0) 
            throw new EmptyIntQueueException();
        
        int x = que[front++];
        datanum--;

        if (front == max)
            front = 0;

        return x;
    }

    public int peek() throws EmptyIntQueueException {
        if (datanum <= 0)
            throw new EmptyIntQueueException();
        
        return que[front];
    }

    public int indexOf(int x) {
        for (int i=0; i<datanum; i++) {
            int idx = (i + front) % max;
            if(que[idx] == x)
                return idx;
        }
        return -1;
    }

    public void clear() {
        datanum = front = rear = 0 ;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return datanum;
    }

    public boolean isEmpty() {
        return (datanum <= 0);
    }

    public boolean isFull() {
        return (datanum >= max);
    }

    public void dump() {
        if (datanum <= 0)
            System.out.println("큐가 비어 있습니다.");

        else {
            for (int i=0; i<datanum; i++) {
                System.out.print(que[(i+front)%max] + " ");
            }
            System.out.println();
        }
    }

}