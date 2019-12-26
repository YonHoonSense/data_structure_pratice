package Algo_practice;
import java.util.Scanner;

class Min3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("3개의 수 최소값 구하기");
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.print("c의 값 : ");
        int c = stdIn.nextInt();
        stdIn.close();

        int min = a;
        
        if (min>b) min = b;
        if (min>c) min = c;

        System.out.println("최소값 : " + min);

    }
}