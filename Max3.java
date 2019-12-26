package Algo_practice;
import java.util.Scanner;

class Max3 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("최댓값 구하기");
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.print("c의 값 : ");
        int c = stdIn.nextInt();

        stdIn.close();

        int max = a;
        if (b>max) max = b;
        if (c>max) max = c;

        System.out.println("최댓값 : " + max);
    }
}
