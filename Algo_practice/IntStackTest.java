package Algo_practice;

import java.util.Scanner;

class IntStackTest {

    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        IntStack s = new IntStack(64);

        while (true) {
            System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
            System.out.print("(1) Push  (2) Pop  (3) Peek  (4) Dump  (0) Exit : ");

            int menu = stdIn.nextInt();
            
            if(menu == 0) break;

            int x;

            switch (menu) {
                
                case 1:
                    System.out.print("데이터 : ");
                    x = stdIn.nextInt();

                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                
                case 2:
                    try {
                        x = s.pop();
                        System.out.println("Pop한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("Peek한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
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