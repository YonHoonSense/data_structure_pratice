import java.util.Scanner;

class MaxOfArray {

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

        Scanner stdIn = new Scanner(System.in);

        System.out.println("최댓값 구하기");
        System.out.print("숫자의 갯수 : ");
        int num = stdIn.nextInt();

        int[] Maxarray = new int[num];

        for(int i=0; i<Maxarray.length; i++){
            System.out.print("Maxarray["+i+"] : ");
            Maxarray[i] = stdIn.nextInt();
        }

        stdIn.close();

        System.out.println("배열 요소의 최댓값은 " + Maxof(Maxarray) + "입니다.");        

    }
}