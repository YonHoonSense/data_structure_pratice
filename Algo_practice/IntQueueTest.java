package Algo_practice;

import java.util.Scanner;

class IntQueueTest {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        IntQueue s = new IntQueue(64);

        while (true) {
            System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());

            System.out.println("(1) Enqueue  (2) Dequeue  (3) Peek  (4)  Dump  (0) Exit : ");

            int menu = stdIn.nextInt();

            if (menu == 0) break;

            int x;

            switch (menu) {
                
                case 1:
                    System.out.print("Enqueue할 데이터의 값 : ");
                    x = stdIn.nextInt();

                    try {
                        s.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
                
                case 2:
                    try {
                        x = s.deque();
                        System.out.println("Dequeue한 데이터는 " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("Peek한 데이터는 " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                
                case 4:
                    s.dump();
                    break;
            }


        }
        stdIn.close();
    }
}