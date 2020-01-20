package Algo_practice;

import java.util.Scanner;

class EqualArray {

    static boolean Equals(int[] a, int[] b){

        if(a.length != b.length){
            return false;
        }
        for(int i=0; i<a.length; i++){
            if(a[i]!=b[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 a의 요소 개수 : ");
        int num_a = stdIn.nextInt();

        int[] a = new int[num_a];

        for(int i=0; i<a.length; i++){
            System.out.print("a["+i+"] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("배열 b의 요소 개수 : ");
        int num_b = stdIn.nextInt();

        int[] b = new int[num_b];

        for(int i=0; i<b.length; i++){
            System.out.print("b["+i+"] : ");
            b[i] = stdIn.nextInt();
        }

        stdIn.close();

        System.out.println("배열 a와 b는 서로" + (Equals(a, b) ? "같은 배열입니다." : "다른 배열입니다."));

    }
}