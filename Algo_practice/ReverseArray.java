package Algo_practice;

import java.util.Scanner;

class ReverseArray {

    static void Swap(int[] a, int idx_1, int idx_2) {
        int t = a[idx_1];
        a[idx_1] = a[idx_2];
        a[idx_2] = t;
    }

    static void Reverse(int[] a) {
        for(int i=0; i<a.length/2; i++) {
            Swap(a, i, a.length-i-1);
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소의 갯수 : ");
        int num = stdIn.nextInt();

        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            System.out.print("arr[" + i + "] : ");
            arr[i] = stdIn.nextInt();
        }

        stdIn.close();

        Reverse(arr);

        System.out.println("요소를 역순으로 재배열");

        for(int i=0; i<num; i++){
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}