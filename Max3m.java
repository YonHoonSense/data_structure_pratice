package Algo_practice;


class Max3m {
    static int Max3(int a, int b, int c){
        int max = a;
        if (b>max) max = b;
        if (c>max) max = c;

        return max;
    }

    public static void main(String[] args){
        System.out.println(Max3(7, 5, 9));
    }
}