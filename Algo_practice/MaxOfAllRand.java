package Algo_practice;

import java.util.Random;

class MaxOfAllRand {

    static int Maxof(int[] a){

        int max = a[0];

        for(int i=1; i<a.length; i++){
            if(max<a[i]) {
                max = a[i];
            }
        }

        return max;
    }

    public static void main(String[] args){

        Random rand = new Random();

        System.out.println("최댓값 구하기");
        int num = 1 + rand.nextInt(9); //rand의 바운드를 10으로만 할 경우 0이 출력될 수 있기 때문에 1을 더해준다.
        System.out.println("숫자의 갯수 : " +num);

        int[] Maxarray = new int[num];

        for(int i=0; i<Maxarray.length; i++){
            Maxarray[i] = rand.nextInt(100);
            System.out.println("Maxarray["+i+"] : " + Maxarray[i]);
        }

        System.out.println("배열 요소의 최댓값은 " + Maxof(Maxarray) + "입니다.");        

    }
}