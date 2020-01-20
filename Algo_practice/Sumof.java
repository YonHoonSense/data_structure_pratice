package Algo_practice;

import java.util.Random;

class Sumof {

    static int SumofArray (int[] a){

        int sum = 0;

        for(int i=0; i<a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args){

        Random rand = new Random();

        int num = 1 + rand.nextInt(9); //rand 바운드를 10으로 할 경우 0이 나올수도 있기 때문에 1을 무조건 더해준다.
        System.out.println("요소의 갯수 : " + num);

        int arr[] = new int[num];

        for(int i=0; i<arr.length; i++){
            arr[i] = rand.nextInt(50);
            System.out.println("arr[" + i +"] : " + arr[i]);
        }
        
        System.out.println("배열 요소의 총 합 : " + SumofArray(arr));
    }
    
}