package Algo_practice;

import java.util.Scanner;

class Max4{
    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        System.out.println("4개의 수 최댓값 구하기");

        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.print("c의 값 : ");
        int c = stdIn.nextInt();
        System.out.print("d의 값 : ");
        int d = stdIn.nextInt();

        stdIn.close();

        int max = a;

        if (max<b) max = b;
        if (max<c) max = c;
        if (max<d) max = d;

        System.out.println("최댓값 : " + max);


    }

}

