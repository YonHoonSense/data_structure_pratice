package Algo_practice;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    public class EmptyIntStackException extends RuntimeException { // 예외처리, 스택이 비어 있을 때
        public EmptyIntStackException() {

        }
    }

    public class OverflowIntStackException extends RuntimeException { // 예외처리, 스택이 가득 차 있을 때
        public OverflowIntStackException() {

        }
    }

    public IntStack(int capacity) { // 생성자, ptr 초기화, max값은 capacity값으로 설정, 최대 max개의 요소를 가지는 스택 생성, 생성할 수 없을 때 예외처리
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException { // 스택에 x 값을 push, 스택이 가득 차 있을 경우 예외처리
        if (ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException { // 스택에서 데이터를 빼냄, 스택이 비어 있을 경우 예외처리
        if (ptr <= 0) 
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException { // 스택의 top값을 확인하는 메서드, 데이터의 입/출입이 없다.
        if (ptr <= 0) 
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    public int indexOf(int x) { // 스택에서 x값을 찾아 해당 인덱스를 반환한다, 값이 없을 경우 -1을 반환
        for(int i=ptr-1; i>=0; i--) {
            if (stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void clear() { // 스택의 모든 요소를 삭제, 푸시/팝 등 작업은 스택 포인터를 바탕으로 작동되기 때문에 포인터만 초기화하면 된다.
        ptr = 0;
    }

    public int capacity() { // 스택의 용량(max값)을 확인
        return max;
    }

    public int size() { // 스택의 데이터 수 확인 (현재 ptr값)
        return ptr;
    }
    
    public boolean isEmpty() { // 스택이 비어 있는지 확인
        return (ptr <= 0);
    }

    public boolean isFull() { // 스택이 가득 찼는지 확인
        return (ptr >= max);
    }
    
    public void dump() { // 스택 안에 있는 데이터를 모두 표시
        if (ptr <= 0) {
            System.out.println("스택이 비어 있습니다.");
        }
        else {
            for(int i=0; i<ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }


}



